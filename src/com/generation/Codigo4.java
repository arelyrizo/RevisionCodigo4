package com.generation;

import java.util.Scanner;// se Importo Scanner 

public class Codigo4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Se corrigió el objeto Scanner y se agregó System.in.

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");

        String j1 = s.nextLine();
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        // se agrego jugador 2 ya que era 1 
        // se elimino S2 y Scanner = new Scanner(); ya que eran ineccesarios  
        String j2 = s.nextLine();

        if (j1.equals(j2)) { // Se corrigió la comparación utilizando equals.
            System.out.println("Empate");
        } else {
            int g = 0; // Se corrigió el número de jugador por 0.

            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break; // Se agregó un breeak 

                case "papel":
                    if (j2.equals("piedra")) {
                    // se elmino parentesis en j2 
                        g = 1; // se cambio el numero a 1 
                    }
                    break; // Se agregó break para detener la ejecucion.

                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break; // Se agregó break

                default:
                    g = 0; // Se cambio por numero 0.
            }

            System.out.println("Gana el jugador " + (g + 1)); 
            // se agregaron parentesis un simbolo + y ademas  se agreggo número de jugador1.
        }
    }
}

  