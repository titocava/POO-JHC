package ar.edu.unlu.Poo1;

public class ColaEnlazada<T> implements Cola<T> {

    // Nodo de la cola
    private static class Nodo<T> {
        private T dato;
        private Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo<T> frente;  // Nodo del frente de la cola
    private Nodo<T> finalCola; // Nodo del final de la cola
    private int tamanio;

    // Constructor para crear una cola vacía
    public ColaEnlazada() {
        this.frente = null;
        this.finalCola = null;
        this.tamanio = 0;
    }

    @Override
    public void encolar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (estaVacia()) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
        tamanio++;
    }

    @Override
    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T elemento = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            finalCola = null;
        }
        tamanio--;
        return elemento;
    }

    @Override
    public T frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }

    @Override
    public boolean estaVacia() {
        return frente == null;
    }

    @Override
    public int tamanio() {
        return tamanio;
    }

    @Override
    public void imprimirCola() {
        Nodo<T> actual = frente;
        while (actual != null) {
            System.out.print(actual.dato + " <- ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
