package clases;
import interfaces.BoletosInterface;

public class Boletos<T> implements BoletosInterface {
    public int cantidad, iD;
    public boolean adulto, subtitulos;
    public final T fechaFuncion;

    public Boletos(int cantidad, int iD, boolean adulto, boolean subtitulos, T fechaFuncion) {
        this.cantidad = cantidad;
        this.iD = iD;
        this.adulto = adulto;
        this.subtitulos = subtitulos;
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

    public boolean isSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(boolean subtitulos) {
        this.subtitulos = subtitulos;
    }

    public T getFechaFuncion() {
        return fechaFuncion;
    }

    @Override
    public void factura() {
        // Logica de si es niño o adulto
    }

    @Override
    public void nroAsiento() {

    }

    @Override
    public void nroSala() {

    }

    @Override
    public void getPelicula() {

    }
}
