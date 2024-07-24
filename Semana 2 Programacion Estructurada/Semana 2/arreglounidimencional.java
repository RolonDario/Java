public class arreglounidimencional {
    public static void main(String[] args) {
        // int[] arreglo = { 2, 3, 4, 5, 6, 7 };
        // for (int i = arreglo.length - 1; i > (-1); i--) {
        // System.out.println("Elemento: " + i);
        // System.out.println("Valor: " + arreglo[i]);
        // }
        // Dado un arreglo de 4 posiciones crear un programa en java
        // que permita tomar los dos valores del medio eliminando los extremos.
        // Mostrar por pantalla el resultado

        // {1,2,3,4} --> {2,3}
        int[] arreglo = { 1, 2, 3, 4 };
        for (int i = 1; i < ((arreglo.length) - 1); i++) { // llega hasta 2 porque es el anterior a 3
            System.out.println(arreglo[i]);
        }
    }
}