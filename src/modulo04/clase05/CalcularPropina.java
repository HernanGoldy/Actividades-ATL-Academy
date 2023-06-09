package modulo04.clase05;

/*
TODO: Actividad 4 - Calculadora de propinas
    * Pídele al usuario que ingrese el total de la cuenta en un restaurante.
    * Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
    * Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
 */

import java.util.Scanner;

public class CalcularPropina {

    public static void main(String[] args) {

        Scanner ingresaDatos = new Scanner(System.in);

        System.out.println("Ingrese el total de lo consummido:");

        double totalCuenta = ingresaDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar:");

        double porcentajePropina = ingresaDatos.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);

        double totalAPagar = totalCuenta + propina;

        System.out.println("El total a pagar es de: " + "$" + totalAPagar + "\nFin del programa");
    }
}
