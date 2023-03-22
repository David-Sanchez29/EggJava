package Guia5;

import java.util.Scanner;

public class EjercicioExtra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int dim;

        System.out.println("Ingresa la cantidad de  los primeros números de la sucesión de Fibonacci");
        dim = leer.nextInt();
        int[] vector = new int[dim];
        vectorFibo(vector);

        for (int n : vector) {
            System.out.print(n + ", ");

        }

    }

    public static void vectorFibo(int[] vector) {

        int suma1 = 1;
        int suma2 = 0;

        vector[0] = 1;
        for (int i = 1; i < vector.length; i++) {

            if (i % 2 != 0) {
                vector[i] = suma1 + suma2;
                suma2 = suma1 + suma2;

            } else if (i % 2 == 0) {
                vector[i] = suma1 + suma2;
                suma1 = suma1 + suma2;

            }

        }
    }

}
