package Guia4FuncionesSubprocesos;

import java.util.Scanner;

public class Intro2 {

    public static void main(String[] args) {

        int num1, num2;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese 2 numeros");

        num1 = leer.nextInt();
        num2 = leer.nextInt();

        EsMultiplo(num1, num2);

    }

    public static void EsMultiplo(int num1, int num2) {

        if ((num2 % num1) == 0) {
            System.out.println("el primer número es múltiplo del segundo");
        } else {
            System.out.println("El primer numero no es multiplo del segundo");
        }

    }
}
