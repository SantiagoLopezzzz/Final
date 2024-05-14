package edu.jdc.modelo;

public class ModeloCircular {
private Object[] data;
    private int size;
    private int head;

    // Constructor
    public ModeloCircular(int capacity) {
        data = new Object[capacity];
        size = 0;
        head = -1;
    }

    // Método para agregar un elemento al final de la lista
    public void add(Object value) {
        if (size == data.length) {
            throw new IllegalStateException("Lista llena");
        }
        if (head == -1) {
            head = 0;
        }
        int index = (head + size) % data.length;
        data[index] = value;
        size++;
    }

    // Método para eliminar el nodo siguiente al nodo actual
    public Object removeNextNode() {
        if (isEmpty()) {
            throw new IllegalStateException("Lista vacía");
        }
        Object removedData = data[head];
        head = (head + 1) % data.length;
        size--;
        return removedData;
    }

    // Método para obtener el tamaño de la lista
    public int size() {
        return size;
    }

    // Método para verificar si la lista está vacía
    public boolean isEmpty() {
        return size == 0;
    }
}
