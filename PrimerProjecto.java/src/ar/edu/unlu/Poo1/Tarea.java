package ar.edu.unlu.Poo1;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private String estado; // Puede ser "completada", "incompleta" o "vencida"
    private LocalDate fechaLimite;

    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = "incompleta";
        this.fechaLimite = fechaLimite;
    }

    // Getters y Setters

    public void modificarDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void cambiarPrioridad(int nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
    }

    public void cambiarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("completada") || nuevoEstado.equals("incompleta")) {
            this.estado = nuevoEstado;
        } else {
            throw new IllegalArgumentException("Estado inválido. Debe ser 'completada' o 'incompleta'.");
        }
    }

    public boolean esVencida() {
        return fechaLimite != null && estado.equals("incompleta") && LocalDate.now().isAfter(fechaLimite);
    }

    public void imprimirTarea() {
        String mensaje = (estado.equals("completada") ? "(Vencida) " : "") + descripcion + " - Prioridad: " + prioridad;
        if (fechaLimite != null) {
            mensaje += " - Fecha Límite: " + fechaLimite;
        }
        System.out.println(mensaje);
    }
}
