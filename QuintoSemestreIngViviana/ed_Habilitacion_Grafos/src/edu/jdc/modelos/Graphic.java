package edu.jdc.modelos;
/* Fecha: 17 octubre 2023
   Autor: Santiago 
    Grafos Habilitacion 
 */
import edu.jdc.vistas.FrmPrincipal;

public class Graphic {

// Variables globales
    private int matrixAdjancent[][];
    private int matrixArc[][];
    private int numberNodos;
    private String answer;
    private Nodo nodo[];

// Metodo constructor
    public Graphic() {
        
        answer = "";
        matrixAdjancent = new int[10][10];
    }

// Metodos Propios
    public String createMatrix(int nodos) {
        String c = "";
        matrixArc = new int[nodos][nodos];
        matrixAdjancent = new int[nodos][nodos];
        int[] lola = new int[nodos];
        int a = 0;
        nodo = new Nodo[nodos];
        System.out.println("MATRIZ");
        for (int i = 0; i < nodos; i++) {   
            for (int j = 0; j < nodos; j++) {
                c += matrixAdjancent[i][j] + "\t";
                FrmPrincipal.txtMatriz.setText(c + "\n");

                
            }
            
            System.out.println();
        }
        System.out.println("-----------------------");
        answer = "Se ha creado y llenado la matriz";
        
        return answer;
    }
    
    public String printMatrix(int[][] matrix) {
        String matrixString = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixString += matrix[i][j] + " ";
            }
            matrixString += "\n";
        }
        return matrixString;
    }
    
    public void newNodo(String value) {
        Nodo objetoNodo = new Nodo(value);
        nodo[numberNodos] = objetoNodo;
        numberNodos++;
    }
    
    public int findPosition(String value) {
        for (int i = 0; i < numberNodos; i++) {
            if (nodo[i].getValue().equals(value)) {
                return i;
            }
            
        }
        
        return -1;
        
    }
    
    public String newArc(String origen, String destino) {
        int valorOringen;
        int valorDestino;
        valorOringen = findPosition(origen);
        valorDestino = findPosition(destino);
        
        if (valorOringen >= 0 && valorDestino >= 0) {
            matrixAdjancent[valorOringen][valorDestino] = 1;
            answer = "Se creo de manera exitosa el arco";
        } else {
            answer = "El nodo no exite";
        }
        return answer;
        
    }
    
    public String seeArcs() {
        String linea = "";
        try {
            for (int i = 0; i < matrixAdjancent.length; i++) {
                for (int j = 0; j < matrixAdjancent[0].length; j++) {
                    if (matrixAdjancent[i][j] == 1) {
                        linea += (nodo[i].getValue() + "-> " + nodo[j].getValue ()); 
                        
                       FrmPrincipal.txtGrafos.setText(linea);
                    }
                }
            }
            
        } catch (Exception e) {
            System.out.println("La matriz es nula.");
        }
        return null;
    }
    
    public String showMatrix() {
        String matrixUnos = "";
        for (int i = 0; i < numberNodos; i++) {
            for (int j = 0; j < numberNodos; j++) {
                matrixUnos += matrixAdjancent[i][j] + " ";
                answer = "Se creo de manera exitosa matrix";
                FrmPrincipal.txtMatriz.setText(matrixUnos);
            }
            matrixUnos += "\n";
        }
        return matrixUnos;
    }

// Metodos get y set
    public Nodo[] getNodo() {
        return nodo;
    }
    
    public void setNodo(Nodo[] nodo) {
        this.nodo = nodo;
    }
    
}
