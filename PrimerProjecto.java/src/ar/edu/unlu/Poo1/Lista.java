package ar.edu.unlu.Poo1;

public class Lista {

    private Nodo inicio;
    private int cantidadElementos;

    public Lista() {
        this.inicio = null;
        this.cantidadElementos = 0;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (this.estaVacia()) {
            this.inicio = nuevoNodo;
        } else {
            Nodo nodoActual = this.inicio;
            while (nodoActual.hasSiguiente() && !nodoActual.valorIs(valor)) {
                nodoActual = nodoActual.getSiguiente();
            }
            if (!nodoActual.hasSiguiente() && !nodoActual.valorIs(valor)) {
                nodoActual.setSiguiente(nuevoNodo);
            }
        }
        this.cantidadElementos++;
    }

    public boolean estaVacia() {
        return this.cantidadElementos == 0;
    }

    public int obtenerLongitud() {
        return this.cantidadElementos;
    }

    public boolean eliminar(int valor) {
        if (this.estaVacia()) {
            return false;
        }

        if (this.inicio.valorIs(valor)) {
            this.inicio = this.inicio.getSiguiente();
            this.cantidadElementos--;
            return true;
        }

        Nodo nodoActual = this.inicio;
        while (nodoActual.hasSiguiente() && !nodoActual.getSiguiente().valorIs(valor)) {
            nodoActual = nodoActual.getSiguiente();
        }

        if (nodoActual.hasSiguiente()) {
            nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
            this.cantidadElementos--;
            return true;
        }

        return false; // No se encontró el elemento
    }

    public int obtener(int indice) {
        if (indice < 0 || indice >= this.cantidadElementos) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        Nodo nodoActual = this.inicio;
        for (int i = 0; i < indice; i++) {
            nodoActual = nodoActual.getSiguiente();
        }
        return nodoActual.getValor();
    }

    public void insertarEn(int indice, int valor) {
        if (indice < 0 || indice > this.cantidadElementos) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        Nodo nuevoNodo = new Nodo(valor);

        if (indice == 0) {
            nuevoNodo.setSiguiente(this.inicio);
            this.inicio = nuevoNodo;
        } else {
            Nodo nodoActual = this.inicio;
            for (int i = 0; i < indice - 1; i++) {
                nodoActual = nodoActual.getSiguiente();
            }
            nuevoNodo.setSiguiente(nodoActual.getSiguiente());
            nodoActual.setSiguiente(nuevoNodo);
        }
        this.cantidadElementos++;
    }

    public void imprimirLista() {
        Nodo nodoActual = this.inicio;
        while (nodoActual != null) {
            System.out.print(nodoActual.getValor() + " -> ");
            nodoActual = nodoActual.getSiguiente();
        }
        System.out.println("null");
    }
}
