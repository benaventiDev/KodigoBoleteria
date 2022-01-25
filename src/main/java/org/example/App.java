package org.example;

import clases.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


@SuppressWarnings("ALL")
public class App
{
    public static int randomNum(int num) {
        return (int) Math.round(Math.random() * (num + 1));
    }

    public static Logger log(String text) {
        BasicConfigurator.configure();
        Logger log = Logger.getLogger(text);
        return log;
    }

    public static void main( String[] args )
    {
        DB database = new DB();
        database.inicializarDB();

        boolean continuar = true;
        Logger log = log("Mensaje");

        ArrayList<String> informacion = new ArrayList<>();
        log.info("Bienvenido a Cinecode, ¿que pelicula desea ver? ");

        Scanner scan = new Scanner(System.in);
        
        while (continuar) {
            Cartelera cartelera = new Cartelera((int) randomNum(10), database.getPeliculas(), database.getFechasLibres(), database.getHorasLibres());
            Salas sala = new Salas();
            sala.setNroAsientosOcupados(randomNum(sala.getNroAsientosTotales()));

            try {
                log.info(cartelera.getCarteleraPeliculas());

                String eleccion = scan.next().toLowerCase();
                sala.setNroSala(randomNum(10));

                log.info("Estos son las fechas disponibles para esa pelicula: ");
                log.info(cartelera.filtroFecha(eleccion));
                log.info("Seleccione la fecha a la que desea asistir: ");

                int eleccionInt = scan.nextInt();
                ArrayList<Object> horariosDisponibles = cartelera.hrDisponible(eleccion, (LocalDate) cartelera.filtroFecha(eleccion).get(eleccionInt - 1));

                log.info(horariosDisponibles);
                log.info("Seleccione el horario al que desea asistir");

                int eleccionInt2 = scan.nextInt();
                Object horario = cartelera.hrDisponible(eleccion, (LocalDate) cartelera.filtroFecha(eleccion).get(eleccionInt - 1)).get(eleccionInt2 - 1);

                log.info(horario);

                LocalDateTime dateFunction = LocalDateTime.of((LocalDate) cartelera.filtroFecha(eleccion).get(eleccionInt - 1), (LocalTime) horario);

                log.info("Ingrese la cantidad de boletos que desea: ");

                int cantidad = scan.nextInt();

                log.info("Ingrese si es mayor de edad: ");

                boolean mayor = scan.nextBoolean();
                Boletos ticket = new Boletos(cantidad, randomNum(100), mayor, dateFunction);

                log.info("Este es su ticket");

                String data = "Precio " + ticket.factura(cantidad) + " Numero de asiento: " + sala.nroAsiento(sala.getNroAsientosOcupados()) + " Numero de sala: " + sala.getNroSala();
                informacion.add(data);

                log.info(informacion);

                sala.setNroAsientosOcupados(cantidad);

                log.info("¿Desea realizar otra compra?");

                continuar = scan.nextBoolean();
            } catch (Exception e) {
                log.warn("Algo no anda bien: " + e);
            }
        }
        Imprimir impresora = new Imprimir();
        impresora.exportar(String.valueOf(informacion));
        scan.close();
    }
}