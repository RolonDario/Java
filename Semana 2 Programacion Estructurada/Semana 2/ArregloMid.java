public class ArregloMid {
    public static void main(String[] args) {
        int arreglo[] = { 1, 2, 3, 4, 5, 6, 7 };
        int resultado[];

        if (arreglo == null || arreglo.length <= 2) {
            resultado = new int[0];
            System.out.println("No anda");

        } else {
            resultado = new int[arreglo.length - 2];

            final int PRIMERA_POSICION = 0;
            final int ULTIMA_POSICION = arreglo.length - 1;

            for (int i = 0; i < arreglo.length; i++) {

                if (i != PRIMERA_POSICION && i != ULTIMA_POSICION)
                    resultado[i - 1] = arreglo[i];
            }
        }
        System.out.println("El resultado es : ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("Valor de la posicion [%d]=[%d] \n", i, resultado[i]);
        }
    }
} // Esperá que falta
