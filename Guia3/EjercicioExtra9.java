package Guia3;

import java.util.Scanner;

public class EjercicioExtra9 {

    public static void main(String[] args) {

        int num;
        int div;
        int result = 0;
        int cont = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese numero a dividir");
        num = leer.nextInt();

        System.out.println("Ingrese divisor debe ser distinto de 0");
        div = leer.nextInt();
        while (num - div >= 0) {
            cont++;
            result = num - div;
            System.out.println(num + " - " + div + " = " + result);
            num = result;

        }
        System.out.println("==================");
        System.out.println("Dado que " + num + " es menor que " + div + ", entonces: el residuo es " + result + " y el cociente es " + cont);
    }
}
