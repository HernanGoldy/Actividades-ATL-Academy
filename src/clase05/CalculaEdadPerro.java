package clase05;

import java.util.Scanner;

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
