package modulo04.clase07;

/*
TODO: Actividad 3 - Mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números
 */

import java.util.Arrays;
import java.util.Scanner;

public class MostrarPromedio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(
                "Ingrese 5 números enteros para ebtener el promedio:\n" +
                "Digite un número:"
        );

        double[] numero = new double[5];
        double sumatoria = 0.0;

        for (int i = 0; i < numero.length; i++) {
            numero[i] = teclado.nextDouble();
            // sumatoria += numero[i];
        }


        //double promedio = sumatoria / numero.length;
        double promedio = Arrays.stream(numero).sum() / numero.length;

        System.out.println("El promedio de los 5 números ingresados es: " + promedio);
    }
}
