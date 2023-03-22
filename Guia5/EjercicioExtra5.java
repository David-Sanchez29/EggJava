package Guia5;

import java.util.Scanner;

public class EjercicioExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;

        System.out.println("Ingrese las dimensiones de la matriz");
        int dim1 = leer.nextInt();
        int dim2 = leer.nextInt();

        int matriz[][] = new int[dim1][dim2];

        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }

        }
        System.out.println("-----------------");

        for (int[] matriz1 : matriz) {
            for (int n : matriz1) {
                System.out.print(n + " ");

            }
            System.out.println(" ");
        }
        System.out.println("------------------");

        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {

                suma += matriz[i][j];
            }
        }

        System.out.println("--------------------");
        System.out.println("La suma de todos los valores de la matrixz es: " + suma);

    }

}
