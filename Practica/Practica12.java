/*
Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.
 */
package Practica;

import java.util.Scanner;

public class Practica12 {

    public static void main(String[] args) {

        int num[] = new int[100];
        int opc;
        int max = 0;
        int min = 501;
        int vMin = 0;
        int vMax = 0;

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {

            num[i] = (int) (Math.random() * 501);
        }

        for (int i = 0; i < 100; i++) {

            if (num[i] < min) {
                vMin = i;
                min = num[i];
            }

            if (num[i] > max) {
                vMax = i;
                max = num[i];
            }

            if (!(i % 10 == 0)) {
                System.out.print(num[i] + " ");

            } else {
                System.out.println(" ");
            }

        }

        System.out.println("Desea destacar el maximo o el minimo?");
        System.out.println("1. Minimo");
        System.out.println("2. Maximo");

        opc = leer.nextInt();

        switch (opc) {
            case 1:

                for (int i = 0; i < 100; i++) {

                    if (i == vMin) {
                        System.out.print("**" + num[i] + "** ");

                    } else if (!(i % 10 == 0)) {
                        System.out.print(num[i] + " ");

                    } else {
                        System.out.println(" ");
                    }

                }

                break;

            case 2:

                for (int i = 0; i < 100; i++) {

                    if (i == vMax) {
                        System.out.print("**" + num[i] + "** ");

                    } else if (!(i % 10 == 0)) {
                        System.out.print(num[i] + " ");

                    } else {
                        System.out.println(" ");
                    }

                }

                break;
            default:
                throw new AssertionError();
        }
    }
}
