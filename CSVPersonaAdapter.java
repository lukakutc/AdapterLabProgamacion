public class CSVPersonaAdapter implements IPersona {
    private CSVPersona csvPersonaAdaptado;

    public CSVPersonaAdapter(CSVPersona csvPersona) {
        this.csvPersonaAdaptado = csvPersona;
    }

    @Override
    public int getDni() {
        // Formato CSV esperado: "dni,nombre,apellido,edad"
        String[] datos = csvPersonaAdaptado.getCSVData().split(",");
        return Integer.parseInt(datos[0].trim());
    }

    @Override
    public String getNombre() {
        String[] datos = csvPersonaAdaptado.getCSVData().split(",");
        return datos[1].trim();
    }

    @Override
    public String getApellido() {
        String[] datos = csvPersonaAdaptado.getCSVData().split(",");
        return datos[2].trim();
    }

    @Override
    public int getEdad() {
        String[] datos = csvPersonaAdaptado.getCSVData().split(",");
        return Integer.parseInt(datos[3].trim());
    }
}