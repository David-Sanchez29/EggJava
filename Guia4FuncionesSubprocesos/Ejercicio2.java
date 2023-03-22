/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere
seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/
package Guia4FuncionesSubprocesos;

import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String resp;
        do {
            Personas();
            System.out.println("Desea agregar otra persona? S/N");
            resp=leer.next();
        } while (resp.equalsIgnoreCase("S"));
        
    }
    
    public static void Personas(){
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese nombre y edad de la persona");
        
        String nombre=leer.next();
        int edad=leer.nextInt();
        
        if (edad>=18)
            System.out.println(nombre+" "+edad+" años y es mayor de edad");
        else
            System.out.println(nombre+" "+edad+" años y es menor de edad" );
        
    }
    
}
