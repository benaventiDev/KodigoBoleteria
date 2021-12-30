package clases;

import interfaces.CarteleraInterface;

import java.util.ArrayList;

public class Cartelera implements CarteleraInterface {
    public int iD;
    public double precio;
    public ArrayList<String> carteleraPeliculas;

    public Cartelera(int iD, double precio, ArrayList<String> carteleraPeliculas) {
        this.iD = iD;
        this.precio = precio;
        this.carteleraPeliculas = carteleraPeliculas;
    }

    public int getID() {
        return iD;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getCarteleraPeliculas() {
        return carteleraPeliculas;
    }

    public void setCarteleraPeliculas(ArrayList<String> carteleraPeliculas) {
        this.carteleraPeliculas = carteleraPeliculas;
    }

    @Override
    public void filtroFecha() {

    }

    @Override
    public void hrDisponible() {

    }

    @Override
    public void mostrarPeliculas() {

    }
}
