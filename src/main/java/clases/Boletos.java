package clases;
import interfaces.BoletosInterface;

public class Boletos<T> extends Salas implements BoletosInterface {
    public int cantidad, iD;
    public boolean adulto;
    public final T fechaFuncion;

    public Boletos(int cantidad, int iD, boolean adulto, T fechaFuncion) {
        this.cantidad = cantidad;
        this.iD = iD;
        this.adulto = adulto;
        this.fechaFuncion = fechaFuncion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getiD() {
        return iD;
    }

    public boolean isAdulto() {
        return adulto;
    }

    public void setAdulto(boolean adulto) {
        this.adulto = adulto;
    }

    public T getFechaFuncion() {
        return fechaFuncion;
    }

    @Override
    public double factura(int cantidad) {
        if (this.adulto) { return precio * 0.70 * cantidad; }
        else return precio * cantidad;
    }

    @Override
    public int nroAsiento(int asientosOcupados) {
        Salas cine = new Salas();
        return (int) Math.round(Math.random() * (cine.nroAsientosDisponibles(asientosOcupados) + 1));
    }
}
