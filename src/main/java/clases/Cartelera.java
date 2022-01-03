package clases;

import interfaces.CarteleraInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cartelera implements CarteleraInterface {
    public int iD;
    public ArrayList<String> carteleraPeliculas;
    public Map<String, ArrayList<Object>> fechasDisponibles;
    public Map<Object, HashMap<String, ArrayList<Object>>> horasDisponibles;

    public Cartelera(int iD, ArrayList<String> carteleraPeliculas, Map<String, ArrayList<Object>> fechasDisponibles, Map<Object, HashMap<String, ArrayList<Object>>> horasDisponibles) {
        this.iD = iD;
        this.carteleraPeliculas = carteleraPeliculas;
        this.fechasDisponibles = fechasDisponibles;
        this.horasDisponibles = horasDisponibles;
    }

    public int getID() {
        return iD;
    }

    public Map<String, ArrayList<Object>> getFechasDisponibles() {
        return fechasDisponibles;
    }

    public void setFechasDisponibles(Map<String, ArrayList<Object>> fechasDisponibles) {
        this.fechasDisponibles = fechasDisponibles;
    }

    public Map<Object, HashMap<String, ArrayList<Object>>> getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(Map<Object, HashMap<String, ArrayList<Object>>> horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    public ArrayList<String> getCarteleraPeliculas() {
        return carteleraPeliculas;
    }

    public void setCarteleraPeliculas(ArrayList<String> carteleraPeliculas) {
        this.carteleraPeliculas = carteleraPeliculas;
    }

    @Override
    public ArrayList<Object> filtroFecha(String pelicula) {
        return getFechasDisponibles().get(pelicula);
    }

    @Override
    public ArrayList<Object> hrDisponible(String pelicula, LocalDate dia) {
        return getHorasDisponibles().get(dia).get(pelicula);
    }
}
