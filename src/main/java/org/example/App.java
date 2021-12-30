package org.example;

import clases.Cartelera;

import java.time.LocalDateTime;
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
        LocalDateTime Psycho1 = LocalDateTime.of(2021, 12, 23, 20, 30);
        psychoFechas.add(Psycho1);

        // CLAVE - VALOR PARA LLAMAR MEDIANTE UN ID LAS FECHAS DISPONIBLES DE UNA PELICULA
        HashMap<Integer, ArrayList<Object>> fechasLibres = new HashMap<>();
        fechasLibres.put(1, psychoFechas);

        System.out.println("Bienvenido a Cinecode, ¿que pelicula desea ver? ");
        // SE INSTANCIA LA CLASE CARTELERA
        Cartelera cartelera = new Cartelera(10, peliculas, fechasLibres);

        System.out.println(cartelera.getCarteleraPeliculas());
        // EL USUARIO INGRESA UN ENTERO SEGUN LA POSICION DE LA PELICULA QUE SE MUESTRA EN PANTALLA
        int eleccion = scan.nextInt();

        System.out.println("Estos son las fechas disponibles para esa pelicula: ");
        // SE MUESTRAN EN PANTALLA LAS FECHAS DISPONIBLES PARA VER ESA PELICULA
        System.out.println(cartelera.filtroFecha(eleccion));

    }
}
