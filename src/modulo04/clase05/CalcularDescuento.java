package modulo04.clase05;

/*
TODO: Actividad 3 - Calculadora de descuento
    * Pídele al usuario que ingrese el precio original de un producto.
    * Pídele al usuario que ingrese el porcentaje de descuento.
    * Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
    * Muestra el precio final al usuario.
 */

import java.util.Scanner;

public class CalcularDescuento {

    public static void main(String[] args) {

        Scanner ingresaDatos = new Scanner(System.in);

        System.out.println("Ingrese el precio original del producto:");

        double precioOriginal = ingresaDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento del producto:");

        double descuento = ingresaDatos.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("El total a abonar con el descuento incluído es de: " + "$" + precioFinal + "\nFin del programa.");

    }
}
