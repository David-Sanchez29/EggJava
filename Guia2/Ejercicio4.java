
package Guia2;

import java.util.Scanner;

public class Ejercicio4 {

    
    public static void main(String[] args) {
        System.out.println("Ingrese la temperatura en Grados centigrados");
        Scanner leer= new Scanner(System.in);
        Float temp=leer.nextFloat();
        Float temp2= 32+(9*temp/5);
        System.out.println(" ");
        System.out.println("La temperatura en Grados Farengeit es: "+temp2);
        
    }
    
}
