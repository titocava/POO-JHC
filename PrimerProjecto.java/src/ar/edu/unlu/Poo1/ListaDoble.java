package ar.edu.unlu.Poo1;

public class ListaDoble {

    private NodoDoble inicio;
    private NodoDoble fin;
    private int cantidadElementos;

    public ListaDoble() {
        this.cantidadElementos = 0;
    }

    public void agregar(int valor) {
        NodoDoble nuevoNodo = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.inicio = nuevoNodo;
            this.fin = nuevoNodo;
        } else {
            this.fin.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(this.fin);
            this.fin = nuevoNodo;
        }
        this.cantidadElementos++;
    }

    public boolean estaVacia() {
        return this.cantidadElementos == 0;
    }

    public boolean eliminar(int valor) {
        if (this.estaVacia()) {
            return false;
        }

        NodoDoble nodoActual = this.inicio;
        while (nodoActual != null && !nodoActual.valorIs(valor)) {
            nodoActual = nodoActual.getSiguiente();
        }

        if (nodoActual == null) {
            return false; // No se encontró el nodo
        }

        if (nodoActual == this.inicio) {
            this.inicio = nodoActual.getSiguiente();
            if (this.inicio != null) {
                this.inicio.setAnterior(null);
            }
        } else if (nodoActual == this.fin) {
            this.fin = nodoActual.getAnterior();
            if (this.fin != null) {
                this.fin.setSiguiente(null);
            }
        } else {
            nodoActual.getAnterior().setSiguiente(nodoActual.getSiguiente());
            nodoActual.getSiguiente().setAnterior(nodoActual.getAnterior());
        }

        this.cantidadElementos--;
        return true;
    }

    public void imprimirLista() {
        NodoDoble actual = inicio;
        while (actual != null) {
            System.out.print(actual.getValor() + " <-> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

    public void imprimirListaInversa() {
        NodoDoble actual = fin;
        while (actual != null) {
            System.out.print(actual.getValor() + " <-> ");
            actual = actual.getAnterior();
        }
        System.out.println("null");
    }
}
