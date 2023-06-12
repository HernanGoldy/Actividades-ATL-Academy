package modulo04.clase07;

/*
TODO: Actividad 1 - Hacer un programa que permita al usuario ingresar 5 números y mostrarlos
 */

import java.util.Scanner;

public class MostrarNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        int contador = 0;
        while (contador < numeros.length) {
            System.out.println("ingrese un número:");
            numeros[contador] = teclado.nextInt();
            contador++;
        }

        contador = 0;
        while (contador < numeros.length) {
            System.out.print(numeros[contador] + " - ");
            contador++;
        }

    }
}
