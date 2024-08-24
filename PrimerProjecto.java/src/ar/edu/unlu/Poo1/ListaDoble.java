package ar.edu.unlu.Poo1;

public class ListaDoble {
    private NodoDoble cabeza;
    private NodoDoble cola;
    private int tamaño;

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
        this.tamaño = 0;
    }

    // Agrega un elemento al final de la lista
    public void agregarAlFinal(Object valor) {
        NodoDoble nuevoNodo = new NodoDoble(valor);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.setAnterior(cola);
            cola.setSiguiente(nuevoNodo);
            cola = nuevoNodo;
        }
        tamaño++;
    }

    // Elimina el primer nodo que contiene el valor especificado
    public boolean eliminar(Object valor) {
        if (estaVacia()) {
            return false;
        }

        NodoDoble actual = cabeza;
        while (actual != null && !actual.getValor().equals(valor)) {
            actual = actual.getSiguiente();
        }

        if (actual == null) {
            return false; // El valor no fue encontrado
        }

        if (actual.getAnterior() != null) {
            actual.getAnterior().setSiguiente(actual.getSiguiente());
        } else {
            cabeza = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.getSiguiente().setAnterior(actual.getAnterior());
        } else {
            cola = actual.getAnterior();
        }

        tamaño--;
        return true;
    }

    // Imprime todos los elementos de la lista desde cabeza a cola
    public void imprimir() {
        NodoDoble actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " <-> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

    // Inserta un elemento en una posición específica (0-indexado)
    public void insertarEn(int posicion, Object valor) {
        if (posicion < 0 || posicion > tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        NodoDoble nuevoNodo = new NodoDoble(valor);

        if (posicion == 0) {
            nuevoNodo.setSiguiente(cabeza);
            if (cabeza != null) {
                cabeza.setAnterior(nuevoNodo);
            }
            cabeza = nuevoNodo;
            if (cola == null) {
                cola = nuevoNodo;
            }
        } else if (posicion == tamaño) {
            agregarAlFinal(valor);
            return;
        } else {
            NodoDoble actual = cabeza;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.getSiguiente();
            }
            nuevoNodo.setSiguiente(actual.getSiguiente());
            nuevoNodo.setAnterior(actual);
            actual.setSiguiente(nuevoNodo);
            nuevoNodo.getSiguiente().setAnterior(nuevoNodo);
        }
        tamaño++;
    }

    // Verifica si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Muestra un elemento en una posición específica (0-indexado)
    public Object mostrarElemento(int posicion) {
        if (posicion < 0 || posicion >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        NodoDoble actual = cabeza;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getValor();
    }
}
