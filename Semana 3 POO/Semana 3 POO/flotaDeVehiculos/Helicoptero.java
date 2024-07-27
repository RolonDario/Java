
public class Helicoptero extends Vehiculo implements Aereo {

    private int cantidadHelices;

    public Helicoptero(Flota flota, String marca, String modelo, String color, String velocidadMaxima, String tipoMotor,
            int cantidadHelices) {
        super(flota, marca, modelo, color, velocidadMaxima, tipoMotor);
        this.cantidadHelices = cantidadHelices;
    }

    public Helicoptero(Flota flota, String marca, String modelo, String color, String velocidadMaxima,
            String tipoMotor) {
        super(flota, marca, modelo, color, velocidadMaxima, tipoMotor);
    }

    public int getCantidadHelices() {
        return cantidadHelices;
    }

    public void setCantidadHelices(int cantidadHelices) {
        this.cantidadHelices = cantidadHelices;
    }

    @Override
    public void volar() {
        System.out.println("Soy un helicóptero " + this.getModelo() + "de " + this.getCantidadHelices() + " y vuelo");
    }

    @Override
    public void aterrizar() {
        System.out
                .println("Soy un helicóptero " + this.getModelo() + "de " + this.getCantidadHelices() + " y aterrizo");
    }

    @Override
    public void arrancarVehiculo() {
        System.out.println("fufufufufufuFUFUFUFUFUFUFU el " + this.getModelo() + " acaba de arrancar");
    }

}
