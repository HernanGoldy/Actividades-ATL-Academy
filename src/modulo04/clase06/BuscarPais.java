package modulo04.clase06;

/*
TODO: Actividad 1 - Arma un buscador de países con Google Maps
    * Pídele al usuario que ingrese un país (Ej: Colombia).
    * Muestra en consola la concatenación de:
        “https://www.google.com/maps/search/” + pais
        Entonces, cuando haga click en el link que aparece en consola, se abrirá esa ubicación.
 */

import java.util.Scanner;

public class BuscarPais {

    public static void main(String[] args) {

        System.out.println("Pasos para buscar un país:\n* No ingrese acentos, diéresis o caracteres especiales.\n* Si ingresa más de una palabra, colocar el simbolo + en lugar de espacios entre palabras.\nIngresa el nombre del país que deseas encontrar:");

        Scanner ingresaDatos = new Scanner(System.in);

        String pais = ingresaDatos.next();

        String urlPais = "https://www.google.com/maps/search/" + pais;

        System.out.println("El link de la ubicación del país indicado es: " + urlPais + "\nFin del programa.");
    }
}
