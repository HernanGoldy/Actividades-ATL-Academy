package modulo06.clase13.ejercicio1;

import java.util.Scanner;

public class Circulo extends Figura {

    // atributos (características)
    private double radio;

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    // constructores


    // métodos/funciones (comportamientos)
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }

    public void cargarDatos() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el radio en cm:");
        radio = teclado.nextInt();
    }
}
