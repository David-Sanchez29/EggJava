package Practica;

import java.util.Scanner;

public class Practica9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int j=14;

        System.out.println("Ingrese 10 numeros");

        int num[] = new int[15];
        
        for (int i = 0; i < 15; i++) {

            num[i] = leer.nextInt();
        }
        
        
       for(int n:num){
           num[14-j]=num[j];
           num[j]=n;
           j--;
           
           if (j==6)
               break;
       
       }
       for(int n:num){
           
           System.out.print(n+" ");
       }
    }
}
