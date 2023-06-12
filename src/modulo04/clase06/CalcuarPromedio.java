package modulo04.clase06;

/*
TODO: Actividad 5 - Armar un programa que permita cargar 3 números y mostrar cual es el número promedio
 */

import java.util.Scanner;

public class CalcuarPromedio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese a continuación 3 números enteros para calcular el promedio:\nDigite el primer número");
        int num1 = input.nextInt();
        System.out.println("Digite el segundo número:");
        int num2 = input.nextInt();
        System.out.println("Digite el segundo número:");
        int num3 = input.nextInt();

        int promedio = (num1 + num2 + num3) / 3;

        System.out.println("El número promedio es: " + promedio);

        System.out.println("Fin del programa.");
    }
}
