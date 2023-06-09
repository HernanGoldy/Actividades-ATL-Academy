package modulo04.clase06;

/*
TODO: Actividad 3 - Armar un programa que permita llamar a una persona por Whatsapp
    * Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
    * Muestra en consola la concatenación de:
        “https://api.whatsapp.com/send?phone=” + telefono
 */

import java.util.Scanner;

public class LlamarPorWhatsApp {

    public static void main(String[] args) {

        Scanner ingresaDato = new Scanner(System.in);

        System.out.println("Ingrese un número de teléfono (sin espacios) para llamar por WhatsApp:");
        String telefono = ingresaDato.next();

        String urlWhatsApp = "https://api.whatsapp.com/send?phone=" + telefono;

        System.out.println("Éste es el link para llamar: " + urlWhatsApp);
    }
}
