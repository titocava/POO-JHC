package ar.edu.unlu.Poo1;

import java.time.LocalDate;

import java.time.LocalDate;

import java.time.LocalDate;

public class Tarea {
    private static int contadorId = 1;
    private int idTarea;
    private String nombre;
    private String descripcion;
    private int prioridad; // 1: Baja, 2: Media-Baja, 3: Media, 4: Media-Alta, 5: Alta
    private boolean esCompleta;
    private LocalDate fechaLimite;

    public Tarea(String nombre, String descripcion, int prioridad, LocalDate fechaLimite) {
        this.idTarea = contadorId++;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
        this.esCompleta = false;
    }

    public void cambiarPrioridad(int nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
    }

    public void cambiarEstado(boolean completo) {
        this.esCompleta = completo;
    }

    public void mostrarTarea() {
        String estado = esCompleta ? "(Completa)" : (esVencida() ? "(Vencida)" : "(Incompleta)");
        System.out.println(estado + " Tarea: " + nombre + " - " + descripcion + " - Prioridad: " + prioridad);
    }

    public boolean esVencida() {
        return fechaLimite != null && LocalDate.now().isAfter(fechaLimite) && !esCompleta;
    }

    public boolean esCompleta() {
        return esCompleta;
    }

    public static Tarea crearTarea(String nombre, String descripcion, int prioridad, LocalDate fechaLimite) {
        return new Tarea(nombre, descripcion, prioridad, fechaLimite);
    }

    // Getters y Setters
    public int getIdTarea() {
        return idTarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
}


