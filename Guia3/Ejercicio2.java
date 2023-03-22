package Guia3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        String frase;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese frase correcta");

        frase = leer.next();

        if (frase.equals("eureka") == true) {
            System.out.println("Frase correcta");

        } else {
            System.out.println("Frase Incorrecta");
        }
    }

}

