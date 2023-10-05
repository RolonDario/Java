import java.util.Scanner;;

public class SumaDeNumero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("Ingresa 2 numeros: ");
        numero1 = input.nextInt();
        numero2 = input.nextInt();
        numero3 = numero1 + numero2;
        System.out.println("La suma de los números es: " + numero3);
        input.close();
    }

}