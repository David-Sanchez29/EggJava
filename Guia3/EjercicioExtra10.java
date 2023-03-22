package Guia3;

import java.util.Scanner;

public class EjercicioExtra10 {

    public static void main(String[] args) {

        int num1, num2, resp, result, num3, num4;

        Scanner leer = new Scanner(System.in);

        do {
            num1 = (int) (Math.random() * 10);
            num2 = (int) (Math.random() * 10);
            resp = num1 * num2;
            num3 = (int) (Math.random() * 10);
            num4 = (int) (Math.random() * 10);
        } while (resp == num3 * num4);

        System.out.print("cuanto es " + num1 + "*" + num2 + "?");

        System.out.println("¿cual es la respuesta correcta?");
        System.out.println((num3 * num4) + " o " + resp);

        result = leer.nextInt();
        while (result != resp) {
            if (result != resp) {

                System.out.println("INCORRECTO, introduzca el resultado correcto");
                result = leer.nextInt();
            }
        }
        System.out.println("CORRECTO");
    }

}
