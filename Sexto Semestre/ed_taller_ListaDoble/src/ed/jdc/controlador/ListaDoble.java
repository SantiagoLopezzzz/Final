package ed.jdc.controlador;


import ed.jdc.modelo.Nodo;


public class ListaDoble {

    private Nodo primerNodo;
    private Nodo ultimoNodo;

    public ListaDoble() {
        this.primerNodo = null;
        this.ultimoNodo = null;
    }

    public void agregarEstudianteAlPrincipio(int fecha, String nombre) {
        Nodo nuevoNodo = new Nodo(fecha, nombre);
        if (estaVacia()) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(primerNodo);
            primerNodo.setAnterior(nuevoNodo);
            primerNodo = nuevoNodo;
        }

    }

    public void agregarEstudianteAlFinal(int fecha, String nombre) {
        Nodo nuevoNodo = new Nodo(fecha, nombre);
        if (estaVacia()) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(nuevoNodo);
            primerNodo.setAnterior(ultimoNodo);
            ultimoNodo = nuevoNodo;
        }
    }

    public void eliminarEstudianteDelFinal() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
        }else{
            ultimoNodo = ultimoNodo.getSiguiente();
        }

        
    }

    public void eliminarEstudianteDelPrincipio() {

    }
    
    public boolean estaVacia() {

        return primerNodo == null;

    }

    public void obtenerListaEstudiantes() {
        if (estaVacia()) {
            System.out.println("Lista vacia");
        }
        Nodo actual = primerNodo;
        while (actual != null) {
            System.out.println(actual.getDato() + "");
            actual = actual.getSiguiente();

        }
    }
}
