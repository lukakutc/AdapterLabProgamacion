import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private List<IPersona> array;

    public BaseDeDatos() {
        this.array = new ArrayList<>();
    }

    public void guardarPersona(IPersona persona) {
        array.add(persona);
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