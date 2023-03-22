/*
Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.

 */
package Practica;

import java.util.Scanner;

public class Practica11 {

    public static void main(String[] args) {

        int num[] = new int[10];
        int num2[] = new int[10];
        int posI, posF, j;

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingres el " + (i + 1) + "º numero de 10");
            num[i] = leer.nextInt();

        }
        System.out.println("-------------------------");
        System.out.println("Arrays inicial");
        System.out.println("---------------------------");
        System.out.print("Indice ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println(" ");
        System.out.print("Valor  ");
        for (int n : num) {
            System.out.print(n + " ");
        }
        System.out.println(" ");

        System.out.println("Ingrese las posiciones(Inicial y Final)");
        posI = leer.nextInt();
        posF = leer.nextInt();

        int n = num[posF];
        num[posF] = num[posI];

        for (int i = posI; i > 0; i--) {

            num[i] = num[i - 1];
        }
        num[0] = num[9];

        for (int i = 9; i > posF + 1; i--) {

            num[i] = num[i - 1];

        }
        num[posF + 1] = n;
        System.out.println("-------------------------");
        System.out.println("Arrays Final");

        System.out.print("Indice ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.print("Valor  ");
        for (int m : num) {
            System.out.print(m + " ");
        }

    }

}
