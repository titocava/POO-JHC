package ar.edu.unlu.Poo1;

public class ListaEnlazada<T> implements Lista<T> {
    // Nodo de la lista enlazada
    private static class Nodo<T> {
        private T dato;
        private Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo<T> cabeza;
    private int longitud;

    // Constructor para crear una lista vacía
    public ListaEnlazada() {
        this.cabeza = null;
        this.longitud = 0;
    }

    // Método para verificar si la lista está vacía
    @Override
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Método para obtener la longitud de la lista
    @Override
    public int obtenerLongitud() {
        return longitud;
    }

    // Método para agregar un elemento al final de la lista
    @Override
    public void agregarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        longitud++;
    }

    // Método para eliminar un elemento de la lista (elimina la primera aparición)
    @Override
    public boolean eliminar(T dato) {
        if (cabeza == null) {
            return false;
        }

        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            longitud--;
            return true;
        }

        Nodo<T> actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.dato.equals(dato)) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            longitud--;
            return true;
        }

        return false; // El elemento no fue encontrado
    }

    // Método para recuperar un elemento en una posición específica
    @Override
    public T obtener(int indice) {
        if (indice < 0 || indice >= longitud) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        Nodo<T> actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    // Método para insertar un elemento en una posición específica
    @Override
    public void insertarEn(int indice, T dato) {
        if (indice < 0 || indice > longitud) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (indice == 0) {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            for (int i = 0; i < indice - 1; i++) {
                actual = actual.siguiente;
            }
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
        longitud++;
    }

    // Método para imprimir la lista
    @Override
    public void imprimirLista() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
