package edu.jdc.modelo;

public class MemoriaModelo {
    public Variable inicio;
    public Variable fin;

    public MemoriaModelo() {
        inicio = null;
        fin = null;
    }

    public void asignarVariable(String nombre, int tamaño) {
        Variable nuevaVariable = new Variable(nombre, tamaño);
        if (inicio == null) {
            inicio = nuevaVariable;
            fin = nuevaVariable;
        } else {
            nuevaVariable.setAnterior(fin);
            fin.setSiguiente(nuevaVariable);
            fin = nuevaVariable;
        }
    }

    public void liberarUltimaVariable() {
        if (fin != null) {
            fin = fin.getAnterior();
            if (fin != null) {
                fin.setSiguiente(null);
            } else {
                inicio = null; // No hay más variables en la memoria
            }
        }
    }

    public Variable getInicio() {
        return inicio;
    }
    
    
}