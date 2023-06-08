package modulo04.clase05;

import java.util.Scanner;

/*
TODO: Actividad 1 - Calculadora de edad de perros
    * Pídele al usuario que ingrese la edad de su perro.
    * Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
 */

public class CalculaEdadPerro {

    public static void main(String[] args) {

        Scanner ingreseDatos = new Scanner(System.in);

        System.out.println("Ingrese la edad de su perro");

        int edad = ingreseDatos.nextInt();

        int edadHumana = edad * 7;

        System.out.println("La edad de su perro en edad humana es de: " + edadHumana);

        System.out.println("Fin del programa");
    }
}
