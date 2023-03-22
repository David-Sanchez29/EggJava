package Guia3;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        String frase;
        String frase2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Frase o palabra");
        frase = leer.nextLine();
        frase2 = frase.substring(0,1);

        if (frase2.equals("A") == true) {

            System.out.println("CORRECTO");

        } else {
            System.out.println("INCORRECTO");
        }
    }

}
