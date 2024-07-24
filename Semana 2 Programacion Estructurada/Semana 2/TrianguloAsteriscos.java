import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerosDeFilas;
        System.out.println("De cuantas filas quieres que sea el triangulo?: ");
        numerosDeFilas = input.nextInt();
        input.close();
        String x;

        for (int i = 1; i <= numerosDeFilas; i++) {
            x = new String(new char[i]).replace('\0', '*');
            System.out.println(x);
        }

    }

}
