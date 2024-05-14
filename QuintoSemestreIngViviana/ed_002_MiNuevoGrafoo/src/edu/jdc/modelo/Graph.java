package edu.jdc.modelo;

import javax.swing.JOptionPane;

/*Fech: 17/10/23
  Autor: Santiago Lopez 
  Descripcion: Grafos version uno 
 */
public class Graph {
//Variables Globales
    private int matrixAdjacent[][];
    private String answerd;
    private MiNodo nodo[];
    private int numberNodos;

//Metodo Constructor 
    public Graph() {
        answerd = "";
    }
    
//Metodos propios
    public String CreateMatrix(int Nodos) {
        matrixAdjacent = new int[Nodos][Nodos];
        nodo = new MiNodo[Nodos];
        for (int i = 0;  i< Nodos; i++) {
            for (int j = 0; j < Nodos; j++) {
                matrixAdjacent[i][j]= 0;
                System.out.print(matrixAdjacent[i][j]);
            }
            System.out.print("");
        }
        
        answerd = "Se creo y lleno la matriz";
        return answerd;
    }
    public void newNodo (String value){
        MiNodo objectNodo = new MiNodo(value);
        nodo[numberNodos] = objectNodo;
        numberNodos++;
    }

    public int buscarposition(String value) {
        for (int i = 0; i < numberNodos; i++) {
            if (nodo[i].getValor().equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public String newArist(String origen, String destino) {
        int valorOrigen, valorDestino;
        
        valorOrigen = buscarposition(origen);
        valorDestino = buscarposition(destino);
        
        if (valorOrigen >= 0 && valorDestino >= 0) {
            matrixAdjacent[valorOrigen][valorDestino] = 1;
//            JOptionPane.showInputDialog(matrixAdjacent[valorOrigen][valorDestino]);
            answerd = "Se creo de manera exitosa el arco ";
        } else {
            answerd = "Nodo no se encuentra ";
        }
        return answerd;
    }
    public String seeArcs() {
        System.out.println("Arcos");
        for (int i = 0; i < matrixAdjacent.length; i++) {
            for (int j = 0; j < matrixAdjacent[0].length; j++) {
                if (matrixAdjacent[i][j] == 1) {
                    System.out.println(nodo[i].getValor() + " -> " + nodo[j].getValor());
                }
            }
        }
        return "";
    }

    public String showMatrix() {
        String matrixUnos = "";
        for (int i = 0; i < numberNodos; i++) {
            for (int j = 0; j < numberNodos; j++) {
                matrixUnos += matrixAdjacent[i][j] + " ";
                answerd = "Se creo de manera exitosa matrix";
            }
            matrixUnos += "\n";
        }
        return matrixUnos;
    }

    public int[][] matrizPeso (int nodo){
        int[][] pesoMatriz = new int[nodo][nodo];

        for (int i = 0; i < nodo; i++) {
            for (int j = 0; j < nodo; j++) {
                pesoMatriz[i][j] = 0;
            }
        }

        for (int i = 0; i < nodo; i++) {
            for (int j = 0; j < nodo; j++) {
                int arcPeso = matrixAdjacent[i][j];
                if (arcPeso > 0) {
                    pesoMatriz[i][j] = arcPeso;
                }
            }
        }
        return pesoMatriz;
        
    }

    public MiNodo[] getNodo() {
        return nodo;
    }

    public void setNodo(MiNodo[] nodo) {
        this.nodo = nodo;
    }
    
    
}
