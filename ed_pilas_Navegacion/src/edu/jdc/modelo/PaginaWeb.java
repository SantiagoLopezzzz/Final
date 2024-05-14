package edu.jdc.modelo;


public class PaginaWeb {

    private String url;
    private String titulo;

    public PaginaWeb(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public String getTitulo() {
        return titulo;
    }
}
