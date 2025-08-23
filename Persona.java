public class Persona implements IPersona {
    //atributos
    private int edad;
    private String nombre;

    //constructor
    public Persona(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }
    //Metodos
    
    public int getEdad(){
        return edad;
    }
    
}
