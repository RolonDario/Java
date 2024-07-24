package Padawan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PromedioDeEdad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> diccionario = new HashMap<>();

        while (true) {
            System.out.println("Nuevo nombre (o 'terminar' si ya has acabado): ");
            String nombre = input.nextLine();

            if (nombre.equalsIgnoreCase("terminar")) {
                break;
            }

            System.out.println("Edad: ");
            int edad = input.nextInt();
            input.nextLine();

            diccionario.put(nombre, edad);

        }

        float sumaEdades = 0;

        for (int edad : diccionario.values()) {
            sumaEdades += edad;
        }

        float promedio = sumaEdades / diccionario.size();

        input.close();
        System.out.println(
                "\nPromedio de edad de las personas: " + promedio + "\nDatos de personas ingresados: " + diccionario);
    }

}
