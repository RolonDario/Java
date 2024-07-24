package Padawan;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, numeroMasVeinte;
        System.out.println("Dame un número: ");
        numero = input.nextInt();
        numeroMasVeinte = numero + 20;
        System.out.println("El número multiplicado por 20 es: " + numeroMasVeinte);
        input.close();
    }

}
