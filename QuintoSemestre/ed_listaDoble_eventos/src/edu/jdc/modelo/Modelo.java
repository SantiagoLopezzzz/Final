package edu.jdc.modelo;

public class Modelo {
    private int id;
    private String tipo;
    private int idUsuario;
    private String fechaHora;
    private String contenido;

    public Modelo() {
    }

    public Modelo(int id, String tipo, int idUsuario, String fechaHora, String contenido) {
        this.id = id;
        this.tipo = tipo;
        this.idUsuario = idUsuario;
        this.fechaHora = fechaHora; //localdatetime
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    
    
}
