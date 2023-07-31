package modulo08.clase24.figuras;

public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(2.3, 5.4);
        System.out.println("Area del rectangulo: " + rectangulo.area());

        Circulo circulo = new Circulo(10.7);
        System.out.println("Area del circulo: " + circulo.area());
    }
}
