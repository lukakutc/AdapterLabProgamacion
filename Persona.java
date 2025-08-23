public class Persona implements IPersona {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(int dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public int getDni() {
        return dni;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public int getEdad() {
        return edad;
    }
}