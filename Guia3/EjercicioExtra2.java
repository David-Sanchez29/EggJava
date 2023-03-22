package Guia3;

public class EjercicioExtra2 {

    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;
        int aux;

        System.out.println("Valores iniciales:");
        System.out.println("A:" + A + " B:" + B + " C:" + C + " D:" + D);
        System.out.println("========================");

        aux = B;
        B = D;
        D = A;
        A = C;
        C = aux;
        System.out.println("Valores finales:");
        System.out.println("A:" + A + " B:" + B + " C:" + C + " D:" + D);

    }

}
