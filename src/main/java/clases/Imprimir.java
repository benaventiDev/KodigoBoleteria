package clases;

import interfaces.ImprimirInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Imprimir implements ImprimirInterface {
    public void exportar(String informacion) {
        FileWriter flwriter = null;
        try {
            //crea el flujo para escribir en el archivo
            flwriter = new FileWriter("/media/marigiko/Mario/Mario/Trabajo/Proyectos/Kodigo/ticket.txt");
            //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            //escribe los datos en el archivo
            bfwriter.write(informacion);
            //cierra el buffer intermedio
            bfwriter.close();
            System.out.println("Archivo creado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {//cierra el flujo principal
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}