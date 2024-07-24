import java.time.LocalDate;

public class Alumno {
    private String nombreAlumno;
    private String apellidoAlumno;
    private LocalDate fechaDeNacimiento;
    private int edad;

    // Constructores completo
    Alumno(String nombre, String apellido, LocalDate fecha, int edad) {
        this.nombreAlumno = nombre;
        this.apellidoAlumno = apellido;
        this.edad = edad;
        this.fechaDeNacimiento = fecha;
    }

    // contructor vacio
    Alumno() {
    }

    // Obtener
    public String getNombreAlumno() {
        return this.nombreAlumno;
    }

    public String getApellidoAlumno() {
        return this.apellidoAlumno;
    }

    public LocalDate getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombreYApellido() {
        String nombreCompleto = this.nombreAlumno + " " + this.apellidoAlumno;
        return nombreCompleto;
    }

    // Añadir
    public void setNombreAlumno(String nombre) {
        this.nombreAlumno = nombre;
    }

    public void setApellidoAlumno(String apellido) {
        this.apellidoAlumno = apellido;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Nombre, apellido y edad
    public String getInfoAlumno() {
        return "\nNombre y apellido: " + this.nombreAlumno + " " + this.apellidoAlumno +
                " / Edad: " + this.edad;
    }

    // Insertar nombre, apellido, edad
    public void setInfoAlumno(String nombre, String apellido, int edad) {
        this.nombreAlumno = nombre;
        this.apellidoAlumno = apellido;
        this.edad = edad;
    }
}
