import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Curso> listaCursos = new ArrayList<>();
        String agregar_curso = "si";

        while (!agregar_curso.equals("no")) {
            System.out.println("\nCuántos cursos deseas agregar?: ");
            int x = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < x; i++) {
                Curso curso = new Curso();

                System.out.println("Nombre del curso");
                String nombre_curso = sc.nextLine();
                curso.setNombreCurso(nombre_curso);

                System.out.println("Descripción del curso: ");
                String descripcion_curso = sc.nextLine();
                curso.setDescripcionCurso(descripcion_curso);

                System.out.println("Está habilitado? si/no ");
                String esta_habilitado = sc.nextLine();
                if (esta_habilitado.equals("si")) {
                    curso.setHabilitado(true);
                } else {
                    curso.setHabilitado(false);
                }

                String agregar_alumno = "si";
                while (!agregar_alumno.equals("no")) {
                    System.out.println("\nCuántos alumnos deseas agregar?: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int a = 0; a < n; a++) {
                        Alumno alumno = new Alumno();

                        System.out.println("Nombre del alumno: ");
                        String nombre_alumno = sc.nextLine();
                        alumno.setNombreAlumno(nombre_alumno);

                        System.out.println("Apellido del alumno: ");
                        String apellido_alumno = sc.nextLine();
                        alumno.setApellidoAlumno(apellido_alumno);

                        System.out.println("Edad del alumno: ");
                        int edad = sc.nextInt();
                        alumno.setEdad(edad);

                        curso.setAlumno(alumno);
                        sc.nextLine();
                    }
                    System.out.println("Desea agregar un nuevo alumno? si/no: ");
                    agregar_alumno = sc.nextLine();
                    System.out.println("\n");
                }

                System.out.println("Curso de " + curso.getNombreCurso() + " agregado.");
                System.out.println("Descripción del curso: " + curso.getDescripcionCurso());
                System.out.println("Estado habilitado: " + curso.getHabilitado());
                System.out.println("Lista de alumnos en " + curso.getNombreCurso());
                for (String alumno : curso.getAlumnosInscriptos()) {
                    System.out.println(alumno);
                }
                listaCursos.add(curso);
            }
            System.out.println("\nDesea agregar un nuevo curso? si/no: ");
            agregar_curso = sc.nextLine();

        }
        System.out.println("Cursos agregados: ");
        for (Curso curso : listaCursos) {
            System.out.println(curso.getNombreCurso());
        }
        sc.close();

        // Alumno alumno1 = new Alumno("Carlos", "Juarez", LocalDate.of(1998, 04, 13),
        // 24);
        // Alumno alumno2 = new Alumno("Efrain", "Lino", LocalDate.of(1995, 05, 1), 23);
        // Alumno alumno3 = new Alumno("Sandia", "Caramelos", LocalDate.of(1991, 12, 5),
        // 21);

        // System.out.println(alumno1.getNombreAlumno());
        // System.out.println(alumno1.getApellidoAlumno());
        // System.out.println(alumno1.getEdad());

        // System.out.println(alumno2.getNombreAlumno());
        // System.out.println(alumno2.getApellidoAlumno());
        // System.out.println(alumno2.getEdad());

        // System.out.println(alumno3.getNombreAlumno());
        // System.out.println(alumno3.getApellidoAlumno());
        // System.out.println(alumno3.getEdad());

        // Curso curso1 = new Curso("Matemática", Boolean.TRUE, "Un curso buenísimo");
        // Curso curso2 = new Curso("Física", Boolean.FALSE, "Un curso chetísimo");
        // Curso curso3 = new Curso("Literatura", Boolean.TRUE, "Un curso copado");

        // System.out.println(curso1.getNombreCurso());
        // System.out.println(curso1.getDescripcionCurso());
        // System.out.println(curso1.getHabilitado());
        // curso1.setAlumnosInstriptos(alumno1.getInfoAlumno(), alumno2.getInfoAlumno(),
        // alumno3.getInfoAlumno());
        // System.out.println("Los estudiantes inscriptos son los siguientes: " +
        // curso1.getAlumnosInscriptos());
    }
}
