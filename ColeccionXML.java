public class ColeccionXML {

    private String[] datos = {
        "<persona><nombre>Emanuel</nombre><edad>10</edad></persona>",
        "<persona><nombre>Natalia</nombre><edad>22</edad></persona>",
        "<persona><nombre>Romina</nombre><edad>29</edad></persona>"
    };
    private int index = 0;

    String extraer() {
        if (index < datos.length) {
            return datos[index++];
        }
        return null;
    }
}
