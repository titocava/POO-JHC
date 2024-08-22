package ar.edu.unlu.Poo1;

public interface ListaDoble2<T> {
    boolean estaVacia();
    int obtenerLongitud();
    void agregarAlFinal(T dato);
    void agregarAlInicio(T dato);
    boolean eliminar(T dato);
    T obtener(int indice);
    void insertarEn(int indice, T dato);
    void imprimirLista();
    void imprimirListaInversa();
}

