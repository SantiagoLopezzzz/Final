package edu.jdc.modelo;


public class Pila {
    private Modelo tope;

    public Pila() {
        tope = null;
    }
    
    public boolean estaVacia() {
        return tope == null;
    }

    public void push(char c) {
        Modelo nuevo = new Modelo(c);
        if (tope == null) {
            tope = nuevo;
        } else {
            nuevo.siguiente = tope;
            tope = nuevo;
        }
    }

    public int pop() {
        if (estaVacia()) {
            System.out.println("Esta vacia");
            return -1; 
        } 
            int dato = tope.valor;
            tope = tope.siguiente;
            
            return pop();
        
    }

     public boolean isBalanced(String input) {
        Pila pila = new Pila();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.estaVacia()|| pila.pop() != '(') {
                    return false;
                }
            }
        }
        return pila.estaVacia();
    }

    
}
