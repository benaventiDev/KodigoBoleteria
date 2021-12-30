package clases;

import interfaces.CarteleraInterface;

import java.util.ArrayList;
import java.util.Map;

public class Cartelera implements CarteleraInterface {
    public int iD;
    public ArrayList<String> carteleraPeliculas;
    public Map<Integer, ArrayList<Object>> fechasDisponibles;

    public Cartelera(int iD, ArrayList<String> carteleraPeliculas, Map<Integer, ArrayList<Object>> fechasDisponibles) {
        this.iD = iD;
        this.carteleraPeliculas = carteleraPeliculas;
        this.fechasDisponibles = fechasDisponibles;
    }

    public int getID() {
        return iD;
    }

    public Map<Integer, ArrayList<Object>> getFechasDisponibles() {
        return fechasDisponibles;
    }

    public void setFechasDisponibles(Map<Integer, ArrayList<Object>> fechasDisponibles) {
        this.fechasDisponibles = fechasDisponibles;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<String> getCarteleraPeliculas() {
        return carteleraPeliculas;
    }

    public void setCarteleraPeliculas(ArrayList<String> carteleraPeliculas) {
        this.carteleraPeliculas = carteleraPeliculas;
    }

    @Override
    public ArrayList<Object> filtroFecha(int eleccion) {
        return getFechasDisponibles().get(eleccion);
    }

    @Override
    public void hrDisponible() {

    }
}
