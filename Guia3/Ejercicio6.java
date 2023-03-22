package Guia3;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        int opcion;
        int num1, num2;
        String opcCont = "N";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("ELIJA UNA OPCIÔN:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
                    System.out.println("=================================");
                    break;
                case 2:
                    System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
                    System.out.println("=================================");
                    break;
                case 3:
                    System.out.println("La Multiplicacion de " + num1 + " por " + num2 + " es: " + (num1 * num2));
                    System.out.println("=================================");
                    break;
                case 4:
                    System.out.println("La Division de " + num1 + " por " + num2 + " es: " + (num1 / num2));
                    System.out.println("=================================");
                    break;
                case 5:
                    System.out.println("¿Estas seguro que desea salir del programa? S/N");
                    opcCont = leer.next();
                    break;
            }
        } while (opcCont.equalsIgnoreCase("N"));

    }

}
