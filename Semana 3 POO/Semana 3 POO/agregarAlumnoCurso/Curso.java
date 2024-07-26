import java.util.ArrayList;

public class Curso {
    private String nombreCurso;
    private boolean habilitado;
    private String descripcionCurso;
    private ArrayList<String> alumnosInscriptos;

    // Constructores completo
    Curso(String nombre, boolean habilitado, String descripcionCurso) {
        this.nombreCurso = nombre;
        this.habilitado = habilitado;
        this.descripcionCurso = descripcionCurso;
        this.alumnosInscriptos = new ArrayList<String>();

    }

    // constructor "vacio"
    Curso() {
        this.alumnosInscriptos = new ArrayList<>();
    }

    // Obtener
    public String getNombreCurso() {
        return this.nombreCurso;
    }

    public String getHabilitado() {
        if (this.habilitado) {
            return "El curso está habilitado";
        } else {
            return "El curso está inhabilitado momentáneamente";
        }
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

    public void setAlumno(Alumno alumno) {
        this.alumnosInscriptos.add(alumno.getInfoAlumno());
    }

}
