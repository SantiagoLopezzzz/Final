package edu.jdc.modelos;

/* Fecha: 17 octubre 2023
   Autor: Camilo Hernández 
    Grafos versión uno
 */
public class Graphic {

// Variables globales
    private int matrixAdjancent[][];
    private int numberNodos;
    private String answer;
    private Nodo nodo[];

// Metodo constructor
    public Graphic() {
        answer = "";
    }

// Metodos Propios
    public String createMatrix(int nodos) {
        matrixAdjancent = new int[nodos][nodos];
        nodo = new Nodo[nodos];
        for (int i = 0; i < nodos; i++) {
            for (int j = 0; j < nodos; j++) {
                matrixAdjancent[i][j] = 0;
                //           numberNodos = 0;
                System.out.print(matrixAdjancent[i][j]);
            }
            System.out.println("");
        }

        answer = "Se ha creado la Matriz";
        return answer;

    }

    public void newNodo(String value) {
        Nodo objetoNodo = new Nodo(value);
        nodo[numberNodos] = objetoNodo;
        numberNodos++;
    }

    public void Findposition() {
        for (int i = 0; i < numberNodos; i++) {
            if (true) {
                
            } else {
            }
        }
    }

    public String newArc(String one, String two) {

        return one;

    }
// Metodos get y set

    public Nodo[] getNodo() {
        return nodo;
    }

    public void setNodo(Nodo[] nodo) {
        this.nodo = nodo;
    }

}
