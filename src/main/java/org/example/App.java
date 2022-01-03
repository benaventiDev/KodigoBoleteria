package org.example;

import clases.Boletos;
import clases.Cartelera;
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
        psychoFechas.add(psycho1);
        psychoFechas.add(psycho2);

        // CLAVE - VALOR PARA LLAMAR MEDIANTE UN ID LAS FECHAS DISPONIBLES DE UNA PELICULA
        HashMap<String, ArrayList<Object>> fechasLibres = new HashMap<>();
        fechasLibres.put("Psycho", psychoFechas);

        // CLAVE - VALOR PARA LAS HORAS DISPONIBLES EN CADA FECHA
        HashMap<Object, HashMap<String, ArrayList<Object>>> horasLibres = new HashMap<>();
        HashMap<String, ArrayList<Object>> psychoHoras = new HashMap<>();
        ArrayList<Object> psychoTime = new ArrayList<Object>();
        LocalTime psychoTime1 = LocalTime.of(20, 30);
        LocalTime psychoTime2 = LocalTime.of(19, 00);
        psychoTime.add(psychoTime1);
        psychoTime.add(psychoTime2);
        psychoHoras.put("Psycho", psychoTime);
        horasLibres.put(psycho1, psychoHoras);

        ///////////////////////////////////////////////////////////////////////

        System.out.println("Bienvenido a Cinecode, ¿que pelicula desea ver? ");
        // SE INSTANCIAN LAS CLASES
        Cartelera cartelera = new Cartelera(10, peliculas, fechasLibres, horasLibres);
        Salas sala = new Salas(6);

        System.out.println(cartelera.getCarteleraPeliculas());
        // EL USUARIO INGRESA UN ENTERO SEGUN LA POSICION DE LA PELICULA QUE SE MUESTRA EN PANTALLA
        String eleccion = scan.nextLine();

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
        System.out.println("Precio" + ticket.factura() + "Asiento: ");
    }
}