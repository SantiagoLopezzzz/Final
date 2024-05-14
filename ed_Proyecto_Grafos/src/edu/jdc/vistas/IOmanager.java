package edu.jdc.vistas;

import edu.jdc.modelos.Nodo;
import javax.swing.JOptionPane;

/* Fecha: 17 octubre 2023
   Autor: Camilo Hernández 
    Grafos versión uno
 */
public class IOmanager {
//Variables globales
// Metodo constructor

// Metodos Propios
    public void imputString() {
        String data = JOptionPane.showInputDialog("campo");
    }

    public String imputInt(String valueData) {
        String data = JOptionPane.showInputDialog(valueData);
        return data;

    }

    public String showAnswer(String message) {
        JOptionPane.showMessageDialog(null, message);
        return message;
    }

    public Nodo[] showVector(Nodo vector[]) {
        try {
           
             String contenido = "";
        for (int i = 0; i < vector.length; i++) {
            contenido = contenido + vector[i].getValue() +  " ";

        }
        JOptionPane.showMessageDialog(null, contenido + " ");
        return vector;
            
        } catch (Exception e) {
            System.out.println("El vector es nulo.");
        }
        return null;

    }

// Metodos get y set
}
