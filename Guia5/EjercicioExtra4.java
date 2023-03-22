package Guia5;

import java.util.Scanner;

public class EjercicioExtra4 {

    public static void main(String[] args) {

        int contA = 0;
        float[][] notas = new float[10][5];
        Scanner leer = new Scanner(System.in);

        /*
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 5; i++) {
                notas[j][i] = (int) (Math.random() * 11);
            }

        }
         */
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.println("Ingrese la " + (i + 1) + "º nota del " + (j + 1) + "º alumno");
                notas[j][i] = leer.nextInt();

            }
        }

        for (int i = 0; i < 10; i++) {
            notas[i][0] = (float) (notas[i][0] / 100.0 * 10);
            notas[i][1] = (float) (notas[i][1] / 100.0 * 15);
            notas[i][2] = (float) (notas[i][2] / 100.0 * 25);
            notas[i][3] = (float) (notas[i][3] / 100.0 * 50);
        }

        for (int i = 0; i < 10; i++) {

            notas[i][4] = notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3];

        }

        /*
             for(float notasA[]:notas){
                 for(float n:notasA){
                     System.out.print(n+"    ");
                 }
                 System.out.println(" ");
             }
         */
        for (int i = 0; i < 10; i++) {
            if (notas[i][4] >= 7) {
                contA++;
            }
        }
        System.out.println("Aprobaron un total de " + contA + " alumnos");
        System.out.println("y reprobaron un total de " + (10 - contA) + " alumnos");
    }
}
