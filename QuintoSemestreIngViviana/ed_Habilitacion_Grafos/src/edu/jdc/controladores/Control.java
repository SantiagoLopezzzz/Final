package edu.jdc.controladores;
/* Fecha: 17 octubre 2023
   Autor: Santiago 
    Grafos Habilitacion 
 */
import edu.jdc.modelos.Graphic;
import edu.jdc.modelos.Nodo;
import edu.jdc.vistas.FrmPrincipal;
import edu.jdc.vistas.IOmanager;

import javax.swing.JOptionPane;

public class Control{

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

//        

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
        int decision;
        vector();
        String homeNode = "";
        String endNode = "";
        String matrixString = "";

        do {
            homeNode = objetoIOmanager.imputInt("Digite Nodo Inicio");
            endNode = objetoIOmanager.imputInt("Digite Nodo Destino");

            answer = objetoGraphic.newArc(homeNode, endNode);
//
            objetoIOmanager.showAnswer(answer);
            answer = objetoGraphic.showMatrix();
            objetoIOmanager.showAnswer(answer);
            objetoGraphic.seeArcs();

            decision = Integer.parseInt(objetoIOmanager.imputInt("Digite 1 para ingresar un nuevo arco \n Digite 2 para salir "));

//            
        } while (decision == 1);

        return objetoIOmanager.showAnswer(answer);

    }

    public void init() {
//        requestinformation();
//        fillMatrix();
//        MessajeConnection();

 
    }

// Metodos get y set
}
