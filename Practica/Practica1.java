package Practica;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {

        int num1, num2, resp, result, num3, num4, numeroR, cont;
        cont = 0;
        String continua;

        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            do {
                numeroR = (int) (Math.random() * 10) / 2;
            } while (numeroR > 3 || numeroR == 0);

            do {
                switch (numeroR) {
                    case 1:
                        do {
                            num1 = (int) (Math.random() * 10);
                            num2 = (int) (Math.random() * 10);
                            resp = num1 * num2;
                            num3 = (int) (Math.random() * 10);
                            num4 = (int) (Math.random() * 10);
                        } while (resp == num3 * num4);

                        System.out.print("cuanto es " + num1 + "*" + num2 + "?");

                        System.out.println("¿cual es la respuesta correcta?");

                        do {
                            num1 = (int) (Math.random() * 10 / 2);
                        } while (num1 > 2 || num1 == 0);

                        switch (num1) {
                            case 1:

                                System.out.println((num3 * num4) + " o " + resp);
                                break;
                            case 2:
                                System.out.println(resp + " o " + (num3 * num4));
                                break;
                        }
                        result = leer.nextInt();
                        while (result != resp) {
                            if (result != resp) {

                                System.out.println("INCORRECTO, introduzca el resultado correcto");
                                result = leer.nextInt();
                            }
                        }
                        System.out.println("CORRECTO");

                        cont = 1;
                        break;

                    case 2:
                        do {
                            num1 = (int) (Math.random() * 100);
                            num2 = (int) (Math.random() * 100);
                            resp = num1 + num2;
                            num3 = (int) (Math.random() * 100);
                            num4 = (int) (Math.random() * 100);
                        } while (resp == num3 + num4);

                        System.out.print("cuanto es " + num1 + "+" + num2 + "?");

                        System.out.println("¿cual es la respuesta correcta?");

                        do {
                            num1 = (int) (Math.random() * 10 / 2);
                        } while (num1 > 2 || num1 == 0);

                        switch (num1) {
                            case 1:
                                System.out.println((num3 + num4) + " o " + resp);
                                break;
                            case 2:
                                System.out.println(resp + " o " + (num3 + num4));
                                break;
                        }

                        result = leer.nextInt();
                        while (result != resp) {
                            if (result != resp) {

                                System.out.println("INCORRECTO, introduzca el resultado correcto");
                                result = leer.nextInt();
                            }
                        }
                        System.out.println("CORRECTO");

                        cont = 1;
                        break;

                    case 3:

                        do {
                            num1 = (int) (Math.random() * 1000);
                            num2 = (int) (Math.random() * 100);
                            resp = num1 - num2;
                            num3 = (int) (Math.random() * 1000);
                            num4 = (int) (Math.random() * 100);
                        } while (resp == num3 - num4);

                        System.out.print("cuanto es " + num1 + "-" + num2 + "?");

                        System.out.println("¿cual es la respuesta correcta?");

                        do {
                            num1 = (int) (Math.random() * 10 / 2);
                        } while (num1 > 2 || num1 == 0);

                        switch (num1) {
                            case 1:

                                System.out.println((num3 - num4) + " o " + resp);
                                break;
                            case 2:
                                System.out.println(resp + " o " + (num3 - num4));
                                break;
                        }

                        result = leer.nextInt();
                        while (result != resp) {
                            if (result != resp) {

                                System.out.println("INCORRECTO, introduzca el resultado correcto");
                                result = leer.nextInt();
                            }

                        }
                        System.out.println("CORRECTO");
                        cont = 1;
                        break;

                }
            } while (cont != 1);
            if (i < 10) {
                System.out.println("Desea continuar? S/N?");
                continua = leer.next();
                if (continua.equalsIgnoreCase("N")) {

                    break;
                } else {
                    System.out.println("Van un total de: " + (i + 1) + "/10 de veces");
                }
            }
        }

    }
}
