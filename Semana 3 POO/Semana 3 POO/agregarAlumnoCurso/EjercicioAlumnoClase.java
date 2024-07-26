
import java.time.LocalDate;
import java.util.ArrayList;

public class EjercicioAlumnoClase {

    public class Alumno {

        private String nombreAlumno;
        private String apellidoAlumno;
        private LocalDate fechaDeNacimiento;
        private int edad;

        // Constructores
        Alumno(String nombre, String apellido, LocalDate fecha, int edad) {
            this.nombreAlumno = nombre;
            this.apellidoAlumno = apellido;
            this.edad = edad;
            this.fechaDeNacimiento = fecha;
        }

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

    }

    public class Curso {

        private String nombreCurso;
        private boolean habilitado;
        private String descripcionCurso;
        private ArrayList<String> alumnosInscriptos;

        // Constructores
        Curso(String nombre, boolean habilitado, String descripcionCurso,
                ArrayList<String> alumnosInscriptos) {
            this.nombreCurso = nombre;
            this.habilitado = habilitado;
            this.descripcionCurso = descripcionCurso;
            this.alumnosInscriptos = alumnosInscriptos;

        }

        Curso() {

        }

        // Obtener
        public String getNombreCurso() {
            return this.nombreCurso;
        }

        public boolean getHabilitado() {
            return this.habilitado;
        }

        public String getDescripcionCurso() {
            return this.descripcionCurso;
        }

        public ArrayList<String> getAlumnosInscriptos() {
            return this.alumnosInscriptos;
        }

        // Añadir
        public void setNombreCurso(String nombreCurso) {
            this.nombreCurso = nombreCurso;
        }

        public void setHabilitado(boolean habilitado) {
            this.habilitado = habilitado;
        }

        public void setDescripcionCurso(String descripcionCurso) {
            this.descripcionCurso = descripcionCurso;
        }

        public void setNombreAlumnoCurso(String nombre) {
            this.alumnosInscriptos.add(nombre);
        }
    }
}
