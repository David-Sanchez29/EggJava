
package Guia2;

import java.util.Scanner;


public class Ejercicio5 {

   
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero entero");
        Scanner leer=new Scanner(System.in);
        int num=leer.nextInt();
        System.out.println(" ");
        
        System.out.println("Su doble es: "+ (num*2));
        System.out.println(" ");
        
        System.out.println("Su triple es: "+ (num*3));
        System.out.println(" ");
        
        System.out.println("Su raiz cuadrada es: "+ Math.sqrt(num));
        
    }
    
}
