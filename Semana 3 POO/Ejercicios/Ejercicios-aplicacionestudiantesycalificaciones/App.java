import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Desea agregar un estudiante?");
        String r = sc.nextLine();
        while (r.equals("si")) {
            System.out.println("Cuántos estudiantes desea agregar? ");
            int n = sc.nextInt();
            sc.nextLine();
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    System.out.println("Ingrese el id del estudiante: ");
                    Long id = sc.nextLong();
                    sc.nextLine();

                    boolean repetido = true;
                    if (estudiantes.size() != 0) {
                        while (repetido) {
                            for (Estudiante estudiante : estudiantes) {
                                if (id == (estudiante.getId())) {
                                    System.out.println("Ese id ya está siendo utilizado");
                                    System.out.println("Ingrese el id del estudiante nuevamente: ");
                                    id = sc.nextLong();
                                    sc.nextLine();
                                } else {
                                    repetido = false;
                                    break;
                                }
                            }
                        }
                    }

                    System.out.println("Ingrese el nombre del estudiante");
                    String nombre = sc.nextLine();

                    System.out.println("Cuántas calificaciones desea agregar de este estudiante? ");
                    int n1 = sc.nextInt();
                    sc.nextLine();

                    ArrayList<Calificaciones> calificaciones = new ArrayList<Calificaciones>();

                    for (int j = 0; j < n1; j++) {

                        System.out.println("Ingrese la nota " + (j + 1) + " del estudiante " + nombre);
                        float c = Float.parseFloat(sc.nextLine());

                        System.out.println("Ingrese la fecha(dd/MM/yyyy): ");
                        String fechaIngresada = sc.nextLine();

                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate fechaConvertida = LocalDate.parse(fechaIngresada, formatter);
                        System.out.println("Fecha " + fechaConvertida + " ingresada con éxito");
                        Calificaciones calificacion = new Calificaciones(c, fechaConvertida);
                        calificaciones.add(calificacion);

                    }
                    Estudiante estudiante = new Estudiante(id, nombre, calificaciones);
                    estudiantes.add(estudiante);
                    System.out.println("El estudiante " + estudiante.getNombre() + " ha sido ingresado con éxito");
                }
                System.out.println("A continuación se mostrará la lista de estudiantes junto con sus promedios");
                for (Estudiante estudiante : estudiantes) {
                    System.out.println(estudiante.toString());
                }
            }
        }
        System.out.println("Hasta luego");

        sc.close();
    }
}
