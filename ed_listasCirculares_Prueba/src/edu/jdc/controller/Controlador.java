package edu.jdc.controller;

import edu.jdc.modelo.ModeloCircular;
import java.util.Random;


public class Controlador {
    private ModeloCircular sillas;
    private Random random;

    // Constructor
    public Controlador() {
        random = new Random();
    }

    // Método para inicializar el juego
    public void initializeGame(int numChairs, int numPlayers) {
        sillas = new ModeloCircular(numChairs);
        for (int i = 1; i <= numChairs; i++) {
            sillas.add(i);
        }
        playGame(numPlayers);
    }

    // Método para simular el juego
    private void playGame(int numPlayers) {
        int head = 0;
        while (sillas.size() > 1) {
            int eliminationIndex = random.nextInt(numPlayers);
            for (int i = 0; i < eliminationIndex; i++) {
                head = (head + 1) % sillas.size();
            }
            System.out.println("Se elimino la silla numero: " + sillas.removeNextNode());
            System.out.println("Se detuvo la musica ");
        }
        System.out.println("El ganador es el jugador numero  numero: " + sillas.removeNextNode() + "");
    }
}
