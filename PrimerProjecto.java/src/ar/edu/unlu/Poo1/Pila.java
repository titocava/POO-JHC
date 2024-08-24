package ar.edu.unlu.Poo1;

public class Pila {
    private NodoPila tope = null;

    // Apilar un nuevo elemento
    public void apilar(Object valor) {
        NodoPila nuevoTope = new NodoPila();
        nuevoTope.setValor(valor);
        if (this.pvacia()) {
            tope = nuevoTope;
        } else {
            nuevoTope.setSiguiente(tope);
            tope = nuevoTope;
        }
    }

    // Desapilar un elemento
    public Object desapilar() {
        if (this.pvacia()) {
            return null; // O lanzar una excepción si lo prefieres
        }
        NodoPila viejoTope = tope;
        tope = viejoTope.getSiguiente();
        return viejoTope.getValor();
    }

    // Verificar si la pila está vacía
    public boolean pvacia() {
        return tope == null;
    }

    // Obtener el valor en el tope de la pila
    public Object tope() {
        if (this.pvacia()) {
            return null; // O lanzar una excepción si lo prefieres
        }
        return tope.getValor();
    }

    // Mostrar la pila
    public void mostrar() {
        Pila copiaPila = new Pila();
        NodoPila actual = tope;

        // Desapilar e imprimir los elementos
        while (actual != null) {
            Object valor = actual.getValor();
            System.out.println(valor);  // Imprimir el valor
            copiaPila.apilar(valor);    // Guardar en la copia
            actual = actual.getSiguiente();
        }

        // Restaurar la pila original apilando de nuevo desde la copia
        actual = copiaPila.tope;
        while (actual != null) {
            this.apilar(actual.getValor());
            actual = actual.getSiguiente();
        }
    }
}
