package ar.edu.unlu.Poo1;

public class NodoCola {
    private NodoCola siguiente = null;
    private Object valor;

    public NodoCola(Object valor) {
        this.valor = valor;
    }

    public void setValor(Object unValor) {
        valor = unValor;
    }

    public Object getValor() {
        return valor;
    }

    public void setSiguiente(NodoCola nodoSiguiente) {
        siguiente = nodoSiguiente;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }
}