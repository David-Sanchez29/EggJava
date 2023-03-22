package Guia3;

import java.util.Scanner;

public class EjercicioExtra14 {

    public static void main(String[] args) {

        int cantf;
        int canth;
        int edad;
        int edadtotal = 0;
        int canthT = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de familias");

        cantf = leer.nextInt();

        for (int i = 1; i < cantf + 1; i++) {

            System.out.println("Ingrese la cantidad de hijos de la " + i + "º familia");
            canth = leer.nextInt();
            canthT = canth + canthT;

            for (int j = 1; j < canth + 1; j++) {

                System.out.println("Ingrese la edad del " + j + "º hijo");
                edad = leer.nextInt();
                edadtotal = edad + edadtotal;
            }

        }
        System.out.println("la media de la edad de las familia es de : " + (edadtotal / canthT) + " años");
    }

}
