package modulo04.clase06;

/*
TODO: Actividad 2 - Armar un buscador de tweets para Twitter.com
    * Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
    * Muestra en consola la concatenación de:
        “https://twitter.com/search?q=” + palabra
 */

import java.util.Scanner;

public class BuscarTwwets {

    public static void main(String[] args) {

        Scanner ingresaDato = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la celebridad que desea buscar en Twitter.com:");
        String consulta = ingresaDato.next();

        String urlBuscada = "https://twitter.com/search?q=" + consulta;

        System.out.println("Éste es el link de la búsqueda: " + urlBuscada);
    }
}
