package edu.jdc.runner;

import edu.jdc.controller.Controlador;
import edu.jdc.vista.View;


public class Run {
    public static void main(String[] args) {
        View gameView = new View();
        Controlador gameController = new Controlador();

        gameView.displayMessage(" Bienvenido al juego de las sillas ");
        int numChairs = gameView.promptNumChairs();
        int numPlayers = gameView.promptNumPlayers();

        gameController.initializeGame(numChairs, numPlayers);
    }
}
