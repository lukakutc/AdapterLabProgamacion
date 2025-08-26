import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        List<XMLPersona> personasXML = new ArrayList<>();
        List<CSVPersona> personasCSV = new ArrayList<>();
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


        // Crear 10 CSVPersonas adicionales con datos reales
    CSVPersona csv11 = new CSVPersona("71123456,Diego,Contreras,33");
    CSVPersona csv12 = new CSVPersona("73123456,Valeria,Paredes,27");
    CSVPersona csv13 = new CSVPersona("75123456,Sergio,Zúñiga,41");
    CSVPersona csv14 = new CSVPersona("77123456,Daniela,Sepúlveda,35");
    CSVPersona csv15 = new CSVPersona("79123456,Miguel,Valenzuela,38");
    CSVPersona csv16 = new CSVPersona("81123456,Camila,Tapia,26");
    CSVPersona csv17 = new CSVPersona("83123456,Alejandro,Cortés,44");
    CSVPersona csv18 = new CSVPersona("85123456,Paula,Fuentes,31");
    CSVPersona csv19 = new CSVPersona("87123456,Cristián,Araya,39");
    CSVPersona csv20 = new CSVPersona("89123456,Antonella,Sandoval,28");

    // Crear 10 XMLPersonas adicionales con datos reales
    XMLPersona xml11 = new XMLPersona("<persona><dni>90123456</dni><nombre>Eduardo</nombre><apellido>Miranda</apellido><edad>34</edad></persona>");
    XMLPersona xml12 = new XMLPersona("<persona><dni>92123456</dni><nombre>Bárbara</nombre><apellido>Vera</apellido><edad>29</edad></persona>");
    XMLPersona xml13 = new XMLPersona("<persona><dni>94123456</dni><nombre>Renato</nombre><apellido>Olivares</apellido><edad>42</edad></persona>");
    XMLPersona xml14 = new XMLPersona("<persona><dni>96123456</dni><nombre>Constanza</nombre><apellido>Salazar</apellido><edad>36</edad></persona>");
    XMLPersona xml15 = new XMLPersona("<persona><dni>98123456</dni><nombre>Felipe</nombre><apellido>Peña</apellido><edad>40</edad></persona>");
    XMLPersona xml16 = new XMLPersona("<persona><dni>99123456</dni><nombre>Javiera</nombre><apellido>Cáceres</apellido><edad>25</edad></persona>");
    XMLPersona xml17 = new XMLPersona("<persona><dni>99123457</dni><nombre>Rodrigo</nombre><apellido>Figueroa</apellido><edad>43</edad></persona>");
    XMLPersona xml18 = new XMLPersona("<persona><dni>99123458</dni><nombre>Macarena</nombre><apellido>Espinoza</apellido><edad>30</edad></persona>");
    XMLPersona xml19 = new XMLPersona("<persona><dni>99123459</dni><nombre>Gonzalo</nombre><apellido>Gallardo</apellido><edad>37</edad></persona>");
    XMLPersona xml20 = new XMLPersona("<persona><dni>99123460</dni><nombre>Florencia</nombre><apellido>Parra</apellido><edad>32</edad></persona>");

    personasCSV.add(csv11);
    personasCSV.add(csv12);
    personasCSV.add(csv13);
    personasCSV.add(csv14);
    personasCSV.add(csv15);
    personasCSV.add(csv16);
    personasCSV.add(csv17);
    personasCSV.add(csv18);
    personasCSV.add(csv19);
    personasCSV.add(csv20);
    personasXML.add(xml11);
    personasXML.add(xml12);
    personasXML.add(xml13);
    personasXML.add(xml14);
    personasXML.add(xml15);
    personasXML.add(xml16);
    personasXML.add(xml17);
    personasXML.add(xml18);
    personasXML.add(xml19);
    personasXML.add(xml20);

    BaseDeDatos baseDeDatosConcurrente = new BaseDeDatos();

     // Procesar XML
        ConcuPersonasXML tareaXML = new ConcuPersonasXML(personasXML, baseDeDatosConcurrente);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(tareaXML);
        
        // Procesar CSV
        ConcuPersonasCSV tareaCSV = new ConcuPersonasCSV(personasCSV, baseDeDatosConcurrente);
        pool.invoke(tareaCSV);

        // Mostrar todas las personas en la base de datos concurrente
        System.out.println("\nPersonas en la base de datos concurrente:");
        baseDeDatosConcurrente.mostrarPersonas();
    }

}