package modulo06.clase13.ejercicio1;

public abstract class Figura {

    // atributos (características)
    private String colorFondo;

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    // métodos/funciones (Comportamientos)
    public abstract double calcularArea(); // Las funciones abstractas no tienen cuerpo.
}
