package modulo04.clase05;

/*
TODO: Actividad 5 - Juego de adivinar el número
    * Genera un número aleatorio entre 1 y 100.
    * Pídele al usuario que adivine el número.
 */

import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {

        System.out.println("Adivina el número entre 1 y 100");

        // Generamos el número aleatorio entr
        int aleatorio = (int) (Math.random() * 100);

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        while (numero != aleatorio) {

            intentos++;

            System.out.println("Introduce un número:");

            numero = entrada.nextInt();

            if (aleatorio < numero) {

                System.out.println("¡Ups! El número ingresado es alto.");

            } else if (aleatorio > numero) {

                System.out.println("¡Ups! El número ingresado es bajo.");

            }

        }

        System.out.println("¡Correcto! Lo has conseguido en " + intentos + " intentos.\nFin del Programa.");

    }
}
