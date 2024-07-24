package Padawan;

import java.util.Scanner;

public class ConversionAKilogramos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor que desea convertir a kilogramos (en libras): ");
        float libras = input.nextInt();

        double kilogramos = libras / 2.2046;
        System.out.println(libras + " libra/s es el equivalente a " + kilogramos + " kg");
        input.close();
    }
}
