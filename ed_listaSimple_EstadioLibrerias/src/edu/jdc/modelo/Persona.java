package edu.jdc.modelo;


public class Persona {
    private String nombre;
    private int numeroDocumento;
    private int edad;
    private boolean esLocal;
    private int numeroSilla;

    public Persona(String nombre, int numeroDocumento, int edad, boolean esLocal, int numeroSilla) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.esLocal = esLocal;
        this.numeroSilla = numeroSilla;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public boolean esMenor() {
        return edad < 18;
    }

    public boolean EsLocal() {
        return esLocal;
    }

    public int getNumeroSilla() {
        return numeroSilla;
    }

    public int cobrarTarifa (){
        
        return esLocal ? 50000 : 70000;
        
    }
}
