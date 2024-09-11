import java.util.Objects;

public class Repuesto {
    private Integer iD;
    private String nombre;
    private String descripcion;

    public Repuesto(int iD, String nombre, String descripcion) {
        this.iD = iD;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    public Integer getId() {
        return iD;
    }

    public String getNombre() {
        return nombre;
    }

    public String geDescripcion() {
        return descripcion;
    }
}
