package Guia5;

public class Practica4 {

    public static void main(String[] args) {

        int matrizA[][] = new int[4][4];
        int matrizB[][] = new int[4][4];

        llenarMatriz(matrizA);

        for (int[] matrizA1 : matrizA) {
            for (int n : matrizA1) {
                System.out.print(n + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 0; i < matrizB.length; i++) {
            System.arraycopy(matrizA[i], 0, matrizB[i], 0, matrizB.length);
        }
        voltearMatriz(matrizB);

        for (int[] matrizB1 : matrizB) {
            for (int n : matrizB1) {
                System.out.print(n + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        if (matrizTranspuesta(matrizA, matrizB)) {
            System.out.println("Las matrizes son Transpuestas");

        } else {
            System.out.println("Las matrizes no son Transpuestas");
        }
    }

    public static int llenarMatriz(int[][] matrizA) {

        for (int[] matrizA1 : matrizA) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizA1[j] = (int) (Math.random() * 11);
            }
        }
        return 0;
    }

    public static void voltearMatriz(int[][] matrizA) {
        int[][] matrizB = new int[matrizA.length][matrizA.length];

        for (int i = 0; i < matrizB.length; i++) {
            System.arraycopy(matrizA[i], 0, matrizB[i], 0, matrizB.length);
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizA[i][j] = matrizB[j][i];
            }

        }

    }

    public static boolean matrizTranspuesta(int matrizA[][], int matrizB[][]) {

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {

                if (matrizA[i][j] != matrizB[j][i] * -1) {

                    return false;
                }

            }

        }

        return true;
    }

}
