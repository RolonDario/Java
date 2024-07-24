public class arreglobidimensional {
    public static void main(String[] args) {
        int[][] arregloBidimensional = { { 1, 2 }, { 3, 4, 5 } };
        System.out.println("Elemento 0,0: " + arregloBidimensional[0][0]);
        System.out.println("Elemento 0,1: " + arregloBidimensional[0][1]);
        System.out.println("Elemento 1,0: " + arregloBidimensional[1][0]);
        System.out.println("Elemento 1,1: " + arregloBidimensional[1][1]);

        for (int i = 0; i < arregloBidimensional.length; i++) {
            for (int j = 0; j < arregloBidimensional[i].length; j++) {
                System.out.println("Elemento " + i + "," + j + " : " + arregloBidimensional[i][j]);
            }
        }

    }
}
