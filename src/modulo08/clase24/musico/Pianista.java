package modulo08.clase24.musico;

public class Pianista implements Musico {

    @Override
    public void tocarInstrumento() {

        System.out.println("Que lindo es tocar el piano");
    }

    public static interface Musico {

        public void tocarInstrumento();
    }
}
