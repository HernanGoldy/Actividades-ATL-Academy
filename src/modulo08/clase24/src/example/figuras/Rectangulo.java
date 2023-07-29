package example.figuras;

import example.figuras.FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica {

    private double altura;
    private double ancho;

    @Override
    public double area() {
        return Math.round(altura * ancho);
    }

    public Rectangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }

}
