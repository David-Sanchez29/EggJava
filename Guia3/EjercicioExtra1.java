package Guia3;

import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {
        int dias, horas, minutos;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese minutos a covertir");
        minutos = leer.nextInt();

        horas = (minutos / 60) % 24;
        dias = (minutos / 60) / 24;

        System.out.println(dias + " dia, " + horas + " horas");

    }

}
