package Guia5;

import java.util.Scanner;

public class EjercicioExtra6 {

    public static void main(String[] args) {

        int cont;
        int cont2;
        String palabra;
        Scanner leer = new Scanner(System.in);
        char[][] letras = new char[20][20];

        System.out.println("Cree la sopa de letras");
        System.out.println("------------------------");

        System.out.println("Ingrese las 5 palabras");

        cont = (int) (Math.random() * 5);

        for (int i = 0; i < 5; i++) {
            palabra = leer.next();
            generaPalabra(palabra);
            generaLetra(palabra, letras, cont);
            cont2 = (int) (Math.random() * 2 + 1);
            cont = cont + cont2;
        }

        llenarVacio(letras);

        for (char[] letrasA : letras) {
            for (char n : letrasA) {
                System.out.print(n + " ");

            }
            System.out.println(" ");
        }

    }

    public static String generaPalabra(String palabra) {
        Scanner leer = new Scanner(System.in);
        

        do {

            if (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("Las palabras deben contener de 3 a 5 caracteres");
                palabra=leer.next();
            }
        } while (palabra.length() < 3 || palabra.length() > 5);

        return palabra;

    }

    public static void generaLetra(String palabra, char[][] letras, int cont) {

        int k = (int) (Math.random() * 4);
        for (int i = 0; i < palabra.length(); i++) {

            letras[cont][i + k] = palabra.charAt(i);
        }

    }

    public static void llenarVacio(char[][] letras) {

        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < 20; i++) {
                if (letras[j][i] == '\u0000') {
                    letras[j][i] = '5';
                }

            }
        }
    }

}
