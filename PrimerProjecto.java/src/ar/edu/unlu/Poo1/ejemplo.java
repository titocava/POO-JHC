package ar.edu.unlu.Poo1;

public class ejemplo {
	    public static void main(String[] args) {
	        // Creación de una lista enlazada simple
	        Lista2<Integer> listaEnlazada = new ListaEnlazada2<>();
	        listaEnlazada.agregarAlFinal(1);
	        listaEnlazada.agregarAlFinal(2);
	        listaEnlazada.agregarAlFinal(3);
	        listaEnlazada.agregarAlFinal(4);
	        listaEnlazada.agregarAlFinal(5);

	        System.out.println("Lista Enlazada después de agregar elementos:");
	        listaEnlazada.imprimirLista();

	        listaEnlazada.insertarEn(2, 99); // Insertar en el medio (posición 2)
	        System.out.println("Lista Enlazada después de insertar 99 en la posición 2:");
	        listaEnlazada.imprimirLista();

	        listaEnlazada.eliminar(2); // Eliminar el segundo elemento
	        System.out.println("Lista Enlazada después de eliminar el elemento en la posición 2:");
	        listaEnlazada.imprimirLista();

	        // Creación de una lista doblemente enlazada
	        ListaDoble2<Integer> listaDoble = new ListaEnlazadaDoble2<>();
	        listaDoble.agregarAlFinal(1);
	        listaDoble.agregarAlFinal(2);
	        listaDoble.agregarAlFinal(3);
	        listaDoble.agregarAlFinal(4);
	        listaDoble.agregarAlFinal(5);

	        System.out.println("\nLista Doble después de agregar elementos:");
	        listaDoble.imprimirLista();

	        listaDoble.insertarEn(2, 99); // Insertar en el medio (posición 2)
	        System.out.println("Lista Doble después de insertar 99 en la posición 2:");
	        listaDoble.imprimirLista();

	        listaDoble.eliminar(2); // Eliminar el segundo elemento
	        System.out.println("Lista Doble después de eliminar el elemento en la posición 2:");
	        listaDoble.imprimirLista();

	        // Crear una pila y realizar operaciones
	        PilaEnlazada2<Integer> pila = new PilaEnlazada2<>();

	        // Apilar 5 elementos
	        pila.apilar(10);
	        pila.apilar(20);
	        pila.apilar(30);
	        pila.apilar(40);
	        pila.apilar(50);
	        System.out.println("Pila después de apilar 5 elementos:");
	        pila.imprimirPila();

	        // Desapilar los dos primeros elementos (50 y 40)
	        pila.desapilar();
	        pila.desapilar();
	        System.out.println("Pila después de desapilar los dos primeros elementos:");
	        pila.imprimirPila();

	        // Apilar un nuevo elemento (60)
	        pila.apilar(60);
	        System.out.println("Pila después de apilar un nuevo elemento (60):");
	        pila.imprimirPila();
	    }
	}

