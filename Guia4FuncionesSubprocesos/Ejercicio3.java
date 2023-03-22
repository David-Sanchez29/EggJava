/*
Crea una aplicación que a través de una función nos convierta una cantidad 
de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará
un mensaje indicando el cambio (void).
*/
package Guia4FuncionesSubprocesos;

import java.util.Scanner;


public class Ejercicio3 {

 
    public static void main(String[] args) {
      
        String moneda;
        float euro;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Euros");
        euro=leer.nextFloat();
        
        System.out.println("Ingrese a que moneda desea convertid los Euros ingresados:");
        System.out.println("-----------------------------------");
        System.out.println("libras");
        System.out.println("dolares");
        System.out.println("yenes");
        System.out.println("-----------------------------------");
        moneda=leer.next();
        System.out.println("-----------------------------------");
        convertir(euro, moneda);
    }
    
    
    public static void convertir(float euros, String moneda){
        float result;
        
        switch (moneda) {
                
            case "libras":
                result=euros*(float)0.88;
                System.out.println(euros+" euros son "+result+" libras");
                break;
                
            case "dolares":
                result=euros*(float)1.05518;
                System.out.println(euros+" euros son "+result+" dolares");
                break;
                
            case "yenes":
                result=euros*(float)141.12;
                System.out.println(euros+" euros son "+result+" yenes");
                break;
                 
        }
        
    }
}
