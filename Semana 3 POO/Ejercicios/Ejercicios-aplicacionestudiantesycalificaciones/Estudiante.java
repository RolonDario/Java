import java.time.LocalDate;
import java.util.List;

public class Estudiante {
    private Long id;
    private String nombre;
    private List<Calificaciones> calificaciones;

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, List<Calificaciones> calificaciones) {
        this.id = id;
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Calificaciones> getCalificaciones() {
        return this.calificaciones;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificaciones(float c, LocalDate fechaDeCreacion) {
        Calificaciones nuevaCalificacion = new Calificaciones(c, fechaDeCreacion);
        this.calificaciones.add(nuevaCalificacion);
    }

    public float promedio() {
        float suma = 0;
        for (Calificaciones calificacion : this.calificaciones) {
            suma += calificacion.getCalificaciones();
        }
        float result = suma / this.calificaciones.size();
        return result;
    }

    @Override
    public String toString() {
        float promedio = this.promedio();
        return String.valueOf("Id: " + this.id) +
                " Nombre: " + this.nombre +
                " Promedio: " + promedio;
    }
}
