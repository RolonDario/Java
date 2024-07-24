
// import java.util.Arrays;
import java.util.Scanner;

public class ordenarloTodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la cantidad de números que vas a usar: ");
        int n = sc.nextInt();
        sc.nextLine();

        float[] arreglo = new float[n];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un valor: ");
            float a = sc.nextFloat();
            arreglo[i] = a;
        }
        // Arrays.sort(arreglo);
        for (int i = 0; i < (arreglo.length - 1); i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                float m = arreglo[i];
                arreglo[i] = arreglo[i + 1];
                arreglo[i + 1] = m;
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            if ((i + 1) == arreglo.length) {
                System.out.print(arreglo[i] + ".");
            } else {
                System.out.print(arreglo[i] + ", ");
            }
        }
        sc.close();
    }
}
