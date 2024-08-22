package ar.edu.unlu.Poo1;

public interface Pila2<T> {
    void apilar(T elemento);         // Agrega un elemento en la parte superior de la pila
    T desapilar();                   // Elimina y devuelve el elemento en la parte superior de la pila
    T cima();                        // Devuelve el elemento en la parte superior sin eliminarlo
    boolean estaVacia();             // Verifica si la pila está vacía
    int tamanio();                   // Devuelve el tamaño de la pila
    void imprimirPila();			//imprime la pila
}
