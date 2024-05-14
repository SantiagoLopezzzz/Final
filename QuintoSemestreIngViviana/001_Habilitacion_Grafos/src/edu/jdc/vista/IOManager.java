package edu.jdc.vista;

import edu.jdc.modelo.MINodo;
import javax.swing.JOptionPane;

/*Fech: 17/10/23
  Autor: Santiago Lopez 
  Descripcion: Grafos version uno 
*/
public class IOManager {
    //Variables Globales
    
//Metodo Constructor 
    public IOManager() {
        
    }
//Metodos propios
    public String ImputString (String respuesta){//3
        String data = JOptionPane.showInputDialog(respuesta);
        return respuesta;
        
    }
    public String ImputInt (String valueData  ){//5
        String data = JOptionPane.showInputDialog(valueData);
        return data;
        
    }
        
    public String showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
        return message;
        
    }
    public MINodo[] showVector(MINodo vector[]) {
        try {
        String contenido = "";
        for (int i = 0; i < vector.length; i++) {
            contenido = contenido + vector[i].getValue()+  " ";

        }
        JOptionPane.showMessageDialog(null, contenido + " ");
        return vector;
        
        } catch (Exception error){
            System.out.println("Es nulo");
    }
        return null;
    }
    
}
