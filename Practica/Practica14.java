/*
Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.
 */
package Practica;

public class Practica14 {

    public static void main(String[] args) {

        int num[][] = new int[3][6];

        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        System.out.printf("%-10s", "ARRAY num| ");

        for (int i = 0; i < 6; i++) {

            System.out.printf("%1s %1d %2s", "Columnas", i, " | ");

        }
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {

            System.out.printf("%-5s %1d %2s", "Fila ", i, "|");
            for (int j = 0; j < 6; j++) {

                System.out.printf("%8d %4s", num[i][j], " ");

            }
            System.out.println(" ");
        }

    }

}
