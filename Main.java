public class Main {
    public static void main(String[] args) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();

        // Crear 10 Personas normales
        for (int i = 0; i < 10; i++) {
            Persona persona = new Persona(10000000 + i, "Persona" + i, "Apellido" + i, 20 + i);
            baseDeDatos.guardarPersona(persona);
        }

        // Crear 10 CSVPersonas y sus adaptadores
        for (int i = 0; i < 10; i++) {
            String csvData = (20000000 + i) + ",CSVNombre" + i + ",CSVApellido" + i + "," + (25 + i);
            CSVPersona csvPersona = new CSVPersona(csvData);
            CSVPersonaAdapter csvAdapter = new CSVPersonaAdapter(csvPersona);
            baseDeDatos.guardarPersona(csvAdapter);
        }

        // Crear 10 XMLPersonas y sus adaptadores
        for (int i = 0; i < 10; i++) {
            String xmlData = "<persona><dni>" + (30000000 + i) + "</dni><nombre>XMLNombre" + i + 
                            "</nombre><apellido>XMLApellido" + i + "</apellido><edad>" + (30 + i) + "</edad></persona>";
            XMLPersona xmlPersona = new XMLPersona(xmlData);
            XMLPersonaAdapter xmlAdapter = new XMLPersonaAdapter(xmlPersona);
            baseDeDatos.guardarPersona(xmlAdapter);
        }

        // Mostrar todas las personas en la base de datos
        System.out.println("=== TODAS LAS PERSONAS EN LA BASE DE DATOS ===");
        baseDeDatos.mostrarPersonas();
    }
}