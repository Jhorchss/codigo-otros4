//El usuario debe poner una opción para jugar, debe elegir, "piedra, papel o tijera", al final se decidirá quién es el ganador.
//En caso de que sea empate el juego términa y deben volver a empezar.

package com.generation;

import java.util.Scanner; // se agrega el import, para leer la entrada del usuario desde la consola

public class codigo4 {

    public static void main(String[] args) { // Se agrega public cuando seleccionamos la clase
        Scanner s = new Scanner(System.in); //agregamos System.in dentro de parentesis, para que pueda leer
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // se agrega jugador "2"
        //Scanner s2 = new Scanner(); no sirve
        String j2 = s.nextLine();
        
        if (j1.equals(j2)) { //Se agrega Equals, para que compare respuestas en las 4 opciones
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                default:
                    System.out.println("Entrada no válida.");
                    return; // Salir del método main si la entrada no es válida
            }
            System.out.println("Gana el jugador " + g);
        }
        s.close(); // Cerrar el scanner
    }
}
