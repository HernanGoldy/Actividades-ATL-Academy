package example.figuras;

/*
Ejercicio 1:
Crea una interfaz FiguraGeometrica con el método calcularArea().
Implementa esta interfaz en las clases Circulo y Rectangulo, calculando el área de cada figura en sus respectivas implementaciones.
 */

import example.figuras.Circulo;
import example.figuras.Rectangulo;

public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(2.3, 5.2);
        System.out.println("Area del Rectangulo: " + rectangulo.area());

        Circulo circulo = new Circulo(10.2);
        System.out.println("Area del Circulo: " + circulo.area());
    }
}
