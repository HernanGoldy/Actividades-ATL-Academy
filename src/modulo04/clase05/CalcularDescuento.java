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

        System.out.println("Ingrese el total de la cuenta:");

        double totalCuenta = ingresaDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar:");

        double porcentajePropina = ingresaDatos.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);

        double totalAPagar = totalCuenta * propina;

        System.out.println("El total que debe abonar con propina incluída es de: " + totalAPagar);
    }
}
