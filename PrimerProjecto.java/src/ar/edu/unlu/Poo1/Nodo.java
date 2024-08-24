package ar.edu.unlu.Poo1;

public class Nodo {

    /**
     * Nodo siguiente a este nodo
     */
    private Nodo siguiente;

    private Object valor;

    public Nodo(int valor) {
        this.valor = valor;
    }

    public Object getValor() {
        return this.valor;
    }

    public void setSiguiente(Nodo nodo){
        this.siguiente = nodo;
    }

    public boolean hasSiguiente() {
        return this.siguiente != null;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public boolean valorIs(Object valor) {
        return this.valor == valor;
    }
}


