package modulo06.clase12;

/*
TODO: Actividad 6 - Armar un programa que funcione como una lista de reproducción de Spotify simple:
 El programa debe permitir al usuario agregar canciones a una lista de reproducción.
 Cada canción debe tener atributos como título, artista y duración.
 El programa debe permitir reproducir las canciones en orden y mostrar la información de la canción que se está reproduciendo en ese momento.
 */

import java.util.Scanner;

public class SimpleSpotify {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el título de la canción: ");
        String title = sc.nextLine();
        System.out.println("Ingrese el artista: ");
        String artist = sc.nextLine();
        System.out.println("Ingrese la duración: ");
        int duration = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la lista de reproducción: ");
        String playlist = sc.nextLine();

    }
}
