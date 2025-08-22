public class ColeccionCsv {
    // Colección de CSV
    private String[] datos = {"Juan,20", "Ana,30","Nahuel,22","Daniel,23","Luca,23"};
    private int index = 0;

    String extraer() {
        if (index < datos.length) {
            return datos[index++];
        }
        return null;
    }
}
