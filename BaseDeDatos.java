import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class BaseDeDatos {
    private List<IPersona> array;
    private Semaphore mutex;

    public BaseDeDatos() {
        this.array = new ArrayList<>();
        this.mutex = new Semaphore(1);
    }

    public void guardarPersona(IPersona persona) {
        // guardar persona es un metodo Thread-Safe, es decir, apto concurrencia.
        // naturalmente, sin mutex arraylist no es concurrente.
        try {
            this.mutex.acquire(1);
            array.add(persona);
        } catch (InterruptedException e) {
        }

        mutex.release();
    }

    public void mostrarPersonas() {
        for (IPersona persona : array) {
            System.out.println("DNI: " + persona.getDni() +
                    ", Nombre: " + persona.getNombre() +
                    ", Apellido: " + persona.getApellido() +
                    ", Edad: " + persona.getEdad());
        }
    }
}