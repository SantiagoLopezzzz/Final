package edu.jdc.banco.modelo;


public class Cuenta {
    private int idUsuario;
    private int contrasena;

    public Cuenta() {
    }

    public Cuenta(int idUsuario, int contrasena) {
        this.idUsuario = idUsuario;
        this.contrasena = contrasena;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    

    
    
    
}
