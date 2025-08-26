import java.util.List;
import java.util.concurrent.RecursiveAction;

public class ConcuPersonasCSV extends RecursiveAction {
    private static final int LIMITE = 2;
    private List<CSVPersona> personas;
    private BaseDeDatos baseDeDatos;
    
    public ConcuPersonasCSV(List<CSVPersona> personas, BaseDeDatos baseDeDatos) {
        this.personas = personas;
        this.baseDeDatos = baseDeDatos;
    }

    @Override
    protected void compute() {
        if (personas.size() <= LIMITE) {
            for (CSVPersona persona : personas) {
                baseDeDatos.guardarPersona(new CSVPersonaAdapter(persona));
            }
        } else {
            int mid = personas.size() / 2;
            
            ConcuPersonasCSV tarea1 = new ConcuPersonasCSV(
                personas.subList(0, mid), baseDeDatos
            );
            
            ConcuPersonasCSV tarea2 = new ConcuPersonasCSV(
                personas.subList(mid, personas.size()), baseDeDatos
            );
            
            invokeAll(tarea1, tarea2);
        }
    }
}