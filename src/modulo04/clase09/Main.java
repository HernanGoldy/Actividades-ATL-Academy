package modulo04.clase09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        cuenta.setTitular("Daniela Morales");
        cuenta.mostrarDatos();
        String opcion;
        do {
            System.out.println("1.Ingresar dinero a la cuenta");
            System.out.println("2.Retirar dinero de la cuenta");

            int opcion1 = read.nextInt();
            if (opcion1 == 1) {
                System.out.println("Ingrese el dinero por favor");
                cuenta.ingresar(read.nextFloat());
            } else if (opcion1 == 2) {
                System.out.println("Ingrese el monto a retirar");
                cuenta.retirar(read.nextFloat());
            } else {
                System.out.println("Opcion incorrecta");
            }
            System.out.print("Resumen :");
            cuenta.mostrarDatos();
            System.out.println("Desear continuar? Si o no");
            opcion = read.next();

        } while (opcion.equalsIgnoreCase("si"));
    }
}
