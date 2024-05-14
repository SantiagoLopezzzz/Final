package edu.jdc.controlador;

public class Cliente {
    public String nombreCliente;
    public int numeroTicket;

    public Cliente(String nombreCliente, int numeroTicket) {
        this.nombreCliente = nombreCliente;
        this.numeroTicket = numeroTicket;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    
    
}
