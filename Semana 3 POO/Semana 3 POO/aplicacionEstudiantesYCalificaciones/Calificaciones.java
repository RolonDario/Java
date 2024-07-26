import java.time.LocalDate;

public class Calificaciones {
    private float calificaciones;
    private LocalDate fechaDeCreacion;

    public Calificaciones(float calificaciones, LocalDate fechaDeCreacion) {
        this.calificaciones = calificaciones;
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public void setCalificaciones(float calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public float getCalificaciones() {
        return this.calificaciones;
    }

    public LocalDate getFechaDeCreacion() {
        return this.fechaDeCreacion;
    }
}
