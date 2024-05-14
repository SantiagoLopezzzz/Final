package edu.jdc.modelo;
/*Fech: 17/10/23
  Autor: Santiago Lopez 
  Descripcion: Grafos version uno 
*/
public class MINodo {
//Variables Globales

    private String value;

//Metodo Constructor 

    public MINodo() {
        value="";
    }

    public MINodo(String value) {
        this.value = value;
    }
    
//get y set

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
