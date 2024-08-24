package ar.edu.unlu.Poo1;

public class Lista {
    private NodoLista cabeza;
    private int cantidad;

    public Lista() {
        this.cabeza = null;
        this.cantidad = 0;
    }

    // Agrega un elemento al final de la lista
    public void agregar(Object valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        nuevoNodo.setValor(valor);
        if (estaVacia()) {
            cabeza = nuevoNodo;
        } else {
            NodoLista actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        cantidad++;
    }

    // Elimina el primer nodo que contiene el valor especificado
    public boolean eliminar(Object valor) {
        if (estaVacia()) {
            return false;
        }

        if (cabeza.getValor().equals(valor)) {
            cabeza = cabeza.getSiguiente();
            cantidad--;
            return true;
        }

        NodoLista actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getValor().equals(valor)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() == null) {
            return false; // El valor no fue encontrado
        }

        actual.setSiguiente(actual.getSiguiente().getSiguiente());
        cantidad--;
        return true;
    }

    // Imprime todos los elementos de la lista
    public void imprimir() {
        NodoLista actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

    // Inserta un elemento en una posición específica (0-indexado)
    public void insertarEn(int posicion, Object valor) {
        if (posicion < 0 || posicion > cantidad) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        NodoLista nuevoNodo = new NodoLista(valor);

        if (posicion == 0) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        } else {
            NodoLista actual = cabeza;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.getSiguiente();
            }
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        }
        cantidad++;
    }

    // Verifica si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Muestra un elemento en una posición específica (0-indexado)
    public Object mostrarElemento(int posicion) {
        if (posicion < 0 || posicion >= cantidad) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        NodoLista actual = cabeza;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getValor();
    }
}
