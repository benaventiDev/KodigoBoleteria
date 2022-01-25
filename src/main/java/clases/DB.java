package clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class DB {
    ArrayList<String> peliculas = new ArrayList();
    HashMap<String, ArrayList<Object>> fechasLibres = new HashMap<>();
    HashMap<Object, HashMap<String, ArrayList<Object>>> horasLibres = new HashMap<>();

    public void inicializarDB() {
        peliculas.add("psycho");
        peliculas.add("vertigo");
        peliculas.add("citizen-kane");
        peliculas.add("casablanca");

        ArrayList<Object> psychoFechas = new ArrayList();
        LocalDate psycho1 = LocalDate.of(2021, 12, 11);
        LocalDate psycho2 = LocalDate.of(2021, 11, 12);
        LocalDate psycho3 = LocalDate.of(2021, 10, 13);
        LocalDate psycho4 = LocalDate.of(2021, 9, 14);
        psychoFechas.add(psycho1);
        psychoFechas.add(psycho2);
        psychoFechas.add(psycho3);
        psychoFechas.add(psycho4);

        ArrayList<Object> vertigoFechas = new ArrayList();
        LocalDate vertigo1 = LocalDate.of(2021, 8, 10);
        LocalDate vertigo2 = LocalDate.of(2021, 7, 7);
        LocalDate vertigo3 = LocalDate.of(2021, 6, 6);
        LocalDate vertigo4 = LocalDate.of(2021, 5, 5);
        vertigoFechas.add(vertigo1);
        vertigoFechas.add(vertigo2);
        vertigoFechas.add(vertigo3);
        vertigoFechas.add(vertigo4);

        ArrayList<Object> citizenKaneFechas = new ArrayList();
        LocalDate citizenKane1 = LocalDate.of(2021, 4, 1);
        LocalDate citizenKane2 = LocalDate.of(2021, 3, 2);
        LocalDate citizenKane3 = LocalDate.of(2021, 2, 3);
        LocalDate citizenKane4 = LocalDate.of(2021, 1, 4);
        citizenKaneFechas.add(citizenKane1);
        citizenKaneFechas.add(citizenKane2);
        citizenKaneFechas.add(citizenKane3);
        citizenKaneFechas.add(citizenKane4);

        ArrayList<Object> casablancaFechas = new ArrayList();
        LocalDate casablanca1 = LocalDate.of(2021, 9, 27);
        LocalDate casablanca2 = LocalDate.of(2021, 9, 26);
        LocalDate casablanca3 = LocalDate.of(2021, 9, 25);
        LocalDate casablanca4 = LocalDate.of(2021, 9, 28);
        casablancaFechas.add(casablanca1);
        casablancaFechas.add(casablanca2);
        casablancaFechas.add(casablanca3);
        casablancaFechas.add(casablanca4);

        fechasLibres.put("psycho", psychoFechas);
        fechasLibres.put("vertigo", vertigoFechas);
        fechasLibres.put("citizen-kane", citizenKaneFechas);
        fechasLibres.put("casablanca", casablancaFechas);

        HashMap<String, ArrayList<Object>> psychoHoras = new HashMap<>();
        ArrayList<Object> psychoTime = new ArrayList<Object>();
        LocalTime psychoTime1 = LocalTime.of(18, 30);
        LocalTime psychoTime2 = LocalTime.of(19, 00);
        LocalTime psychoTime3 = LocalTime.of(20, 30);
        LocalTime psychoTime4 = LocalTime.of(21, 00);
        psychoTime.add(psychoTime1);
        psychoTime.add(psychoTime2);
        psychoTime.add(psychoTime3);
        psychoTime.add(psychoTime4);
        psychoHoras.put("psycho", psychoTime);
        horasLibres.put(psycho1, psychoHoras);
        horasLibres.put(psycho2, psychoHoras);
        horasLibres.put(psycho3, psychoHoras);
        horasLibres.put(psycho4, psychoHoras);

        HashMap<String, ArrayList<Object>> vertigoHoras = new HashMap<>();
        ArrayList<Object> vertigoTime = new ArrayList<Object>();
        LocalTime vertigoTime1 = LocalTime.of(16, 30);
        LocalTime vertigoTime2 = LocalTime.of(17, 00);
        LocalTime vertigoTime3 = LocalTime.of(22, 30);
        LocalTime vertigoTime4 = LocalTime.of(23, 00);
        vertigoTime.add(vertigoTime1);
        vertigoTime.add(vertigoTime2);
        vertigoTime.add(vertigoTime3);
        vertigoTime.add(vertigoTime4);
        vertigoHoras.put("vertigo", vertigoTime);
        horasLibres.put(vertigo1, vertigoHoras);
        horasLibres.put(vertigo2, vertigoHoras);
        horasLibres.put(vertigo3, vertigoHoras);
        horasLibres.put(vertigo4, vertigoHoras);

        HashMap<String, ArrayList<Object>> citizenKaneHoras = new HashMap<>();
        ArrayList<Object> citizenKaneTime = new ArrayList<Object>();
        LocalTime citizenKaneTime1 = LocalTime.of(12, 30);
        LocalTime citizenKaneTime2 = LocalTime.of(13, 00);
        LocalTime citizenKaneTime3 = LocalTime.of(14, 30);
        LocalTime citizenKaneTime4 = LocalTime.of(15, 00);
        citizenKaneTime.add(citizenKaneTime1);
        citizenKaneTime.add(citizenKaneTime2);
        citizenKaneTime.add(citizenKaneTime3);
        citizenKaneTime.add(citizenKaneTime4);
        citizenKaneHoras.put("citizen-kane", citizenKaneTime);
        horasLibres.put(citizenKane1, citizenKaneHoras);
        horasLibres.put(citizenKane2, citizenKaneHoras);
        horasLibres.put(citizenKane3, citizenKaneHoras);
        horasLibres.put(citizenKane4, citizenKaneHoras);

        HashMap<String, ArrayList<Object>> casablancaHoras = new HashMap<>();
        ArrayList<Object> casablancaTime = new ArrayList<Object>();
        LocalTime casablancaTime1 = LocalTime.of(8, 30);
        LocalTime casablancaTime2 = LocalTime.of(9, 00);
        LocalTime casablancaTime3 = LocalTime.of(10, 30);
        LocalTime casablancaTime4 = LocalTime.of(11, 00);
        casablancaTime.add(casablancaTime1);
        casablancaTime.add(casablancaTime2);
        casablancaTime.add(casablancaTime3);
        casablancaTime.add(casablancaTime4);
        casablancaHoras.put("casablanca", casablancaTime);
        horasLibres.put(casablanca1, casablancaHoras);
        horasLibres.put(casablanca2, casablancaHoras);
        horasLibres.put(casablanca3, casablancaHoras);
        horasLibres.put(casablanca4, casablancaHoras);
    }

    public ArrayList getPeliculas() {
        return peliculas;
    }
    public HashMap<String, ArrayList<Object>> getFechasLibres() {
        return fechasLibres;
    }
    public HashMap<Object, HashMap<String, ArrayList<Object>>> getHorasLibres() {
        return horasLibres;
    }
}
