package interfaces;

import java.time.LocalDate;
import java.util.ArrayList;

public interface CarteleraInterface {
    ArrayList<Object> filtroFecha(String pelicula);
    Object hrDisponible(String pelicula, LocalDate dia);
}
