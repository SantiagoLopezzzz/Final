package edu.jdc.vista;
/*Fech: 17/10/23
  Autor: Santiago Lopez 
  Descripcion: Grafos version uno 
*/
import edu.jdc.modelo.MiNodo;
import javax.swing.JOptionPane;

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
    public MiNodo[] showVector(MiNodo vector[]) {
        String contenido = "";
        for (int i = 0; i < vector.length; i++) {
            contenido = contenido + vector[i].getValor()+  " ";

        }
        JOptionPane.showMessageDialog(null, contenido + " ");
        return vector;

        }
}
