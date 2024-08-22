package ar.edu.unlu.Poo1;

public class Cola {

    private Nodo cabeza;
    private Nodo cola;
    private int cantidadElementos;

    public Cola() {
        this.cantidadElementos = 0;
    }

    public void encolar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (this.estaVacia()) {
            this.cabeza = nuevoNodo;
            this.cola = nuevoNodo;
        } else {
            this.cola.setSiguiente(nuevoNodo);
            this.cola = nuevoNodo;
        }
        this.cantidadElementos++;
    }

    public int desencolar() {
        if (this.estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = this.cabeza.getValor();
        this.cabeza = this.cabeza.getSiguiente();
        this.cantidadElementos--;
        if (this.cabeza == null) {
            this.cola = null;
        }
        return valor;
    }

    public boolean estaVacia() {
        return this.cantidadElementos == 0;
    }

    public int tamanio() {
        return this.cantidadElementos;
    }

    public void imprimirCola() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }
}
