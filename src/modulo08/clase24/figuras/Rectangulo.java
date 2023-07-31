package modulo08.clase24.figuras;

public class Rectangulo implements FiguraGeometrica {

    private double altura;
    private double ancho;

    public double area() {
        return (double) Math.round(altura * ancho);
    }

    public Rectangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }
}
