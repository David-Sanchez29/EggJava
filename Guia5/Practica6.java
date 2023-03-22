package Guia5;

import java.util.Scanner;

public class Practica6 {

    public static void main(String[] args) {
        int num, k = 0;
        int[] suma = new int[8];
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor para el cubo entr 1 y 9");

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                do {

                    num = leer.nextInt();
                    if (num > 10 || num < 0) {
                        System.out.println("Ingrese un valor correcto");
                    }
                } while (num > 10 || num < 0);
                matriz1[j] = num;

            }
        }

        for (int i = 0; i < matriz.length; i++) {

            suma[k] = matriz[i][0] + matriz[i][1] + matriz[i][2];
            suma[k + 3] = matriz[0][i] + matriz[1][i] + matriz[2][i];
            suma[6] += matriz[i][i];
            suma[7] += matriz[i][2 - i];
            k++;

        }
        
      
        for (int i = 0; i < suma.length - 1; i++) {
            if (suma[i] != suma[i + 1]) {
                System.out.println("No es un cuadrado magico");
                break;
            } else if (i == 6) {
                System.out.println("El cuadrado es magico");
            }

        }

    }

}
