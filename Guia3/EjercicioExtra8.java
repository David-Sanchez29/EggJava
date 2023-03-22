package Guia3;

import java.util.Scanner;

public class EjercicioExtra8 {

    public static void main(String[] args) {

        int num;
        int contp = 0;
        int conti = 0;
        int cant = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = leer.nextInt();

        while (num % 5 != 0) {
            if (num % 5 == 0) {
                break;

            } else if (num < 0) {

            } else if (num % 2 == 0) {
                contp++;
                cant++;
            } else {
                conti++;
                cant++;
            }

            System.out.println("Ingrese otro numero");
            num = leer.nextInt();
        }

        System.out.println("Cantidad de numeros leidos son: " + cant);
        System.out.println("La cantidad de numeros pares es: " + contp);
        System.out.println("LA cantidad de numeros impares es: " + conti);
    }
}
