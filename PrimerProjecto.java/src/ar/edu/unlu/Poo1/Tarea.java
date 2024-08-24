package ar.edu.unlu.Poo1;

import java.time.LocalDate;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean completa;
    private LocalDate fechaLimite;

    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
        this.completa = false;
    }

    public void cambiarDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void cambiarPrioridad(int nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
    }

    public void marcarComoCompleta() {
        this.completa = true;
    }

    public boolean estaVencida() {
        return !completa && fechaLimite.isBefore(LocalDate.now());
    }

    public boolean estaCompleta() {
        return completa;
    }

    @Override
    public String toString() {
        if (completa) {
            return descripcion + " (Completa)";
        } else if (estaVencida()) {
            return descripcion + " (Vencida)";
        } else {
            return descripcion;
        }
    }
}

