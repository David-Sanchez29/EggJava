
package Guia3;

import java.util.Scanner;


public class EjercicioExtra11 {

    
    public static void main(String[] args) {
       
        int num;
        int cont=0;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        
        do{
        num=num/10;
        cont++;
        
    }while(num%10!=0);
        System.out.println("Cantidad de digitos es: "+cont);
    }
    
}
