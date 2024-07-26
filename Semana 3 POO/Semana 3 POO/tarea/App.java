import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Persona persona = new Persona(41082075L, "Dario Rolón", (LocalDate.of(2000, 12, 03)), true);
        Vehiculo vehiculo = new Vehiculo("Honda", 4, true, "320 km/h", "100 km/h");

        persona.setVehiculo(vehiculo);
        System.out.println(persona.getVehiculo());
        System.out.println(persona.getVehiculo().arrancarVehiculo());
        System.out.println(persona.getDni());
    }
}
