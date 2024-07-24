import java.util.Scanner;

public class eliminarEntero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué valor deseas eliminar? :");
        int n = sc.nextInt();
        boolean esta = false;
        int indice_n = -1;
        int[] arreglo = { 1, 2, 3, 5, 5, 6, 7, 7, 8, 65, 7, 76354, 6 };

        for (int i = 0; i < arreglo.length; i++) {
            if (n == arreglo[i]) {
                esta = true;
                indice_n = i;
                break;
            }
        }
        if (esta) {
            int[] arreglo_sin_n = new int[arreglo.length - 1];
            for (int i = 0, j = 0; i < arreglo.length; i++) {
                if (i != indice_n) {
                    arreglo_sin_n[j++] = arreglo[i];
                }
                for (int k = 0; k < arreglo_sin_n.length; k++) {
                    System.out.println(arreglo_sin_n[k] + " , ");
                }
            }
            System.out.println("El valor " + n + " ha sido eliminado.");
        } else {
            System.out.println("El valor no está");
        }
        sc.close();

    }
}
