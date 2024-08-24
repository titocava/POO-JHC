package ar.edu.unlu.Poo1;

public class NodoLista {
    private Object valor;
    private NodoLista siguiente;

    public NodoLista(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
}

