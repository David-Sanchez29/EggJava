package Guia4FuncionesSubprocesos;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int num1;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero que desa saber si es primo o no:");
        num1 = leer.nextInt();

        System.out.print("el numero ingresado ");
        if (Fprimo(num1)) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }

    }

    public static boolean Fprimo(int num) {

        boolean result = true;
        int cont = 0;

        for (int i = num; i > 0; i--) {
            if (num % i == 0) {
                cont++;
            }
            result = cont < 3;
        }

        return result;
    }
}
