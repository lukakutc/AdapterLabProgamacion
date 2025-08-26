import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class BusquedaParalela extends RecursiveAction {
//Realiza una busqueda paralela en la base de datos para encontrar una persona por su DNI
    private static final int UMBRAL = 1000; // Umbral para dividir tareas
    private BaseDeDatos[] datos;
    private int inicio;
    private int fin;
    private int dniBuscado;
    private static volatile boolean encontrado = false; // Para evitar búsquedas innecesarias
    
    public BusquedaParalela(BaseDeDatos datos[] datos, int inicio, int fin, int dniBuscado) {
        this.datos = datos;
        this.inicio = inicio;
        this.fin = fin;
        this.dniBuscado = dniBuscado;
    }
    
    @Override
    protected void compute() {
        // Si ya se encontró en otra subtarea, terminar
        if (encontrado) {
            return;
        }
        if (fin - inicio <= UMBRAL) {
            buscarSecuencialmente();
        } else {
            int medio = (inicio + fin) / 2;
            
            BusquedaParalela izquierda = new BusquedaParalela(datos, inicio, medio, dniBuscado);
            BusquedaParalela derecha = new BusquedaParalela(datos, medio, fin, dniBuscado);
            
            // Ejecuta las subtareas en paralelo
            invokeAll(izquierda, derecha);
        }
    }
    
    private void buscarSecuencialmente() {
        // Realiza la búsqueda secuencialmente en el rango dado
        for (int i = inicio; i < fin && !encontrado; i++) {
            if (datos[i].getDni().equals(dniBuscado)) {
                if (!encontrado){
                encontrado = true;
                System.out.println("Se encuentra persona con el dni" + dniBuscado);
                System.out.println("Nombre: " + datos[i].getNombre());
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encuentra persona con el dni" + dniBuscado);
        }
    }
}