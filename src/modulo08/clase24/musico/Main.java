package modulo08.clase24.musico;

/*
Ejercicio 2:
Crea una interfaz llamada Músico con el método abstracto tocarInstrumento().
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

    public static class Guitarrista implements Musico {

        @Override
        public void tocarInstrumento() {

            System.out.println("Que lindo es tocar la guitarra");
        }

        public static class Pianista implements Musico {

            @Override
            public void tocarInstrumento() {

                System.out.println("Que lindo es tocar el piano");
            }
        }
    }
}
