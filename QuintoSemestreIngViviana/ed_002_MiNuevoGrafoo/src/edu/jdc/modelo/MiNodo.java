package edu.jdc.modelo;
/*Fech: 17/10/23
  Autor: Santiago Lopez 
  Descripcion: Grafos version uno 
 */
public class MiNodo {
//Variables Globales

    private String value;

//Metodo Constructor 
    public MiNodo() {
        value = "";
        
    }

    public MiNodo(String value) {
        this.value = value;
    }
    
    
//Metodos propios
//metodo que srive pára verificar la duplicidad de los nodos 
    public boolean nodosIguales (MiNodo vertice){
        
        return value.equals(vertice.value);
        
    }
// get y set 
    public String getValor() {
        return value;
    }

    public void setValor(String valor) {
        this.value = valor;
    }

}
