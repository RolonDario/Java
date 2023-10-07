public class Arreglo {
    public static void main(String[] args) {
        int[][] arreglo = { { 3, 2, 3 }, { 3, 5, 5 }, { 6, 7, 2 } };
        float suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i][i];
        }

        System.out.println("Suma de la diagonal principal: " + suma);

    }

}
