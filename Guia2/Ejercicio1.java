
package Guia2;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese los 2 numeros a sumar");
        num1=leer.nextInt();
        num2=leer.nextInt();
        int num3 = num1+num2;
        System.out.println("La suma entre los numeros "+num1 +" y "+num2+" es: "+num3);
        
        
        
     
    }
    
}
