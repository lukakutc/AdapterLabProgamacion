import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
public class Main {
    public static void main(String[] args) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();

        // Crear 10 Personas normales con datos reales
        baseDeDatos.guardarPersona(new Persona(30123456, "Juan", "Pérez", 28));
        baseDeDatos.guardarPersona(new Persona(28987654, "María", "Gómez", 35));
        baseDeDatos.guardarPersona(new Persona(32123456, "Carlos", "López", 42));
        baseDeDatos.guardarPersona(new Persona(35123456, "Ana", "Martínez", 29));
        baseDeDatos.guardarPersona(new Persona(37123456, "Luis", "Rodríguez", 31));
        baseDeDatos.guardarPersona(new Persona(39123456, "Laura", "García", 26));
        baseDeDatos.guardarPersona(new Persona(41123456, "Pedro", "Sánchez", 39));
        baseDeDatos.guardarPersona(new Persona(43123456, "Sofía", "Fernández", 33));
        baseDeDatos.guardarPersona(new Persona(45123456, "Diego", "González", 45));
        baseDeDatos.guardarPersona(new Persona(47123456, "Elena", "Díaz", 27));

        // Crear 10 CSVPersonas con datos reales
        CSVPersona csv1 = new CSVPersona("50123456,Roberto,Silva,38");
        CSVPersona csv2 = new CSVPersona("52123456,Carolina,Mendoza,41");
        CSVPersona csv3 = new CSVPersona("54123456,Javier,Ruiz,32");
        CSVPersona csv4 = new CSVPersona("56123456,Isabel,Ortiz,29");
        CSVPersona csv5 = new CSVPersona("58123456,Ricardo,Vargas,36");
        CSVPersona csv6 = new CSVPersona("60123456,Patricia,Castro,43");
        CSVPersona csv7 = new CSVPersona("62123456,Andrés,Navarro,30");
        CSVPersona csv8 = new CSVPersona("64123456,Verónica,Ramos,34");
        CSVPersona csv9 = new CSVPersona("66123456,Fernando,Herrera,40");
        CSVPersona csv10 = new CSVPersona("68123456,Natalia,Morales,31");

        baseDeDatos.guardarPersona(new CSVPersonaAdapter(csv1));
        baseDeDatos.guardarPersona(new CSVPersonaAdapter(csv2));
        baseDeDatos.guardarPersona(new CSVPersonaAdapter(csv3));
        baseDeDatos.guardarPersona(new CSVPersonaAdapter(csv4));
        baseDeDatos.guardarPersona(new CSVPersonaAdapter(csv5));
        baseDeDatos.guardarPersona(new CSVPersonaAdapter(csv6));
        baseDeDatos.guardarPersona(new CSVPersonaAdapter(csv7));
        baseDeDatos.guardarPersona(new CSVPersonaAdapter(csv8));
        baseDeDatos.guardarPersona(new CSVPersonaAdapter(csv9));
        baseDeDatos.guardarPersona(new CSVPersonaAdapter(csv10));

        // Crear 10 XMLPersonas con datos reales
        XMLPersona xml1 = new XMLPersona("<persona><dni>70123456</dni><nombre>Gabriela</nombre><apellido>Torres</apellido><edad>37</edad></persona>");
        XMLPersona xml2 = new XMLPersona("<persona><dni>72123456</dni><nombre>Héctor</nombre><apellido>Flores</apellido><edad>44</edad></persona>");
        XMLPersona xml3 = new XMLPersona("<persona><dni>74123456</dni><nombre>Claudia</nombre><apellido>Reyes</apellido><edad>28</edad></persona>");
        XMLPersona xml4 = new XMLPersona("<persona><dni>76123456</dni><nombre>Mario</nombre><apellido>Jiménez</apellido><edad>32</edad></persona>");
        XMLPersona xml5 = new XMLPersona("<persona><dni>78123456</dni><nombre>Lucía</nombre><apellido>Santos</apellido><edad>39</edad></persona>");
        XMLPersona xml6 = new XMLPersona("<persona><dni>80123456</dni><nombre>Óscar</nombre><apellido>Guerrero</apellido><edad>45</edad></persona>");
        XMLPersona xml7 = new XMLPersona("<persona><dni>82123456</dni><nombre>Raquel</nombre><apellido>Méndez</apellido><edad>31</edad></persona>");
        XMLPersona xml8 = new XMLPersona("<persona><dni>84123456</dni><nombre>Francisco</nombre><apellido>Rojas</apellido><edad>36</edad></persona>");
        XMLPersona xml9 = new XMLPersona("<persona><dni>86123456</dni><nombre>Teresa</nombre><apellido>Medina</apellido><edad>42</edad></persona>");
        XMLPersona xml10 = new XMLPersona("<persona><dni>88123456</dni><nombre>Manuel</nombre><apellido>Vega</apellido><edad>29</edad></persona>");

        baseDeDatos.guardarPersona(new XMLPersonaAdapter(xml1));
        baseDeDatos.guardarPersona(new XMLPersonaAdapter(xml2));
        baseDeDatos.guardarPersona(new XMLPersonaAdapter(xml3));
        baseDeDatos.guardarPersona(new XMLPersonaAdapter(xml4));
        baseDeDatos.guardarPersona(new XMLPersonaAdapter(xml5));
        baseDeDatos.guardarPersona(new XMLPersonaAdapter(xml6));
        baseDeDatos.guardarPersona(new XMLPersonaAdapter(xml7));
        baseDeDatos.guardarPersona(new XMLPersonaAdapter(xml8));
        baseDeDatos.guardarPersona(new XMLPersonaAdapter(xml9));
        baseDeDatos.guardarPersona(new XMLPersonaAdapter(xml10));

        // Mostrar todas las personas en la base de datos
        baseDeDatos.mostrarPersonas();

        //Busca una persona por su DNI
        int dniBuscado = 45123456; // DNI a buscar
        ForkJoinPool pool = new ForkJoinPool(); // Crear un ForkJoinPool
        BusquedaParalela tarea = new BusquedaParalela(baseDeDatos, 0, baseDeDatos.size, dniBuscado);
        pool.invoke(tarea); // Iniciar la búsqueda paralela
    }
}