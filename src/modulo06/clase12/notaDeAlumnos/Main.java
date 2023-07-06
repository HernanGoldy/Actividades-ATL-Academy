package modulo06.clase12.notaDeAlumnos;

/*
TODO: Actividad 4 - Crear un programa para ingresar las notas de alumnos utilizando programación orientada a objetos:
 El programa debe permitir al usuario cargar las notas de varios alumnos.
 Cada alumno debe tener atributos como nombre, apellido y una lista de notas.
 Utilizando la programación orientada a objetos, el programa debe permitir ingresar las notas de cada alumno y realizar cálculos como el promedio de notas.
 */

import modulo06.clase12.notaDeAlumnos.entidades.Alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.println("Ingrese la cantidad de alumnos");
        int cantidadAlumnos = read.nextInt();

        Double[] listaNotas = new Double[cantidadAlumnos];
        Alumno[] listaAlumnos = new Alumno[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {

            System.out.println("Ingrese nombre del alumno");
            String nombre = read.next();
            System.out.println("Ingrese apellido de " + nombre);
            String apellido = read.next();

            System.out.println("Ingrese la nota que obtuvo " + nombre);
            Double nota = read.nextDouble();


            Alumno alumno = new Alumno(nombre, apellido, nota);
            listaAlumnos[i] = alumno;
            listaNotas[i] =  listaAlumnos[i].getNota();
        }

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println(listaAlumnos[i].getNombre() + ": " + listaNotas[i]);
        }

    }
}
