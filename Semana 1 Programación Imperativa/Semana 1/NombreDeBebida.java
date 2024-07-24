import java.util.Scanner;;

public class NombreDeBebida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombrep, nombred;
        System.out.println("Ingrese el nombre de su última mascota: ");
        nombrep = input.nextLine();
        System.out.println("Ingrese el nombre de su última película vista: ");
        nombred = input.nextLine();
        System.out.println("El nombre de la bebida es: " + nombrep + " " + nombred);
        input.close();
    }

}
