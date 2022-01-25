package clases;

import interfaces.ImprimirInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Imprimir implements ImprimirInterface {
    public void exportar(String informacion) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter("/media/marigiko/Mario/Mario/Trabajo/Proyectos/Kodigo/ticket.txt");
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            bfwriter.write(informacion);
            bfwriter.close();
            System.out.println("Archivo creado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}