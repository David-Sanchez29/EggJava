package Guia3;

import java.util.Scanner;

public class EjercicoExtra5 {

    public static void main(String[] args) {
        String socio;
        float tratamiento;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese tipo de Socio");

        socio = leer.next();

        if (socio.equals("A") || socio.equals("B") || socio.equals("C")) {

            System.out.println("Ingrese costo del tratamiento:");

            tratamiento = leer.nextFloat();

            switch (socio) {
                case "A":
                    System.out.println("Usted es socio A y el total a pagar es de: $" + (tratamiento * 0.5));
                    break;
                case "B":
                    System.out.println("Usted es socio B y el total a pagar es de: $" +tratamiento * 0.65);
                    break;
                case "C":
                    System.out.println("Usted es socio C y el total a pagar es de: $" + tratamiento);
                    break;

            }

        } else {
            System.out.println("Usted ingreso una categoria de Socio incorrecta");
        }
    }
}
