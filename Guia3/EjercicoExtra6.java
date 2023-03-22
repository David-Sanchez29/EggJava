package Guia3;

import java.util.Scanner;

public class EjercicoExtra6 {

    public static void main(String[] args) {

        float altura;
        int cont1 = 0;
        int cont2 = 0;
        float suma = 0;
        float suma2 = 0;

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese altura de la persona o 0 para terminar");

            altura = leer.nextFloat();

            if (altura != 0.0) {
                cont2++;
                suma2 = suma2 + altura;
                if (altura < 1.6) {
                    cont1++;
                    suma = altura + suma;
                }
            }
        } while (altura != 0);

        System.out.println("La altura promedio de los q miden menos de 1.60 es: " + suma / cont1);
        System.out.println(" ");
        System.out.println("La altura promedio general es: " + suma2 / cont2);

    }
}
