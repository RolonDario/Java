package Padawan;

import java.util.Scanner;

public class Descontador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, numeroMenosVeinte;
        System.out.println("Dame un numero: ");
        numero = input.nextInt();
        numeroMenosVeinte = numero - 20;
        System.out.println("Número menos 20: " + numeroMenosVeinte);
        input.close();
    }

}
