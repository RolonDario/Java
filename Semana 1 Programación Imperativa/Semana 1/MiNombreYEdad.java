import java.util.Scanner;;

public class MiNombreYEdad {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nombre, apellido;
        System.out.println("Introduzca su nombre: ");
        nombre = input.nextLine();
        System.out.println("Introduzca su apellido");
        apellido = input.nextLine();
        System.out.println("Su nombre es " + nombre + "\nSu apellido es " + apellido);
        input.close();
    }
}
