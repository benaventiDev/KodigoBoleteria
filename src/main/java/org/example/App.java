package org.example;

import clases.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class App
{
    public static int randomNum(int num) {
        return (int) Math.round(Math.random() * (num + 1));
    }

    public static void main( String[] args )
    {
        DB database = new DB();
        database.inicializarDB();

        boolean continuar = true;

        ArrayList<String> informacion = new ArrayList<>();
        System.out.println("Bienvenido a Cinecode, ¿que pelicula desea ver? ");

        Scanner scan = new Scanner(System.in);
        
        while (continuar) {
            Cartelera cartelera = new Cartelera((int) randomNum(10), database.getPeliculas(), database.getFechasLibres(), database.getHorasLibres());
            Salas sala = new Salas();
            sala.setNroAsientosOcupados(randomNum(sala.getNroAsientosTotales()));

            try {
                System.out.println(cartelera.getCarteleraPeliculas());

                String eleccion = scan.next().toLowerCase();
                sala.setNroSala(randomNum(10));

                System.out.println("Estos son las fechas disponibles para esa pelicula: ");
                System.out.println(cartelera.filtroFecha(eleccion));
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
                Boletos ticket = new Boletos(cantidad, randomNum(100), mayor, dateFunction);

                System.out.println("Este es su ticket");

                String data = "Precio " + ticket.factura(cantidad) + " Numero de asiento: " + sala.nroAsiento(sala.getNroAsientosOcupados()) + " Numero de sala: " + sala.getNroSala();
                informacion.add(data);

                System.out.println(informacion);

                sala.setNroAsientosOcupados(cantidad);

                System.out.println("¿Desea realizar otra compra?");

                continuar = scan.nextBoolean();
            } catch (Exception e) {
                System.out.println("Algo no anda bien: " + e);
            }
        }
        Imprimir impresora = new Imprimir();
        impresora.exportar(String.valueOf(informacion));
        scan.close();
    }
}