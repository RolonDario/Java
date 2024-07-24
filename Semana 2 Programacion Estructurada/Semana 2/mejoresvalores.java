public class mejoresvalores {
    public static void main(String[] args) {

        int[] arreglo = { 50, 2, 3, 27, 5, 16, 27, 10, 54, 60, 60 };
        int n1 = arreglo[0];
        int n2 = n1;
        int p1 = 0; // valores correspondientes a la posición
        int p2 = 0;
        for (int i = 0; i < (arreglo.length); i++) {
            if ((arreglo[i]) > n1) { // si el numero de la secuencia es mayor a n1 entonces guardo n1 en n2,
                n2 = n1;
                n1 = arreglo[i]; // reemplazo n1 por el elemento mayor que él
                p1 = i; // y guardo la posición en p1
            } else if (arreglo[i] >= n2 && arreglo[i] <= n1) { // si el número de la secuencia es mayor o igual que n2 y
                                                               // menor o igual a n1
                n2 = arreglo[i]; // guardo en n2 el valor del número en cuestón
                p2 = i; // y guardo su posición en p2
            }
        }
        if (n1 != n2) {
            System.out.println("Uno de los mejores valores está ubicado en la posición " + p1
                    + " del arreglo y el otro en la posición " + p2);
            System.out.println("Ambos valores son " + n1 + " y " + n2 + " respectivamente.");
        } else {
            System.out.println("El mejor valor es " + n1 + " y se encuentra en las posiciones " + p2 + " y " + p1);
        }

    }
}

// Desafio 3 : Dado un arreglo de N posiciones, desarrollar un programa en java
// que tome el primer mejor valor y el segundo mejor valor. Mostrar por pantalla
// las posicions de estos dos mejores valores junto con su valor.