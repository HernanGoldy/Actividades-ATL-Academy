package modulo06.clase13.ejercicio1;

/*
TODO: Actividad 1 - Crea una clase base llamada "Figura" con métodos para calcular el área y el perímetro de una figura geométrica genérica.
 Luego, crea clases derivadas como "Triangulo", "Rectangulo" y "Circulo", que hereden de la clase base y sobreescriban los métodos para calcular el área y el perímetro según su forma específica.
 Crea instancias de las diferentes figuras y muestra sus áreas y perímetros
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Figura> figuras = new ArrayList<>();

    public static void main(String[] args) {

        boolean mostrarMenu = true;

        do {
            System.out.println("********************* MENU *********************");
            System.out.println("1. Crear una figura");
            System.out.println("2. Mostrar la sumatoria de areas de las figuras");
            System.out.println("0. Salir");

            Scanner teclado = new Scanner(System.in);
            int respuestaUsuario = teclado.nextInt();

            switch (respuestaUsuario) {
                case 1 -> crearFigura();
                case 2 -> mostrarSumatoriaDeAreas();
                case 0 -> mostrarMenu = false;
            }
        } while (mostrarMenu);

        System.out.println("Fin del programa");
    }

    private static void mostrarSumatoriaDeAreas() {

        double sumatoriaDeAreas = 0;

        for (Figura figura : figuras) {
            sumatoriaDeAreas += figura.calcularArea();
        }
        System.out.println("La sumatoria de areas de todas las figuras es: " + sumatoriaDeAreas + " cm");
    }

    private static void crearFigura() {

        System.out.println("Que figura desea crear?");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        Scanner teclado = new Scanner(System.in);
        int respuestaUsuario = teclado.nextInt();

        if (respuestaUsuario == 1) {
            Circulo circulo = new Circulo();
            circulo.cargarDatos();
            System.out.println("El area total es: " + circulo.calcularArea());
            figuras.add(circulo);
        }

        if (respuestaUsuario == 2) {
            Rectangulo rectangulo = new Rectangulo();
            rectangulo.cargarDatos();
            System.out.println("El area total es: " + rectangulo.calcularArea());
            figuras.add(rectangulo);
        }

        if (respuestaUsuario == 3) {
            Triangulo triangulo = new Triangulo();
            triangulo.cargarDatos();
            System.out.println("El area total es: " + triangulo.calcularArea());
            figuras.add(triangulo);
        }
    }
}
