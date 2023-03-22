/*
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).

*/
package Practica;


public class Practica6 {

   
    public static void main(String[] args) {
       int num;
        for (int i = 0; i < 3; i++) {
            
            num=(int)(Math.random()*6+1);
            System.out.println("Tirada "+(i+1)+"º del dado "+num);
        }
    }
    
}
