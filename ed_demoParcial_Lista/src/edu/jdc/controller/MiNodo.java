package edu.jdc.controller;

public class MiNodo {

    private String pregunta;
    private String respuestaCorrecta;
    private String llave;
    private MiNodo siguiente;

    public MiNodo() {
    }

    public MiNodo(String pregunta, String respuestaCorrecta, String llave, MiNodo siguiente) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.llave = llave;
        this.siguiente = siguiente;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public MiNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(MiNodo siguiente) {
        this.siguiente = siguiente;
    }



}
