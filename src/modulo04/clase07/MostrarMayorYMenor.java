package modulo04.clase07;

/*
Todo: Actividad 2 - Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor
 */

import java.util.Scanner;
public class MostrarMayorYMenor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese un número y presione enter:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = teclado.nextInt();
        }

        int numeroMax = numeros[0];
        int numeroMin = numeros[0];

        for (int i = 0; i < 5; i++) {

            if (numeroMin > numeros[i]) {
                numeroMin = numeros[i];
            }

            if (numeroMax < numeros[i]) {
                numeroMax = numeros[i];
            }
        }

        System.out.println("El número maximo es: " + numeroMax);
        System.out.println("El número mínimo es: " + numeroMin);
    }
}
