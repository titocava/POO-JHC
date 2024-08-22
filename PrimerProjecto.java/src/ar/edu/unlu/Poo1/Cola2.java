package ar.edu.unlu.Poo1;

public interface Cola2<T> {
    void encolar(T elemento); // Agregar un elemento al final de la cola
    T desencolar();          // Remover y devolver el primer elemento de la cola
    T frente();              // Obtener el primer elemento sin removerlo
    boolean estaVacia();     // Verificar si la cola está vacía
    int tamanio();          // Obtener el número de elementos en la cola
    void imprimirCola();    // Imprimir el contenido de la cola
}
