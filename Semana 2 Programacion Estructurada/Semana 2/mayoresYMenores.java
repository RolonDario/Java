public class mayoresYMenores {
    public static void main(String[] args) {
        int a = -10;
        int b = -100;
        int c = 0;
        int d = 16;
        int e = 252;
        int[] arreglo = { a, b, c, d, e };
        int M = arreglo[0];
        int m = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < m) {
                m = arreglo[i];
            } else {
                M = arreglo[i];
            }

        }
        System.out.println("El mayor valor es: " + M);
        System.out.println("El menor valor es: " + m);
    }
}
