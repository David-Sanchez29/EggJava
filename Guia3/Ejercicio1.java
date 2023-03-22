package Guia3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        
        numero = leer.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }
}
