import java.util.Scanner;;

public class SumaDeNumerosBis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("Ingresa 2 numeros: ");
        numero1 = input.nextInt();
        numero2 = input.nextInt();
        numero3 = numero1 + numero2;
        if ((numero3 % 2) == 0) {
            System.out.println("El resultado es " + numero3 + " y es par");
        } else {
            System.out.println("El resultado es " + numero3 + " y es impar");
        }
        input.close();
    }
}
