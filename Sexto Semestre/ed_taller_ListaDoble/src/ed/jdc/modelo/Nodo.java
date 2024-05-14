package ed.jdc.modelo;

public class Nodo {

    private int fecha;
    private String nombre;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo() {
    }

    public Nodo(int fecha, String nombre ) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDato() {
        return fecha;
    }

    public void setDato(int dato) {
        this.fecha = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }


}
