package ar.edu.unlu.Poo1;

public class NodoPila {
	private NodoPila siguiente = null;
    private Object valor;
        
    public void setValor (Object unValor) {
        valor = unValor;
    }

    public Object getValor() {
        return valor;
    }
    
    public void setSiguiente(NodoPila nodoSiguiente) {
    	siguiente = nodoSiguiente;
    }
    
    public NodoPila getSiguiente() {
    	return siguiente;
    }
}
    

