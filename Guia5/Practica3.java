package Guia5;

import static Matematicas.Varias.digitos;
import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int vector[] = new int[leer.nextInt()];
        int contador[]=new int[5];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        
        for(int i=0;i<vector.length;i++){
           
            switch (digitos(vector[i])) {
                case 1:
                    contador[0]++;
                    break;
                    case 2:
                    contador[1]++;
                    break;
                    case 3:
                    contador[2]++;
                    break;
                    case 4:
                    contador[3]++;
                    break;
                    case 5:
                    contador[4]++;
                    break;
    
            }

        }
        
        for (int i = 0; i < contador.length; i++) {
            System.out.println("se encuentran " +contador[i]+" numeros de "+i+" digitos");
            
        }
    }

}
