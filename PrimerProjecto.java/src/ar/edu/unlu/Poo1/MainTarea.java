package ar.edu.unlu.Poo1;

	import java.time.LocalDate;

	import java.time.LocalDate;

	import java.time.LocalDate;

	import java.time.LocalDate;

	public class MainTarea {
	    public static void main(String[] args) {
	        // Crear lista de tareas
	        ListaTarea lista = new ListaTarea("Tareas Pendientes", "Lista de tareas para la semana");

	        // Crear tareas
	        Tarea tarea1 = new Tarea("Ir al supermercado", "Comprar alimentos para la semana", 3, LocalDate.now().plusDays(1));
	        Tarea tarea2 = new Tarea("Consultar repuesto del auto", "Llamar al taller para consultar disponibilidad", 2, LocalDate.now().minusDays(1));
	        Tarea tarea3 = new Tarea("Ir al cine", "Ver la nueva película de Marvel", 4, LocalDate.now().minusDays(1));

	        // Cambiar estado de las tareas
	        tarea1.cambiarEstado(false); // Tarea incompleta
	        tarea2.cambiarEstado(true);  // Tarea completa
	        tarea3.cambiarEstado(false); // Tarea incompleta

	        // Agregar tareas a la lista
	        lista.agregarTarea(tarea1);
	        lista.agregarTarea(tarea2);
	        lista.agregarTarea(tarea3);

	        // Mostrar lista de tareas y su estado
	        lista.mostrarLista();
	    }
	}


