package edu.jdc.controlador;

import edu.jdc.modelo.Lista;

import edu.jdc.modelo.NodoPila;


public class Controlador {
     private NodoPila pila;
    private Lista lista;

    public Controlador() {
    }

    public Controlador(NodoPila pila, Lista lista) {
        this.pila = pila;
        this.lista = lista;
    }

    public String convertirNotacionAPolaca(String expresion) {
        for (int i = 0; i < expresion.length(); i++) {
            String carac = String.valueOf(expresion.charAt(i));
            if (Character.isLetterOrDigit(expresion.charAt(i))) {
                lista.insertarAlfinal(carac);
            } else if(carac.equals("(")){
                pila.push(carac);
            } else if (carac.equals(")")) {
                while (!pila.isEmpty() && pila.top.dato.equals(")")) {
                    lista.insertarAlfinal(pila.pop());
                }
                if (!pila.isEmpty() && pila.top.dato.equals("(")) {
                    pila.pop();
                } else {
                    return "Expresión inválida";
                }
            } else {
                while (!pila.isEmpty() && precedencia(pila.top.dato) >= precedencia(carac)) {
                    lista.insertarAlfinal(pila.pop());
                }
                pila.push(carac);
            }
        }
        while (!pila.isEmpty()) {
            lista.insertarAlfinal(pila.pop());
        }
        return lista.convertirAString();


    }

    private int precedencia(String operador) {
        switch (operador) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return -1;
        }
    }
}
