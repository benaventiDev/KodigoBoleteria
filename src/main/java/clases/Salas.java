package clases;

import interfaces.SalasInterface;

public class Salas implements SalasInterface {

    int nroAsientosTotales, nroSala, nroAsientosOcupados;

    public Salas() {
        this.nroAsientosTotales = SalasInterface.nroAsientosTotales;
        this.nroSala = nroSala;
        this.nroAsientosOcupados = nroAsientosOcupados;
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

    public int getNroAsientosOcupados() {
        return nroAsientosOcupados;
    }

    public void setNroAsientosOcupados(int nroAsientosOcupados) {
        this.nroAsientosOcupados = nroAsientosOcupados + getNroAsientosOcupados();
    }

    @Override
    public int nroAsientosDisponibles(int nroAsientosOcupados) {
        return (nroAsientosTotales - nroAsientosOcupados);
    }
}
