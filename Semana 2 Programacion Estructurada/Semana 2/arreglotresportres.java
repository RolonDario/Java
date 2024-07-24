public class arreglotresportres {
    public static void main(String[] args) {
        int[][] arreglo = { { 4, 2, 3 }, { 1, 4, 5 }, { 6, 7, 4 } };
        float suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i][i];// suma es igual a lo que ya contiene más el elemento de la diagonal principal
            // donde i = j por lo tanto i=i
            System.out.println(suma);
        }

        System.out.println("Suma de la diagonal principal: " + suma);

    }
}
// Desafio 2 : Dado un arreglo 3x3, desarrollar un programa que sume los
// elementos en diagonal y por ultimo muestre la sumatotal de la suma.