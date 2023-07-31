package modulo08.clase24.figuras;

public class Circulo implements FiguraGeometrica {

    private double radio;

    public double area() {
        return (double) Math.round(Math.PI * this.radio * this.radio);
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
}
