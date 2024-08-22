package ar.edu.unlu.Poo1;

public class TestTad {
	    public static void main(String[] args) {
	        // Prueba de la clase Lista
	        System.out.println("=== Prueba de Lista ===");
	        Lista lista = new Lista();
	        lista.agregar(10);
	        lista.agregar(20);
	        lista.agregar(30);
	        lista.imprimirLista();
	        lista.eliminar(20);
	        System.out.println("Después de eliminar 20:");
	        lista.imprimirLista();

	        // Prueba de la clase ListaDoble
	        System.out.println("\n=== Prueba de ListaDoble ===");
	        ListaDoble listaDoble = new ListaDoble();
	        listaDoble.agregar(1);
	        listaDoble.agregar(2);
	        listaDoble.agregar(3);
	        listaDoble.agregar(4);
	        listaDoble.imprimirLista();
	        System.out.println("Lista en orden inverso:");
	        listaDoble.imprimirListaInversa();
	        listaDoble.eliminar(2);
	        System.out.println("Después de eliminar 2:");
	        listaDoble.imprimirLista();
	        System.out.println("Lista en orden inverso:");
	        listaDoble.imprimirListaInversa();

	        // Prueba de la clase Pila
	        System.out.println("\n=== Prueba de Pila ===");
	        Pila pila = new Pila();
	        pila.apilar(100);
	        pila.apilar(200);
	        pila.apilar(300);
	        pila.imprimirPila();
	        System.out.println("Desapilado: " + pila.desapilar());
	        System.out.println("Desapilado: " + pila.desapilar());
	        pila.imprimirPila();
	        pila.apilar(400);
	        System.out.println("Después de apilar 400:");
	        pila.imprimirPila();

	        // Prueba de la clase Cola
	        System.out.println("\n=== Prueba de Cola ===");
	        Cola cola = new Cola();
	        cola.encolar(1000);
	        cola.encolar(2000);
	        cola.encolar(3000);
	        cola.imprimirCola();
	        System.out.println("Desencolado: " + cola.desencolar());
	        System.out.println("Desencolado: " + cola.desencolar());
	        cola.imprimirCola();
	        cola.encolar(4000);
	        System.out.println("Después de encolar 4000:");
	        cola.imprimirCola();
	    }
	}

