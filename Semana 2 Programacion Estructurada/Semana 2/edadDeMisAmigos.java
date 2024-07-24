import java.util.Scanner;

public class edadDeMisAmigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos amigos son? ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];
        String[] arreglo_n = new String[n];
        sc.nextLine();

        for (int i = 0; i < arreglo_n.length; i++) {
            System.out.println("Ingrese el nombre de su amigo: ");
            arreglo_n[i] = sc.nextLine();
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese la edad de " + arreglo_n[i]);
            arreglo[i] = sc.nextInt();
        }

        int M = 0;
        String nombre = "";

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 18) {
                System.out.println("No muestro tu nombre porque sos menor");
            } else {
                System.out.println("Sos mayor, " + arreglo_n[i]);
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            if (M < arreglo[i]) {
                M = arreglo[i];
                nombre = arreglo_n[i];
            }
        }
        System.out.println("El mayor de todos es " + nombre + " y tiene " + M + " años");
        sc.close();
    }
}
