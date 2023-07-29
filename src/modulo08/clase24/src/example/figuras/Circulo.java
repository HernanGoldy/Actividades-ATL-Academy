package example.figuras;

public class Circulo implements FiguraGeometrica {

    private double radio;

    @Override
    public double area() {
        return Math.round(Math.PI * (radio * radio));
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

}
