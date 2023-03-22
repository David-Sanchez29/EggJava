package Guia3;

public class EjercicioExtra12 {

    public static void main(String[] args) {

        int j;
        int k;

        for (k = 0; k < 10; k++) {
            for (j = 0; j < 10; j++) {
                for (int i = 0; i < 10; i++) {
                    if (k != 3) {
                        System.out.print(k);
                    } else {
                        System.out.print("E");
                    }

                    System.out.print(" - ");
                    if (j != 3) {
                        System.out.print(j);
                    } else {
                        System.out.print("E");
                    }

                    System.out.print(" - ");

                    if (i != 3) {
                        System.out.println(i);
                    } else {
                        System.out.println("E");
                    }

                }

            }
        }
    }
}
