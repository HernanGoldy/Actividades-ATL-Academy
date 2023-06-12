package modulo04.clase06;

/*
TODO: Actividad 6 - Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.
 */

import java.util.Scanner;

public class MayorYMenor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese 3 números enteros para mostrar el mayor y menor de ello:\nDigite el primer número");
        int num1 = input.nextInt();
        System.out.println("Digite el segundo número:");
        int num2 = input.nextInt();
        System.out.println("Digite el segundo número:");
        int num3 = input.nextInt();

        // Calcula el mayor de los tres números
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número " + num1 + " es el mayor de los tres.");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("El número " + num2 + " es el mayor de los tres.");
        } else {
            System.out.println("El número " + num3 + " es el mayor de los tres.");
        }

        // Calcula el menor de los tres números
        if (num1 < num2 && num1 < num3) {
            System.out.println("El número " + num1 + " es el menor de los tres.");
        } else if (num2 < num3 && num2 < num1) {
            System.out.println("El número " + num2 + " es el menor de los tres.");
        } else {
            System.out.println("El número " + num3 + " es el menor de los tres.");
        }

        System.out.println("Fin del programa.");
    }
}
