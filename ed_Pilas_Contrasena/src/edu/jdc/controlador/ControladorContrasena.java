package edu.jdc.controlador;

import edu.jdc.modelo.Pila;
import edu.jdc.vista.VistaContrasena;
import java.util.Random;


public class ControladorContrasena {
    private Pila modelo;
    private VistaContrasena vista;

    public ControladorContrasena(Pila modelo, VistaContrasena vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void manipularContrasena (String contrasena){
        EncriptarContrasena(contrasena);
        System.out.println("Contrasena encriptada ");
        
    }
    
    public void EncriptarContrasena(String contrasena) {
        Random random = new Random();
        StringBuilder contrasenaEncrip = new StringBuilder();
        char[] caracteresValidos = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for (int i = 0; i < contrasena.length(); i++) {
            int indiceAleatorio = random.nextInt(caracteresValidos.length);
            contrasenaEncrip.append(caracteresValidos[indiceAleatorio]);
            
        }
        modelo.push(contrasenaEncrip.toString());
    }
    
    
    public void Iniciar (){
        vista.obtenerContrasena();
    }
}
