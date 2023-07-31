package modulo08.clase24.figuras;

/*
Ejercicio 1:
Crea una interfaz FiguraGeometrica con el método calcularArea().
Implementa esta interfaz en las clases Circulo y Rectangulo, calculando el área de cada figura en sus respectivas implementaciones.
*/

public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(2.3, 5.4);
        System.out.println("Area del rectangulo: " + rectangulo.area());

        Circulo circulo = new Circulo(10.7);
        System.out.println("Area del circulo: " + circulo.area());
    }
}
