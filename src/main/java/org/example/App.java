package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Es mayor de edad? ");
        boolean mayor = scan.nextBoolean();
        System.out.println();
    }
}
