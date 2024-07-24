import java.util.Scanner;;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float rnum1, rnum2, resnum3, resnum4, sumtnum5;
        int enum1, enum2;

        System.out.println("Escribe dos números reales: ");
        rnum1 = input.nextFloat();
        rnum2 = input.nextFloat();
        resnum3 = rnum1 * rnum2;

        System.out.println("Escribe dos números enteros: ");
        enum1 = input.nextInt();
        enum2 = input.nextInt();
        resnum4 = enum1 * enum2;

        sumtnum5 = (resnum3) + (resnum4);

        System.out.println(
                "El valor de multiplicar ambos reales y ambos enteros entre sí y luego sumar sus resultados es: "
                        + sumtnum5);
        input.close();
    }
}
