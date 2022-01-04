package org.example;

import clases.Boletos;
import clases.Cartelera;
import clases.Imprimir;
import clases.Salas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // INICIALIZO UN SCANNER PARA QUE EL USUARIO PUEDA INGRESAR DATOS
        Scanner scan = new Scanner(System.in);

        // A FALTA DE UNA DB ES NECESARIO CREAR Y CARGAR ARRAYS MANUALMENTE
        // PELICULAS DISPONIBLES EN CARTELERA
        ArrayList<String> peliculas = new ArrayList();
        peliculas.add("Psycho");
        peliculas.add("Vertigo");
        peliculas.add("Citizen Kane");
        peliculas.add("Casablanca");

        // FECHAS DISPONIBLES PARA CADA PELICULA EN CARTELERA
        ArrayList<Object> psychoFechas = new ArrayList();
        LocalDate psycho1 = LocalDate.of(2021, 12, 23);
        LocalDate psycho2 = LocalDate.of(2021, 12, 24);
        LocalDate psycho3 = LocalDate.of(2021, 12, 23);
        LocalDate psycho4 = LocalDate.of(2021, 12, 24);
        psychoFechas.add(psycho1);
        psychoFechas.add(psycho2);
        psychoFechas.add(psycho3);
        psychoFechas.add(psycho4);

        ArrayList<Object> vertigoFechas = new ArrayList();
        LocalDate vertigo1 = LocalDate.of(2021, 12, 23);
        LocalDate vertigo2 = LocalDate.of(2021, 12, 24);
        LocalDate vertigo3 = LocalDate.of(2021, 12, 23);
        LocalDate vertigo4 = LocalDate.of(2021, 12, 24);
        vertigoFechas.add(vertigo1);
        vertigoFechas.add(vertigo2);
        vertigoFechas.add(vertigo3);
        vertigoFechas.add(vertigo4);

        ArrayList<Object> citizenKaneFechas = new ArrayList();
        LocalDate citizenKane1 = LocalDate.of(2021, 12, 23);
        LocalDate citizenKane2 = LocalDate.of(2021, 12, 24);
        LocalDate citizenKane3 = LocalDate.of(2021, 12, 23);
        LocalDate citizenKane4 = LocalDate.of(2021, 12, 24);
        citizenKaneFechas.add(citizenKane1);
        citizenKaneFechas.add(citizenKane2);
        citizenKaneFechas.add(citizenKane3);
        citizenKaneFechas.add(citizenKane4);

        ArrayList<Object> casablancaFechas = new ArrayList();
        LocalDate casablanca1 = LocalDate.of(2021, 12, 23);
        LocalDate casablanca2 = LocalDate.of(2021, 12, 24);
        LocalDate casablanca3 = LocalDate.of(2021, 12, 23);
        LocalDate casablanca4 = LocalDate.of(2021, 12, 24);
        casablancaFechas.add(casablanca1);
        casablancaFechas.add(casablanca2);
        casablancaFechas.add(casablanca3);
        casablancaFechas.add(casablanca4);

        // CLAVE - VALOR PARA LLAMAR MEDIANTE UN ID LAS FECHAS DISPONIBLES DE UNA PELICULA
        HashMap<String, ArrayList<Object>> fechasLibres = new HashMap<>();
        fechasLibres.put("Psycho", psychoFechas);
        fechasLibres.put("Vertigo", vertigoFechas);
        fechasLibres.put("Citizen Kane", citizenKaneFechas);
        fechasLibres.put("Casablanca", casablancaFechas);

        // CLAVE - VALOR PARA LAS HORAS DISPONIBLES EN CADA FECHA
        HashMap<Object, HashMap<String, ArrayList<Object>>> horasLibres = new HashMap<>();
        HashMap<String, ArrayList<Object>> psychoHoras = new HashMap<>();
        ArrayList<Object> psychoTime = new ArrayList<Object>();
        LocalTime psychoTime1 = LocalTime.of(20, 30);
        LocalTime psychoTime2 = LocalTime.of(19, 00);
        LocalTime psychoTime3 = LocalTime.of(20, 30);
        LocalTime psychoTime4 = LocalTime.of(19, 00);
        psychoTime.add(psychoTime1);
        psychoTime.add(psychoTime2);
        psychoTime.add(psychoTime3);
        psychoTime.add(psychoTime4);
        psychoHoras.put("Psycho", psychoTime);
        horasLibres.put(psycho1, psychoHoras);
        horasLibres.put(psycho2, psychoHoras);
        horasLibres.put(psycho3, psychoHoras);
        horasLibres.put(psycho4, psychoHoras);

        HashMap<String, ArrayList<Object>> vertigoHoras = new HashMap<>();
        ArrayList<Object> vertigoTime = new ArrayList<Object>();
        LocalTime vertigoTime1 = LocalTime.of(20, 30);
        LocalTime vertigoTime2 = LocalTime.of(19, 00);
        LocalTime vertigoTime3 = LocalTime.of(20, 30);
        LocalTime vertigoTime4 = LocalTime.of(19, 00);
        vertigoTime.add(vertigoTime1);
        vertigoTime.add(vertigoTime2);
        vertigoTime.add(vertigoTime3);
        vertigoTime.add(vertigoTime4);
        vertigoHoras.put("Vertigo", vertigoTime);
        horasLibres.put(vertigo1, vertigoHoras);
        horasLibres.put(vertigo2, psychoHoras);
        horasLibres.put(vertigo3, psychoHoras);
        horasLibres.put(vertigo4, psychoHoras);

        HashMap<String, ArrayList<Object>> citizenKaneHoras = new HashMap<>();
        ArrayList<Object> citizenKaneTime = new ArrayList<Object>();
        LocalTime citizenKaneTime1 = LocalTime.of(20, 30);
        LocalTime citizenKaneTime2 = LocalTime.of(19, 00);
        LocalTime citizenKaneTime3 = LocalTime.of(20, 30);
        LocalTime citizenKaneTime4 = LocalTime.of(19, 00);
        citizenKaneTime.add(citizenKaneTime1);
        citizenKaneTime.add(citizenKaneTime2);
        citizenKaneTime.add(citizenKaneTime3);
        citizenKaneTime.add(citizenKaneTime4);
        citizenKaneHoras.put("Citizen Kane", citizenKaneTime);
        horasLibres.put(citizenKane1, citizenKaneHoras);
        horasLibres.put(citizenKane2, citizenKaneHoras);
        horasLibres.put(citizenKane3, citizenKaneHoras);
        horasLibres.put(citizenKane4, citizenKaneHoras);

        HashMap<String, ArrayList<Object>> casablancaHoras = new HashMap<>();
        ArrayList<Object> casablancaTime = new ArrayList<Object>();
        LocalTime casablancaTime1 = LocalTime.of(20, 30);
        LocalTime casablancaTime2 = LocalTime.of(19, 00);
        LocalTime casablancaTime3 = LocalTime.of(20, 30);
        LocalTime casablancaTime4 = LocalTime.of(19, 00);
        casablancaTime.add(casablancaTime1);
        casablancaTime.add(casablancaTime2);
        casablancaTime.add(casablancaTime3);
        casablancaTime.add(casablancaTime4);
        casablancaHoras.put("Casablanca", casablancaTime);
        horasLibres.put(casablanca1, casablancaHoras);
        horasLibres.put(casablanca2, casablancaHoras);
        horasLibres.put(casablanca3, casablancaHoras);
        horasLibres.put(casablanca4, casablancaHoras);

        ///////////////////////////////////////////////////////////////////////

        System.out.println("Bienvenido a Cinecode, ¿que pelicula desea ver? ");
        // SE INSTANCIAN LAS CLASES
        Cartelera cartelera = new Cartelera(10, peliculas, fechasLibres, horasLibres);
        Salas sala = new Salas();
        sala.setNroAsientosOcupados(10);

        System.out.println(cartelera.getCarteleraPeliculas());
        // EL USUARIO INGRESA UN ENTERO SEGUN LA POSICION DE LA PELICULA QUE SE MUESTRA EN PANTALLA
        String eleccion = scan.nextLine();
        sala.setNroSala((int) Math.round(Math.random() * (10 + 1)));

        System.out.println("Estos son las fechas disponibles para esa pelicula: ");
        // SE MUESTRAN EN PANTALLA LAS FECHAS DISPONIBLES PARA VER ESA PELICULA
        System.out.println(cartelera.filtroFecha(eleccion));

        // SE DEBE SELECCIONAR LA FECHA A LA QUE SE DESEA ASISTIR
        System.out.println("Seleccione la fecha a la que desea asistir: ");
        int eleccionInt = scan.nextInt();
        ArrayList<Object> horariosDisponibles = cartelera.hrDisponible(eleccion, (LocalDate) cartelera.filtroFecha(eleccion).get(eleccionInt - 1));
        System.out.println(horariosDisponibles);
        System.out.println("Seleccione el horario al que desea asistir");
        int eleccionInt2 = scan.nextInt();
        Object horario = cartelera.hrDisponible(eleccion, (LocalDate) cartelera.filtroFecha(eleccion).get(eleccionInt - 1)).get(eleccionInt2 - 1);
        System.out.println(horario);
        LocalDateTime dateFunction = LocalDateTime.of((LocalDate) cartelera.filtroFecha(eleccion).get(eleccionInt - 1), (LocalTime) horario);
        System.out.println("Ingrese la cantidad de boletos que desea: ");
        int cantidad = scan.nextInt();
        System.out.println("Ingrese si es mayor de edad: ");
        boolean mayor = scan.nextBoolean();
        Boletos ticket = new Boletos(cantidad, 3, mayor, dateFunction);
        System.out.println("Este es su ticket");
        String informacion = "Precio " + ticket.factura(cantidad) + " Asiento numero: " + ticket.nroAsiento(sala.getNroAsientosOcupados()) + " Numero de sala: " + sala.getNroSala();
        System.out.println(informacion);
        sala.setNroAsientosOcupados(cantidad);
        Imprimir impresora = new Imprimir();
        impresora.exportar(informacion);
        scan.close();
    }
}