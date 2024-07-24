public class buscarEntero {
    public static void main(String[] args) {
        int n = 4;
        int p = 0;
        boolean si = false;
        int[] arreglo = { 1, 2, 3, 5, 5, 6, 7, 7, 8, 65, 7, 76354, 6 };
        for (int i = 0; i < arreglo.length; i++) {
            if (n == arreglo[i]) {
                si = true;
                p = i;
            }
        }
        if (si) {
            System.out.println("El valor " + n + " está en la posición: " + p);
        } else {
            System.out.println("El valor no está");
        }
    }
}
