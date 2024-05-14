package edu.jdc.modelo;
/*Fech: 17/11/23
  Autor: Santiago Lopez 
  Descripcion: Proyecto version uno 
 */
public class MiNodo {
//Variables Globales
    private String value;
//Metodo Constructor     
    public MiNodo() {
    }
    public MiNodo(String value) {
        this.value = value;
    }
    
//Metodos propios   
    
// get y set 

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



}
