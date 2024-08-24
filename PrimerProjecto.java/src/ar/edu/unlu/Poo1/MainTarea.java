package ar.edu.unlu.Poo1;

	import java.time.LocalDate;

	import java.time.LocalDate;

	public class MainTarea {
	    public static void main(String[] args) {
	        // Crear tareas
	        Tarea tarea1 = new Tarea("Ir al supermercado mañana", 1, LocalDate.now().plusDays(1));
	        Tarea tarea2 = new Tarea("Consultar repuesto del auto", 2, LocalDate.now().minusDays(1));
	        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", 3, LocalDate.now().minusDays(1));
	        
	        // Marcar la segunda tarea como completa
	        tarea2.marcarComoCompleta();
	        
	        // Mostrar las tareas y sus estados
	        System.out.println("Tarea 1: " + tarea1);
	        System.out.println("Tarea 2: " + tarea2);
	        System.out.println("Tarea 3: " + tarea3);
	    }
	}


