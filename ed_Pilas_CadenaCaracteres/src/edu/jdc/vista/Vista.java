package edu.jdc.vista;


public class Vista {
    public void displayResult(boolean balanced) {
        if (balanced) {
            System.out.println("Los parentesis están balanceados.");
        } else {
            System.out.println("Los parentesis estan desbalanceados.");
        }
    }
}
