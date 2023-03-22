package Guia5;

public class EjercicioExtra3 {

    public static void main(String[] args) {

    }

    public static void llenarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);

        }
    }

    public static void impimirVector(int[] vector) {

        for (int n : vector) {
            System.out.println(n + " ");
        }
    }

}
