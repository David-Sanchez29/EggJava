package Guia3;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int vmax;
        int num;
        int suma = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese valor maximo");
        vmax = leer.nextInt();

        do {
            System.out.println("Ingrese numero a sumar");
            num = leer.nextInt();

            suma = num + suma;

        } while (suma < vmax);
        System.out.println(" ");
        System.out.println("Suma total es: " + suma);
        
    }

}
