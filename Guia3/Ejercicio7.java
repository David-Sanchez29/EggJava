package Guia3;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        String cadena, result, result2;
        int longitud, contC, contE;
        contC = 0;
        contE = 0;
        Scanner leer = new Scanner(System.in);
        cadena = " ";

        System.out.println("======");
        System.out.println("FDE");
        System.out.println("======");

        System.out.println("Ingrese cadenas FDE");

        while (!cadena.equals("&&&&&")) {
            cadena = leer.next();
            longitud = cadena.length();

            if (cadena.length() <= 5 && !cadena.equals("&&&&&")) {
                result = cadena.substring(0, 1);
                result2 = cadena.substring(longitud - 1, longitud);

                if (result.equalsIgnoreCase("X") && result2.equalsIgnoreCase("O")) {

                    contC++;
                } else {
                    contE++;

                }

            }

        }
        System.out.println("Se ingresaron " + contC + " cadenas CORRECTAS");
        System.out.println("Y se ingresaron " + contE + " cadenas INCORRECTAS");
    }
}
