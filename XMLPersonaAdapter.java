public class XMLPersonaAdapter implements IPersona {
    private XMLPersona xmlPersonaAdaptado;

    public XMLPersonaAdapter(XMLPersona xmlPersona) {
        this.xmlPersonaAdaptado = xmlPersona;
    }

    @Override
    public int getDni() {
        // Formato XML esperado: "<persona><dni>123</dni><nombre>Juan</nombre>..."
        String xml = xmlPersonaAdaptado.getXMLData();
        int inicio = xml.indexOf("<dni>") + 5;
        int fin = xml.indexOf("</dni>");
        return Integer.parseInt(xml.substring(inicio, fin).trim());
    }

    @Override
    public String getNombre() {
        String xml = xmlPersonaAdaptado.getXMLData();
        int inicio = xml.indexOf("<nombre>") + 8;
        int fin = xml.indexOf("</nombre>");
        return xml.substring(inicio, fin).trim();
    }

    @Override
    public String getApellido() {
        String xml = xmlPersonaAdaptado.getXMLData();
        int inicio = xml.indexOf("<apellido>") + 10;
        int fin = xml.indexOf("</apellido>");
        return xml.substring(inicio, fin).trim();
    }

    @Override
    public int getEdad() {
        String xml = xmlPersonaAdaptado.getXMLData();
        int inicio = xml.indexOf("<edad>") + 6;
        int fin = xml.indexOf("</edad>");
        return Integer.parseInt(xml.substring(inicio, fin).trim());
    }
}