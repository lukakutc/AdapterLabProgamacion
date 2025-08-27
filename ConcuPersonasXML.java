import java.util.List;
import java.util.concurrent.RecursiveAction;

public class ConcuPersonasXML extends RecursiveAction {
    private static final int LIMITE = 2;
    private List<XMLPersona> personas;
    private BaseDeDatos baseDeDatos;
    
    public ConcuPersonasXML(List<XMLPersona> personas, BaseDeDatos baseDeDatos) {
        this.personas = personas;
        this.baseDeDatos = baseDeDatos;
    }

    protected void compute() {
        System.out.println(Thread.currentThread().getName() + 
                      " procesando " + personas.size() + " elementos de XML");
        if (personas.size() <= LIMITE) {
            for (XMLPersona persona : personas) {
                System.out.println(Thread.currentThread().getName() + " guardando persona en lista XML");
                baseDeDatos.guardarPersona(new XMLPersonaAdapter(persona));
            }
        } else {
            int mid = personas.size() / 2;
            
            ConcuPersonasXML tarea1 = new ConcuPersonasXML(
                personas.subList(0, mid), baseDeDatos
            );
            
            ConcuPersonasXML tarea2 = new ConcuPersonasXML(
                personas.subList(mid, personas.size()), baseDeDatos
            );
            
            invokeAll(tarea1, tarea2);
        }
    }
}