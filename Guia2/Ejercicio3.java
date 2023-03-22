
package Guia2;

import java.util.Scanner;

public class Ejercicio3 {

  
    public static void main(String[] args) {
       
        System.out.println("Ingrese una frase");
        Scanner leer=new Scanner(System.in);
        String frase= leer.nextLine();
        System.out.println(" ");
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
