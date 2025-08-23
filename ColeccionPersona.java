public class ColeccionPersona {
    //base de datos principal.
    private Persona[] arrayPersona;
    int indice;

    public ColeccionPersona(){
        indice = 0;
        arrayPersona =  new Persona[100];
    }

    public boolean ponerPersona(Persona persona){
        boolean seCargo = false;
        if(persona.getEdad() >= 18){
            arrayPersona[indice++] = persona;
            seCargo = true;
        }
        return seCargo;
    }
    
    public String toString(){
        return arrayPersona.toString();
    }

}
