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

    @Override
    protected void compute() {
        if (personas.size() <= LIMITE) {
            for (XMLPersona persona : personas) {
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