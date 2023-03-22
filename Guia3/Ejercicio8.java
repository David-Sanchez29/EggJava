package Guia3;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        int num, j, i;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = leer.nextInt();

        for (j = 0; j < num; j++) {
            for (i = 0; i < num; i++) {
                if (j == 0 || j == (num - 1)) {
                    System.out.print("* ");

                } else if (i == 0 || i == (num - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }
    }

}
