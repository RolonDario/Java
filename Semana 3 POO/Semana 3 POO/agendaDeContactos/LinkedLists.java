import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLists {
    public static void main(String[] args) {
        List<Contacto> contactos = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int operacion;
        do {
            System.out.println(
                    "Que desea hacer?\n1.Agregar contacto\n2.Eliminar contacto\n3.Ver contactos\n4.Buscar contactos\n5.Salir");
            operacion = sc.nextInt();
            sc.nextLine();

        } while (operacion <= 0 || operacion >= 6);
        while (operacion > 0 && operacion < 6) {
            if (operacion == 1) {
                // agregar contacto
                System.out.println("Cuántos contactos desea agregar?: ");
                int n = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < n; i++) {
                    Contacto contacto = new Contacto();
                    String nombre;
                    String nro_tel;
                    String correo;
                    System.out.println("Nombre del contacto " + i + ": ");
                    nombre = sc.nextLine();
                    System.out.println("Nro de telefono de " + nombre + ": ");
                    nro_tel = sc.nextLine();
                    System.out.println("Correo de " + nombre + ": ");
                    correo = sc.nextLine();
                    contacto.setInfo(nombre, nro_tel, correo);
                    contactos.add(contacto);
                }
                System.out.println("\nLa lista de contactos quedó que la siguiente manera:\n");
                for (Contacto contacto : contactos) {
                    System.out.println(contacto.toString());
                }
                System.out.println(
                        "\nQue desea hacer ahora?\n1.Agregar contacto\n2.Eliminar contacto\n3.Ver contactos\n4.Buscar contactos\n5.Salir");
                operacion = sc.nextInt();
                sc.nextLine();
            } else if (operacion == 2) {
                // eliminar contacto
                System.out.println("El contacto de qué persona desea eliminar? ");
                String persona = sc.nextLine();
                if (contactos.stream().anyMatch(contacto -> contacto.getNombre().equals(persona))) { // stream convierte
                                                                                                     // en stream,
                                                                                                     // anyMatch busca
                                                                                                     // si almenos uno
                                                                                                     // cumple la
                                                                                                     // condicion
                    contactos.removeIf(contacto -> contacto.getNombre().equals(persona));// contacto->contacto.getNombre.equal
                                                                                         // hace que para cada contacto
                                                                                         // de la linkedlist pregunte si
                                                                                         // uno coincide con el nombre
                                                                                         // de la persona ingresada y si
                                                                                         // es asi removeif elimina
                                                                                         // cuando se cumpla esa
                                                                                         // condicion
                    System.out.println("Contacto eliminado.");
                    System.out.println("La lista de contactos luego de eliminar a " + persona + " es: ");
                    for (Contacto contacto : contactos) {
                        System.out.println(contacto.toString());
                    }
                } else {
                    System.out.println("El contacto no existe");
                }
                System.out.println(
                        "\nQue desea hacer ahora?\n1.Agregar contacto\n2.Eliminar contacto\n3.Ver contactos\n4.Buscar contactos\n5.Salir");
                operacion = sc.nextInt();
                sc.nextLine();
            } else if (operacion == 3) {
                // ver contactos
                System.out.println("\nA continuación se muestra la lista de contactos: ");
                for (Contacto contacto : contactos) {
                    System.out.println(contacto.toString());
                }
                System.out.println(
                        "\nQue desea hacer ahora?\n1.Agregar contacto\n2.Eliminar contacto\n3.Ver contactos\n4.Buscar contactos\n5.Salir");
                operacion = sc.nextInt();
                sc.nextLine();

            } else if (operacion == 4) {
                // buscar contactos
                System.out.println("A qué persona está buscando? ");
                String persona = sc.nextLine();
                Contacto contactoEncontrado = null;
                for (Contacto contacto : contactos) {
                    if (contacto.getNombre().equals(persona)) {
                        contactoEncontrado = contacto;
                        System.out
                                .println("Los datos del contacto son los siguientes: " + contactoEncontrado.toString());
                        break;
                    }
                }
                if (contactoEncontrado == null) {
                    System.out.println("No se encontró a esa persona");
                }
                System.out.println(
                        "\nQue desea hacer ahora?\n1.Agregar contacto\n2.Eliminar contacto\n3.Ver contactos\n4.Buscar contactos\n5.Salir");
                operacion = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Hasta luego");
                break;
            }
        }
        sc.close();
    }

}
