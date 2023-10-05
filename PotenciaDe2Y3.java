import java.util.Scanner;;

public class PotenciaDe2Y3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numero, cuadrado, cubo;
        System.out.println("Introduzca el número que desea elevar al cuadrado y al cubo: ");
        numero = input.nextFloat();
        cuadrado = numero * numero;
        cubo = cuadrado * numero;
        System.out.println("El cuadrado de " + numero + " es " + cuadrado + "\nEl cubo de " + numero + " es " + cubo);
        input.close();
    }
}
