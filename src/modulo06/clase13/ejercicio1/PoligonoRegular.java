package modulo06.clase13.ejercicio1;

import java.util.Scanner;

public class PoligonoRegular extends Figura {

    // atributos (características)
    protected double base;
    protected double altura;

    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    // métodos/funciones (comportamientos)
    public void cargarDatos() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la base en cm:");
        base = teclado.nextInt();

        System.out.println("Ingresa la altura en cm:");
        altura = teclado.nextInt();
    }
}
