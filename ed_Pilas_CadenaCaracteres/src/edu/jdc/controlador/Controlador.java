package edu.jdc.controlador;

import edu.jdc.modelo.Pila;
import edu.jdc.vista.Vista;


public class Controlador {
   private Pila model;
    private Vista view;

    public Controlador(Pila model, Vista view) {
        this.model = model;
        this.view = view;
    }

    public void checkBalance(String input) {
        boolean balanced = model.isBalanced(input);
        view.displayResult(balanced);
    } 
}
