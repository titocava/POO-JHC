package ar.edu.unlu.Poo1;

public class PilaEnlazada<T> implements Pila<T> {

    private static class Nodo<T> {
        private T dato;
        private Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo<T> cima;
    private int tamanio;

    public PilaEnlazada() {
        this.cima = null;
        this.tamanio = 0;
    }

    @Override
    public void apilar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
        tamanio++;
    }

    @Override
    public T desapilar() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T elemento = cima.dato;
        cima = cima.siguiente;
        tamanio--;
        return elemento;
    }

    @Override
    public T cima() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return cima.dato;
    }

    @Override
    public boolean estaVacia() {
        return cima == null;
    }

    @Override
    public int tamanio() {
        return tamanio;
    }
    // Método para imprimir la pila
    public void imprimirPila() {
        Nodo<T> actual = cima;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    
}
