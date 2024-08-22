package ar.edu.unlu.Poo1;

public interface Lista2<T> {
    boolean estaVacia();
    int obtenerLongitud();
    void agregarAlFinal(T dato);
    boolean eliminar(T dato);
    T obtener(int indice);
    void insertarEn(int indice, T dato);
    void imprimirLista();
}
