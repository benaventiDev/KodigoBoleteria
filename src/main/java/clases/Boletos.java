package clases;
import interfaces.BoletosInterface;

import java.text.DecimalFormat;

public class Boletos extends Salas implements BoletosInterface {
    public double precio;
    public int nroSala, cantidad, iD, nroAsiento;
    public String pelicula;
    //hrFuncion
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public void factura() {
        // Logica de si es niño o adulto
    }
}
