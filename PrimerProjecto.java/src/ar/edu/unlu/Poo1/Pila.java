package ar.edu.unlu.Poo1;

public class Pila {

    private Nodo tope;
    private int cantidadElementos;

    public Pila() {
        this.cantidadElementos = 0;
    }

    public void apilar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (!this.estaVacia()) {
            nuevoNodo.setSiguiente(this.tope);
        }
        this.tope = nuevoNodo;
        this.cantidadElementos++;
    }

    public int desapilar() {
        if (this.estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        int valor = this.tope.getValor();
        this.tope = this.tope.getSiguiente();
        this.cantidadElementos--;
        return valor;
    }

    public boolean estaVacia() {
        return this.cantidadElementos == 0;
    }

    public int tamanio() {
        return this.cantidadElementos;
    }

    public void imprimirPila() {
        Nodo actual = tope;
        while (actual != null) {
            System.out.print(actual.getValor() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }
}
