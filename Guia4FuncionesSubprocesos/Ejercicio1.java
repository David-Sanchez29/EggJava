/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package Guia4FuncionesSubprocesos;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int num1, num2, opc;
        float resultado;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese 2 numeros");

        num1 = leer.nextInt();
        num2 = leer.nextInt();

        System.out.println("Que desea hacer?");
        System.out.println("================");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("================");

        opc = leer.nextInt();

        switch (opc) {
            case 1:
                resultado = suma(num1, num2);
                System.out.printf("%-10s %.0f", "El resultado es:", resultado);
                break;
            case 2:
                resultado = resta(num1, num2);
                System.out.printf("%-10s %.0f", "El resultado es:", resultado);
                break;
            case 3:
                resultado = Multi(num1, num2);
                System.out.printf("%-10s %.0f", "El resultado es:", resultado);
                break;
            case 4:
                resultado = dividir(num1, num2);
                System.out.printf("%-10s %.2f", "El resultado es:", resultado);
                break;
            default:
                System.out.println("Opcion inexistente");
        }

    }

    public static int suma(int num1, int num2) {

        int result = num1 + num2;

        return result;
    }

    public static int resta(int num1, int num2) {

        int result = num1 - num2;

        return result;
    }

    public static int Multi(int num1, int num2) {

        int result = num1 * num2;

        return result;
    }

    public static float dividir(int num1, int num2) {

        float result = (float) num1 / (float) num2;

        return result;
    }
}
