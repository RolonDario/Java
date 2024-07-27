import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        List<Vehiculo> vehiculos1 = new ArrayList<Vehiculo>();
        List<Vehiculo> vehiculos2 = new ArrayList<Vehiculo>();
        List<Flota> flotas = new ArrayList<Flota>();

        // Creando flotas sin vehiculos
        Flota flota = new Flota("Argentina", "Cuyo");
        Flota flota1 = new Flota("Argentina", "Noroeste");
        Flota flota2 = new Flota("Argentina", "Pampeana");

        // Vehiculos que van a ir a la lista vehiculos
        Coche coche = new Coche(flota, "Mercedes", "Clase S", "Negro", "190 km/h", "Gasolina", 3, "Corredizo", "4x4");
        Coche coche1 = new Coche(flota, "Ford", "Mustang", "Blanco", "250 km/h", "Diésel");
        Moto moto = new Moto(flota, "Yamaha", "Crypton", "Azul", "120 km/h", "4 tiempos", 125);
        Bote bote = new Bote(flota, "Feadship", "Ketch", "Verde", "Tan rápido como el viento", "Vela", false, 1500);
        Avion avion = new Avion(flota, "Lookheed", "Martin F-22 Raptor", "Negro", "2.410 km/h", "Dos motores", true);
        Helicoptero helicoptero = new Helicoptero(flota, "HelicopLine", "F33 Josh", "Verde militar", "500 km/h",
                "Motorazo", 8);

        // Vehiculos que van a ir a la lista vehiculos1
        Coche coche2 = new Coche(flota1, "Mercedes", "Clase E", "Plateado", "220 km/h", "Diesel", 4, "Rigido",
                "Delantera");
        Coche coche3 = new Coche(flota1, "Honda", "Civic", "Violeta", "230 km/h", "Hibrida", 3, "Rigido", "Trasera");
        Moto moto1 = new Moto(flota1, "Yamaha", "DT", "Azul", "120 km/h", "2 tiempos", 125);
        Bote bote1 = new Bote(flota1, "Sunseeker", "Predator 74", "Azul Marino", "74 km/h", "Diésel", false, 1000);
        Avion avion1 = new Avion(flota1, "North American", "X-15", "Plateado", "7.200 km/h", "Cohete", false);

        // Vehiculos que van a ir a la lista vehiculos2
        Coche coche4 = new Coche(flota2, "Toyota", "Supra", "Negro", "200 km/h", "Hibrido", 5, "Rigido", "Trasera");
        Coche coche5 = new Coche(flota2, "Hyundai", "350 Z", "Verde", "300km/h", "Combustión", 3, "Corredizo", "4x4");
        Moto moto2 = new Moto(flota2, "Aprilia", "RS", "Naranja", "150 km/h", "2 tiempos", 125);
        Bote bote2 = new Bote(flota2, "SEAT", "León", "Rojo", "210 km/h", "Gasolina", false, 1000);
        Avion avion2 = new Avion(flota2, "Lookheed", "SR-71 Blackbird", "Negro", "3,540 km/h", "A reacción", true);

        // Cargando vehiculos a vehiculos
        vehiculos.add(coche);
        vehiculos.add(coche1);
        vehiculos.add(moto);
        vehiculos.add(bote);
        vehiculos.add(avion);
        vehiculos.add(helicoptero);

        // Cargando vehiculos a vehiculos1
        vehiculos1.add(coche2);
        vehiculos1.add(coche3);
        vehiculos1.add(moto1);
        vehiculos1.add(bote1);
        vehiculos1.add(avion1);

        // Cargando vehiculos a vehiculos2
        vehiculos2.add(coche4);
        vehiculos2.add(coche5);
        vehiculos2.add(moto2);
        vehiculos2.add(bote2);
        vehiculos2.add(avion2);

        // Ingresando lista de vehiculos a las flotas correspondientes
        flota.setVehiculos(vehiculos);
        flota1.setVehiculos(vehiculos1);
        flota2.setVehiculos(vehiculos2);

        // Ingresando a la lista de flotas las diferentes flotas
        flotas.add(flota);
        flotas.add(flota1);
        flotas.add(flota2);

        for (Flota f : flotas) {
            System.out.println("\nEn el país " + f.getPais());
            System.out.println("En la region de " + f.getRegion());
            System.out.println("Tenemos los siguientes vehiculos y los haremos arrancar:");
            for (Vehiculo v : f.getVehiculos()) {
                v.arrancarVehiculo();
            }
        }

    }
}
