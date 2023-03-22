package Guia5;

import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {
        int suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantos valores va a ingresar?");
        int num = leer.nextInt();
        int[] vector = new int[num];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el " + (i + 1) + "º numero");
            vector[i] = leer.nextInt();
        }

        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        System.out.println("La suma de todos los valores ingresado es: " + suma);

    }

}
