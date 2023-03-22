/*
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario.
 */
package Practica;

public class Practica10 {

    public static void main(String[] args) {

        int num[] = new int[20];
        int num2[] = new int[20];
        int cont = 0;
        for (int i = 0; i < 20; i++) { //lleno el arrays con numeros aleatorios entro 0 y 100

            num[i] = (int) (Math.random() * 101);

        }
        for (int m : num) {

            System.out.print(m + " ");
        }
        System.out.println(" ");

        int i = 0;
        int j = 0;
        for (int n : num) {

            if (n % 2 == 0) {
                num2[i] = n;

                i++;
            } else {

                num2[19 - j] = n;
                j++;
            }
        }

        System.arraycopy(num2, 0, num, 0, 20);

        for (int n : num) {
            System.out.print(n + " ");
        }
    }

}
