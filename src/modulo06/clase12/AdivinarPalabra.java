package modulo06.clase12;

/*
TODO: Actividad 5 - Crear un juego de adivinar la palabra:
 Este juego consiste en mostrar una pista o descripción y permitir al jugador adivinar la palabra correcta.
 Por ejemplo, el programa podría mostrar el mensaje:
 "Es un animal muy grande, con trompa. ¿Qué es?" El jugador debe ingresar su respuesta y el programa debe verificar si es correcta o no.
 */

import java.util.Scanner;

public class AdivinarPalabra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        palabra = palabra.toLowerCase();
        palabra = palabra.replaceAll("[^a-zA-Z]", "");
        palabra = palabra.replaceAll("\\s+", "");
        palabra = palabra.trim();
        System.out.println(palabra);
    }
}
