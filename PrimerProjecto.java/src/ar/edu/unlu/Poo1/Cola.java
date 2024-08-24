package ar.edu.unlu.Poo1;

public class Cola {
    private NodoCola frente = null;
    private NodoCola finalCola = null;

    // Encola un elemento al final de la cola
    public void encolar(Object valor) {
        NodoCola nuevoNodo = new NodoCola(valor);
        if (this.colaVacia()) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.setSiguiente(nuevoNodo);
            finalCola = nuevoNodo;
        }
    }

    // Desencola un elemento del frente de la cola
    public Object desencolar() {
        if (this.colaVacia()) {
            return null;
        }
        NodoCola nodoFrente = frente;
        frente = frente.getSiguiente();
        if (frente == null) { // Si la cola queda vacía después de desencolar
            finalCola = null;
        }
        return nodoFrente.getValor();
    }

    // Verifica si la cola está vacía
    public boolean colaVacia() {
        return frente == null;
    }

    // Imprime los elementos de la cola
    public static void mostrar(Cola cola) {
        Cola copiaCola = new Cola();
        NodoCola actual = cola.frente;

        // Desencolar e imprimir los elementos
        while (actual != null) {
            Object valor = actual.getValor();
            System.out.println(valor);  // Imprimir el valor
            copiaCola.encolar(valor);   // Guardar en la copia
            actual = actual.getSiguiente();
        }

        // Restaurar la cola original en el orden correcto
        actual = copiaCola.frente;
        while (actual != null) {
            cola.encolar(actual.getValor());
            actual = actual.getSiguiente();
        }
    }
}

