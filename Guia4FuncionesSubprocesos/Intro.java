package Guia4FuncionesSubprocesos;

import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String fraseF="";
        char caract;

        System.out.println("Ingrese una frase terminada en un punto");
        String frase = leer.nextLine();
        
        for (int i=0;i<frase.length();i++){
            
            caract=frase.charAt(i);
            
            fraseF=fraseF+""+CambiaFrase(caract);
            
            
        }
        
        System.out.println("La frase actual es: ");
        System.out.println(fraseF);

    }

    public static char CambiaFrase(char frase) {

        char letra=' ';
        
        switch (frase) {
            case 'a':
            case 'A':
                letra = '@';

                break;

            case 'e':
            case 'E':
                letra = '#';

                break;

            case 'i':
            case 'I':
                letra = '$';

                break;

            case 'o':
            case 'O':
                letra = '%';

                break;

            case 'u':
            case 'U':
                letra ='*';

                break;

            default:
                letra=frase;
        
        }

        return letra;
    }

}
