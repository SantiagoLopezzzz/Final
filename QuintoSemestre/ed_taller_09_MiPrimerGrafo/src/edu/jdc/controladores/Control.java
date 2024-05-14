package edu.jdc.controladores;

import edu.jdc.modelos.Graphic;
import edu.jdc.modelos.Nodo;
import edu.jdc.vistas.IOmanager;
import javax.swing.JOptionPane;

/* Fecha: 17 octubre 2023
   Autor: Camilo Hernández 
    Grafos versión uno
 */
public class Control {

//Variables globales
    private IOmanager objetoIOmanager;
    private Graphic objetoGraphic;
    private String answer;
    private int numberNodos;
    private Nodo[] vector;

// Metodo constructor
    public Control() {
        objetoIOmanager = new IOmanager();
        objetoGraphic = new Graphic();
        answer = "";
    }

// Metodos Propios
    public String requestinformation() {

        try {
            numberNodos = Integer.parseInt(objetoIOmanager.imputInt("Digite el número de Nodos"));
            answer = objetoGraphic.createMatrix(numberNodos);
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Solo se aceptan numeros", "Error", JOptionPane.ERROR_MESSAGE);
            return requestinformation();

        }
        return objetoIOmanager.showAnswer(answer);

    }

    public String fillMatrix() {
        String identificationNodo;
        for (int i = 0; i < numberNodos; i++) {
            identificationNodo = objetoIOmanager.imputInt("Digite el identificador o nombre del nodo");
            objetoGraphic.newNodo(identificationNodo);
        }
        answer = "Se creo y se lleno el vector";
        return objetoIOmanager.showAnswer(answer);

    }

    public Nodo[] vector() {
        vector = objetoGraphic.getNodo();
        return objetoIOmanager.showVector(vector);
    }

    public String MessajeConnection() {
        vector();
        String homeNode = "";
        String endNode = "";
        for (int i = 0; i < vector.length; i++) {
            homeNode = objetoIOmanager.imputInt("Digite Nodo Inicio");
            endNode = objetoIOmanager.imputInt("Digite Nodo Destino");

        }

        return objetoGraphic.newArc(homeNode, endNode);

    }

    public void init() {
        requestinformation();
        fillMatrix();
        MessajeConnection();

    }

// Metodos get y set
}
