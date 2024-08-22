package ar.edu.unlu.Poo1;

public class NodoDoble {
    private NodoDoble anterior;
    private NodoDoble siguiente;
    private final int valor;

    public NodoDoble(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public void setSiguiente(NodoDoble nodo) {
        this.siguiente = nodo;
    }

    public NodoDoble getSiguiente() {
        return this.siguiente;
    }

    public void setAnterior(NodoDoble nodo) {
        this.anterior = nodo;
    }

    public NodoDoble getAnterior() {
        return this.anterior;
    }

    public boolean hasSiguiente() {
        return this.siguiente != null;
    }

    public boolean hasAnterior() {
        return this.anterior != null;
    }

    public boolean valorIs(int valor) {
        return this.valor == valor;
    }
}
