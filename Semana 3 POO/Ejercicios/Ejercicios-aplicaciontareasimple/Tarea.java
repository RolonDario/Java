import java.time.LocalDate;

public class Tarea {
    private String titulo;
    private String descripcion;
    private LocalDate fechaDeVencimiento;

    Tarea() {

    }

    Tarea(String titulo, String descripcion, LocalDate fechaDeVencimiento) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getTarea() {
        return this.titulo;
    }

    public String getTareaDescripcion() {
        return this.descripcion;
    }

    public LocalDate getFechaDeVencimiento() {
        return this.fechaDeVencimiento;
    }

    public void setInfoTarea(String titulo, String descripcion, LocalDate fechaDeVencimiento) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    @Override
    public String toString() {
        return String.valueOf("\nTítulo: " + this.titulo) +
                " Descripción: " + this.descripcion +
                " Fecha de Vencimiento: " + this.fechaDeVencimiento;
    }
}
