package Practica;

import java.util.Scanner;

/*
Escribe un programa que pinte por pantalla una pirámide rellena a base de
asteriscos. La base de la pirámide debe estar formada por 9 asteriscos
 */
public class Practica3 {

    public static void main(String[] args) {

        int num, num2, num3, k;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = leer.nextInt();

        num2 = 0;
        num3 = 0;
        for (int i = 1; i < num + 1; i++) {
            i++;
            for (k = ((num / 2) - num3); k > 0; k--) {

                System.out.print(" ");

            }
            num3++;
            for (int j = 1; j < num2 + i; j++) {

                System.out.printf("%-1s", "*");

            }

            System.out.println("");
        }
        /*
        System.out.printf("%-9s\n", "    *");
        System.out.printf("%-9s\n", "   ***");
        System.out.printf("%-9s\n", "  *****");
        System.out.printf("%-9s\n", " *******");
        System.out.printf("%-9s\n", "*********");
         */
    }

}
