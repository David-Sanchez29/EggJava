
package Guia5;


public class Practica1 {

    
    public static void main(String[] args) {
       
        int vector []=new int[100];
        int j=99;
        for (int i=0;i<vector.length;i++){
            vector[i]=j;
            j--;
        }
        for(int n:vector){
            System.out.print(n+" ");
        }
    }
    
}
