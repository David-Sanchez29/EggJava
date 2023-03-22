/*
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
 */
package Practica;

import java.util.Scanner;

public class Practica5 {

    public static void main(String[] args) {

        int num;
        int result=0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        do {
            if (num < 0) {
                System.out.println("Ingrese un valor positivo");
                num = leer.nextInt();
            }
        }while (num < 0);
        
        for (int i = num+1; i < num+101; i++) {
            result=result + i;
            
        }
        System.out.println("La suma de los siguientes 100 numeros es: "+result);

        }
   
    }

