package clases;

import interfaces.SalasInterface;

public class Salas implements SalasInterface {

    int nroAsientosTotales, nroSala;
    boolean subtitulos;

    public Salas() {
        this.nroAsientosTotales = nroAsientosTotales;
        this.nroSala = nroSala;
        this.subtitulos = subtitulos;
    }

    public int getNroAsientosTotales() {
        return nroAsientosTotales;
    }

    public void setNroAsientosTotales(int nroAsientosTotales) {
        this.nroAsientosTotales = nroAsientosTotales;
    }

    public int getNroSala() {
        return nroSala;
    }

    public void setNroSala(int nroSala) {
        this.nroSala = nroSala;
    }

    public boolean isSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(boolean subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public void nroAsientosDisponibles() {
        // Logica para calcular los asientos disponibles
        // en relacion a la pelicula, sala y horario
    }

}
