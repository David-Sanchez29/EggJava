package Guia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra7parte2 {

    public static void main(String[] args) {
        int num;
        int n;
        int max;
        int min;
        int cont = 1;
        int acum;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese cantidad de numeros a ingresar");
        n = leer.nextInt();
        
            System.out.println("Ingrese un numero");
            num = leer.nextInt();

            min = num;
            max = num;
            acum = num;
do {
            if (num > max) {
                max = num;

            } else if (num < min) {
                min = num;
            }

            System.out.println("Ingrese el siguiente numero");
            num = leer.nextInt();
            acum = acum + num;
            cont++;
        } while (cont < n);

        System.out.println("El valor maximo ingresado es: " + max);
        System.out.println("El valor minimo ingresado es: " + min);
        System.out.println("El promedio de los valores ingresado es: " + (acum / n));
    }

}
