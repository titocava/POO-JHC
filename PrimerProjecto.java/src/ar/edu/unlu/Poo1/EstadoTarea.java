package ar.edu.unlu.Poo1;

public class EstadoTarea {
    private int idTarea;
    private String tipo; // "completa", "incompleta", "vencida"

    public EstadoTarea(int idTarea, String tipo) {
        this.idTarea = idTarea;
        this.tipo = tipo;
    }

    public void cambiarTipoEstado(String nuevoTipo) {
        this.tipo = nuevoTipo;
    }

    // Getters y Setters
    public int getIdTarea() {
        return idTarea;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
