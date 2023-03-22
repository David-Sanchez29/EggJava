
package Guia3;

import java.util.Scanner;


public class Ejercicio3 {

  
    public static void main(String[] args) {
        
        String frase;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese Frase de 8 letras");
        
        frase=leer.nextLine();
        
        if (frase.length()==8){
            System.out.println("CORRECTO");  
        }else {
            System.out.println("INCORRECTO");
        }
    }
    
}
