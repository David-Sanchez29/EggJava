package Guia5;

import java.util.Scanner;

public class EjercicioExtra2 {

    public static void main(String[] args) {
        int cont = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int num = leer.nextInt();
        int[] vectorA = new int[num];
        int[] vectorB = new int[num];

        for (int i = 0; i < vectorB.length; i++) {
            vectorA[i] = (int) (Math.random() * 101);
            vectorB[i] = (int) (Math.random() * 101);
        }

        for (int n : vectorA) {
            System.out.print(n + " ");
        }
        System.out.println(" ");

        //System.arraycopy(vectorA,0 ,vectorB,0,vectorB.length);
        for (int n : vectorB) {
            System.out.print(n + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < vectorB.length; i++) {
            if (vectorA[i] != vectorB[i]) {
                break;
            } else {
                cont++;
            }

        }

        if (cont == vectorA.length) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }

}
