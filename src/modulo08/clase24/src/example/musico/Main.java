package example.musico;

/*
Ejercicio 2:
Crea una interfaz llamada Musico con el método abstracto tocarInstrumento().
Luego, implementa la interfaz en las clases Pianista y Guitarrista.
En cada clase, implementa el método tocarInstrumento() para que muestre un mensaje indicando qué instrumento está tocando cada músico.
 */

public class Main {

    public static void main(String[] args) {

        Pianista pianista = new Pianista();
        Guitarrista guitarrista = new Guitarrista();

        pianista.tocarInstrumento();
        guitarrista.tocarInstrumento();
    }
}
