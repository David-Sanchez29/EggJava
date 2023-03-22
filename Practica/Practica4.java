package Practica;

import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {

        char caract;
        String opc;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un caracter");
        caract = leer.next().charAt(0);
        System.out.println("Ingrese direccion de la piramida(izquierda/derecha/arriba/abajo)");
        opc=leer.next();

        switch (opc) {
            
            case "arriba":
            case "ARRIBA":
                System.out.printf("%-5s %c\n", "", caract);
                System.out.printf("%-4s %c%c%c\n", "", caract, caract, caract);
                System.out.printf("%-3s %c%c%c%c%c\n", "", caract, caract, caract, caract, caract);
                System.out.printf("%-2s %c%c%c%c%c%c%c\n", "", caract, caract, caract, caract, caract, caract, caract);
                System.out.printf("%-1s %c%c%c%c%c%c%c%c%c\n", "", caract, caract, caract, caract, caract, caract, caract, caract, caract);
                break;

                
            case "abajo":
            case "ABAJO":
                System.out.printf("%-1s %c%c%c%c%c%c%c%c%c\n", "", caract, caract, caract, caract, caract, caract, caract, caract, caract);
                System.out.printf("%-2s %c%c%c%c%c%c%c\n", "", caract, caract, caract, caract, caract, caract, caract);
                System.out.printf("%-3s %c%c%c%c%c\n", "", caract, caract, caract, caract, caract);
                System.out.printf("%-4s %c%c%c\n", "", caract, caract, caract);
                System.out.printf("%-5s %c\n", "", caract);
                break;
                
              
            case "izquierda":
            case "IZQUIERDA":
                
                System.out.printf("%-9s %c\n", "", caract);
                System.out.printf("%-7s %c %c\n", "", caract, caract);
                System.out.printf("%-5s %c %c %c\n", "", caract, caract, caract);
                System.out.printf("%-3s %c %c %c %c\n", "", caract, caract, caract, caract);
                System.out.printf("%-1s %c %c %c %c %c\n", "", caract, caract, caract, caract, caract);
                System.out.printf("%-3s %c %c %c %c\n", "", caract, caract, caract, caract);
                System.out.printf("%-5s %c %c %c\n", "", caract, caract, caract);
                System.out.printf("%-7s %c %c\n", "", caract, caract);
                System.out.printf("%-9s %c\n", "", caract);
                break;
                

            case "derecha":
            case "DERECHA":
                System.out.printf("%c\n", caract);
                System.out.printf("%c %c\n", caract, caract);
                System.out.printf("%c %c %c\n", caract, caract, caract);
                System.out.printf("%c %c %c %c\n", caract, caract, caract, caract);
                System.out.printf("%c %c %c %c %c\n", caract, caract, caract, caract, caract);
                System.out.printf("%c %c %c %c\n", caract, caract, caract, caract);
                System.out.printf("%c %c %c\n", caract, caract, caract);
                System.out.printf("%c %c\n", caract, caract);
                System.out.printf("%c\n", caract);
                break;
        }

        }

    }
