package ar.edu.unlu.Poo1;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListaDeTareas {
    private Lista<Tarea> listaDeTareas;

    public ListaDeTareas() {
        listaDeTareas = new Lista<>();
    }

    public void agregarTarea(String descripcion, int prioridad, LocalDate fechaLimite) {
        Tarea nuevaTarea = new Tarea(descripcion, prioridad, fechaLimite);
        listaDeTareas.agregar(nuevaTarea); // Suponiendo que el método agregar en Lista acepta Tarea
    }

    // Métodos adicionales para interactuar con la lista de tareas
}
