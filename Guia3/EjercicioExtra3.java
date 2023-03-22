package Guia3;

import java.util.Scanner;

public class EjercicioExtra3 {

    public static void main(String[] args) {

        String letra;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese letra");

        letra = leer.next();

        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {

            System.out.println("La letra ingresada es una vocal");

        } else {
            System.out.println("La letra ingresada no es una vocal");
        }
    }

}
