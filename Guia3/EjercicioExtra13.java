package Guia3;

import java.util.Scanner;

public class EjercicioExtra13 {

    public static void main(String[] args) {

        int num;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese altura de la escalera de numeros");

        num = leer.nextInt();
        System.out.println("");

        for (int j = 1; j < num + 1; j++) {

            for (int i = 1; i < j + 1; i++) {

                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
