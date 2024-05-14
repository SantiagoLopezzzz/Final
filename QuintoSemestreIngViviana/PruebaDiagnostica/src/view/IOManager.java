package view;

import javax.swing.JOptionPane;

/*
Nombre: Santiago Lopez Fonseca 
Fecha: 08/02/2024
Descripcion: Prueba Diagnostica 
 */
public class IOManager {

//Variables Globales
    
//Metodo Constructor 
    public IOManager() {
        
    }
//Metodos propios
    public String ImputString (String respuesta){
        String data = JOptionPane.showInputDialog(respuesta);
        return respuesta;
        
    }
    public String ImputInt (String valueData){
        String data = JOptionPane.showInputDialog(valueData);
        return data;      
    }
    
    
}
