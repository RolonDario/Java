import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        ArrayList<Tarea> tareas = new ArrayList<>();
        System.out.println("¿Qué desea hacer?\n1.Agregar tarea\n2.Eliminar tarea\n3.Ver tareas\n4.Salir");
        String opciones = sc.nextLine();

        while (opciones.equals("1") || opciones.equals("2") || opciones.equals("3")) {
            if (opciones.equals("1")) {
                System.out.println("Desea agregar una nueva tarea? si/no: ");
                String agregar_tarea = sc.nextLine();
                if (agregar_tarea.equals("si")) {
                    System.out.println("Ingrese nombre de la tarea: ");
                    String nombre_tarea = sc.nextLine();
                    System.out.println("Describa la tarea: ");
                    String descripcion_tarea = sc.nextLine();
                    System.out.println("Ingrese fecha de vencimiento de la tarea (dd-MM-yyyy): ");
                    String fechaDeVencimientoString = sc.nextLine();
                    LocalDate fechaDeVencimiento = LocalDate.parse(fechaDeVencimientoString, formatter);
                    Tarea tarea = new Tarea(nombre_tarea, descripcion_tarea, fechaDeVencimiento);
                    tareas.add(tarea);
                } else {
                    System.out.println("¿Qué desea hacer?\n1.Agregar tarea\n2.Eliminar tarea\n3.Ver tareas\n4.Salir");
                    opciones = sc.nextLine();
                }

            } else if (opciones.equals("2")) {
                System.out.println("A continuación se les muestra las tareas pendientes:\n ");
                for (Tarea tarea : tareas) {
                    System.out.println(tarea.toString());
                }
                System.out.println("¿Qué tarea desea eliminar?");
                String tareaAEliminar = sc.nextLine();
                if (!tareaAEliminar.equals("")) {

                    tareas.removeIf(tarea -> tarea.getTarea().equals(tareaAEliminar));

                    System.out.println("\nTareas después de eliminar:");
                    for (Tarea tarea : tareas) {
                        System.out.println(tarea.toString());
                    }
                } else {
                    System.out.println("¿Qué desea hacer?\n1.Agregar tarea\n2.Eliminar tarea\n3.Ver tareas\n4.Salir");
                    opciones = sc.nextLine();
                }
            } else if (opciones.equals("3")) {
                System.out.println("A continuación se les muestra las tareas pendientes: ");
                for (Tarea tarea : tareas) {
                    System.out.println(tarea.toString());
                }
                System.out.println("\n¿Qué más desea hacer?\n1.Agregar tarea\n2.Eliminar tarea\n3.Ver tareas\n4.Salir");
                opciones = sc.nextLine();
            }
        }
        if (opciones.equals("4")) {
            System.out.println("Nos vemos, chau");
        }
        sc.close();
    }
}

// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// import java.util.Scanner;

// public class App {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

// System.out.println("Ingrese la fecha de nacimiento (dd-MM-yyyy): ");
// String fechaNacimientoStr = sc.nextLine();
// LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);

// System.out.println("Fecha de nacimiento ingresada: " + fechaNacimiento);
// sc.close();
// }
// }