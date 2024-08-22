package ar.edu.unlu.Poo1;

public class ListaEnlazadaDoble2<T> implements ListaDoble2<T> {

    private static class Nodo<T> {
        private T dato;
        private Nodo<T> siguiente;
        private Nodo<T> anterior;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
            this.anterior = null;
        }
    }

    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int longitud;

    public ListaEnlazadaDoble2() {
        this.cabeza = null;
        this.cola = null;
        this.longitud = 0;
    }

    @Override
    public boolean estaVacia() {
        return cabeza == null;
    }

    @Override
    public int obtenerLongitud() {
        return longitud;
    }

    @Override
    public void agregarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
        longitud++;
    }

    @Override
    public void agregarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
        longitud++;
    }

    @Override
    public boolean eliminar(T dato) {
        if (estaVacia()) {
            return false;
        }

        Nodo<T> actual = cabeza;

        while (actual != null && !actual.dato.equals(dato)) {
            actual = actual.siguiente;
        }

        if (actual == null) {
            return false; // No se encontró el nodo con el dato especificado.
        }

        if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            if (cabeza != null) {
                cabeza.anterior = null;
            }
        } else if (actual == cola) {
            cola = cola.anterior;
            if (cola != null) {
                cola.siguiente = null;
            }
        } else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }

        longitud--;
        return true;
    }

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

    @Override
    public void insertarEn(int indice, T dato) {
        if (indice < 0 || indice > longitud) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (indice == 0) {
            agregarAlInicio(dato);
        } else if (indice == longitud) {
            agregarAlFinal(dato);
        } else {
            Nodo<T> actual = cabeza;
            for (int i = 0; i < indice - 1; i++) {
                actual = actual.siguiente;
            }
            nuevoNodo.siguiente = actual.siguiente;
            nuevoNodo.anterior = actual;
            actual.siguiente.anterior = nuevoNodo;
            actual.siguiente = nuevoNodo;
            longitud++;
        }
    }

    @Override
    public void imprimirLista() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    @Override
    public void imprimirListaInversa() {
        Nodo<T> actual = cola;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        }
        System.out.println("null");
    }
}

