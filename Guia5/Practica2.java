
package Guia5;

import java.util.Scanner;


public class Practica2 {

   
    public static void main(String[] args) {
       
        
        int dim;
        int cont=0;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        dim=leer.nextInt();
        int vector[]=new int[dim];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*10);
            
        }
        
        System.out.println("Ingrese un numero a buscar en el vector");
        dim=leer.nextInt();
        System.out.println("se encontro el numero en las posiciones:");
        for (int i = 0; i < vector.length; i++) {
            if (dim==vector[i]){
                System.out.print(i+"");
                cont=1;
            

            }
            
            
        }
        if (cont==0)
            System.out.println("Ninguno");
        
        
    }
    
}
