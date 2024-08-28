package ar.edu.unlu.Poo1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarea {
    private static int contadorId = 1;
    private int idLista;
    private String nombreLista;
    private String descripcion;
    private List<Tarea> tareas;

    public ListaTarea(String nombreLista, String descripcion) {
        this.idLista = contadorId++;
        this.nombreLista = nombreLista;
        this.descripcion = descripcion;
        this.tareas = new ArrayList<>();
    }

 	public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(int idTarea) {
        tareas.removeIf(t -> t.getIdTarea() == idTarea);
    }

    public Tarea buscarTareaPorNombre(String nombre) {
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equalsIgnoreCase(nombre)) {
                return tarea;
            }
        }
        return null;
    }

    public void mostrarLista() {
        System.out.println("Lista: " + nombreLista + " - " + descripcion);
        for (Tarea tarea : tareas) {
            tarea.mostrarTarea();
        }
    }

    // Getters y Setters
    public int getIdLista() {
        return idLista;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}
