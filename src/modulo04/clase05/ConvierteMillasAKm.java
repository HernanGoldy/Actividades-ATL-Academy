package modulo04.clase05;

/*
TODO: Actividad 2 - Conversor de millas a kilómetros
    * Pídele al usuario que ingrese una distancia en millas.
    * Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
    * Muestra la distancia en kilómetros al usuario.
 */

import java.util.Scanner;

public class ConvierteMillasAKm {

    public static void main(String[] args) {

        Scanner datosMillas = new Scanner(System.in);

        System.out.println("Ingrese una distancia en millas:");

        Double millas = datosMillas.nextDouble();

        Double kilometros = millas * 1.60934;

        System.out.println("Las distancia en millas ingresadas equivale a " + kilometros + " kilómetros.");
    }
}
