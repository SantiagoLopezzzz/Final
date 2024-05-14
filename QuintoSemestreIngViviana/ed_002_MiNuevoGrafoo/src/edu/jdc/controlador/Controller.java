package edu.jdc.controlador; //Segundo 
/*Fech: 17/10/23
  Autor: Santiago Lopez 
  Descripcion: Grafos version uno 
 */
import edu.jdc.modelo.Graph;
import edu.jdc.vista.IOManager;
import javax.swing.JOptionPane;
import edu.jdc.modelo.MiNodo;

public class Controller {
//Variables Globales
    
    private IOManager objetoIOManager;
    private Graph objetoGraphic;
    private int numeroNodos;
    private String answer;
    private MiNodo[] vector;
    private String nodoOrigen;
    private String nodoDestino;
    private int pesoOrigen;
    private int pesoDestino;
    private int peso;
//Metodo Constructor 

    public Controller() {
        objetoIOManager = new IOManager();
        objetoGraphic = new Graph();
        answer = "";
    }

//Metodos propios
    public String InformationRequest() {//3
        try {
             numeroNodos = Integer.parseInt(objetoIOManager.ImputInt("Digite el numero de nodos "));//4
            answer = objetoGraphic.CreateMatrix(numeroNodos);
        } catch (NumberFormatException error) {  
            JOptionPane.showMessageDialog(null, "Solo se aceptan numeros", "Error", JOptionPane.ERROR_MESSAGE);
            return InformationRequest();
        }
        
        return objetoIOManager.showMessage(answer);
        
    }
    
    public String fellMatrix (){
        String nameNodo ;
        for (int i = 0; i < numeroNodos; i++) {
            nameNodo = objetoIOManager.ImputInt("Digite el nombre del nodo o vertice ");
            objetoGraphic.newNodo(nameNodo);
        }
        answer = "Se creo y lleno el vector ";
        return objetoIOManager.showMessage(answer);
        
    }
    public MiNodo[] vector() {
        vector = objetoGraphic.getNodo();
        return objetoIOManager.showVector(vector);

    }
    
    public String relacionNodo (){
        int decision = 0;
        vector();
        String matrix = "";
        int[][] pesoMatrix = objetoGraphic.matrizPeso(numeroNodos);
        do { 
            
            nodoOrigen = objetoIOManager.ImputInt("Digite el nodo de origen ");
            nodoDestino = objetoIOManager.ImputInt("Digite el nodo de Destino ");
            answer = objetoGraphic.newArist(nodoOrigen,nodoDestino);
            
            objetoIOManager.showMessage(answer);
            answer= objetoGraphic.showMatrix();
            objetoIOManager.showMessage(answer);
            
            
            //
            pesoOrigen = objetoGraphic.buscarposition(nodoOrigen);
            pesoDestino = objetoGraphic.buscarposition(nodoDestino);
            peso = Integer.parseInt(objetoIOManager.ImputInt("Ingrese el peso del grafo"));
            pesoMatrix[pesoOrigen][pesoDestino]= peso;
            
            decision = Integer.parseInt(objetoIOManager.ImputInt("Digite 1 para ingresar un nuevo dato \n Digite 2 para salir ")); 
        } while (decision == 1);
        matrix = "";
        for (int i = 0; i < pesoMatrix.length; i++) {
            for (int j = 0; j < pesoMatrix[0].length; j++) {
                matrix += pesoMatrix[i][j] + " ";
            }
            matrix += "\n";
        }
        objetoIOManager.showMessage(matrix);


    return objetoIOManager.showMessage(answer);
    }
    
    public void Init() { //2
        InformationRequest();
        fellMatrix ();
        relacionNodo ();
    }
    
}
