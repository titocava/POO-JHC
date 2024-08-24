package ar.edu.unlu.Poo1;

	import java.time.LocalDate;

	import java.time.LocalDate;

	import java.time.LocalDate;

	public class MainTarea {
	    public static void main(String[] args) {
	        // Crear la lista de tareas
	        Lista listaTareas = new Lista();

	        // Crear tareas
	        Tarea tarea1 = new Tarea("Ir al supermercado mañana", 1, LocalDate.now().plusDays(1));
	        Tarea tarea2 = new Tarea("Consultar repuesto del auto", 2, LocalDate.now().minusDays(1));
	        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", 3, LocalDate.now().minusDays(1));

	        // Marcar la segunda tarea como completa
	        tarea2.marcarComoCompleta();

	        // Agregar las tareas a la lista
	        listaTareas.agregar(tarea1);
	        listaTareas.agregar(tarea2);
	        listaTareas.agregar(tarea3);

	        // Mostrar las tareas y sus estados
	        listaTareas.imprimir();
	    }
	}


