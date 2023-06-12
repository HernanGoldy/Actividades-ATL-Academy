package modulo04.clase06;

/*
TODO: Actividad 4 - Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”
 */

import java.util.Scanner;

public class CuentoInteractivo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("""
                Cuento interactivo
                Caminamos juntos por el bosque, sintiendo la magia y el misterio que envuelven el lugar. De repente, escuchamos un ruido extraño proveniente de un arbusto cercano. ¿Qué deberíamos hacer?  ¿Investigar el ruido o seguir nuestro camino?
                Es una noche estrellada, te encuentras en un bosque misterioso:
                1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante.
                2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora.
                """);
        System.out.println("Elija a opción 1 o 2");
        int opcion = input.nextInt();

        switch (opcion) {
            case 2:
                System.out.println("""
                        Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas:
                        1) Entras por la puerta de la izquierda.
                        2) Optas por la puerta de la derecha.
                        """);
            case 1:
                System.out.println("""
                                                
                        """);
        }
    }
}
