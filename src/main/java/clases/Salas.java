package clases;

import interfaces.SalasInterface;

public class Salas implements SalasInterface {

    int nroAsientosTotales, nroSala;

    public Salas(int nroSala) {
        this.nroAsientosTotales = nroAsientosTotales;
        this.nroSala = nroSala;
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

    @Override
    public int nroAsientosDisponibles(int nroAsientosOcupados) {
        return (nroAsientosTotales - nroAsientosOcupados);
    }
}
