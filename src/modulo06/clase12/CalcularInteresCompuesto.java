package modulo06.clase12;

/*
TODO: Actividad 3 - Crear un programa para calcular el interés compuesto:
 Este programa debe permitir al usuario ingresar el capital inicial, la tasa de interés y el tiempo en años.
 Utilizando la fórmula del interés compuesto, el programa debe calcular el monto total acumulado y mostrarlo al usuario.
 */

import java.util.Scanner;

public class CalcularInteresCompuesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el capital inicial: ");
        double capitalInicial = sc.nextDouble();
        System.out.println("Ingrese la tasa de interés: ");
        double tasaInteres = sc.nextDouble();
        System.out.println("Ingrese el tiempo en años: ");
        double tiempoAnios = sc.nextDouble();
        double interesCompuesto = capitalInicial * tasaInteres * tiempoAnios;
        System.out.println("El interés compuesto es: " + interesCompuesto);
    }
}
