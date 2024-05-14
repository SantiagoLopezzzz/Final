package edu.jdc.modelo;


import edu.jdc.controlador.Cliente;
import java.util.LinkedList;
import java.util.Queue;

public class ModeloAtencionCliente {
    private Queue<Cliente> cola = new LinkedList<>();
    private int contadorTickets;

    public ModeloAtencionCliente() {
        cola = new LinkedList<>();
        contadorTickets = 1;
        
    }
    
    public void agregarCliente (String nombre){
        cola.offer(new Cliente(nombre, contadorTickets++));
    }
    
    
    public Cliente atenderCliente (){
        
        return cola.poll();
        
    } 
    
    public boolean hayClientesEnEspera() {
        return !cola.isEmpty();
    }
}
