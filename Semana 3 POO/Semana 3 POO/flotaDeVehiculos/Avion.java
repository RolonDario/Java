
public class Avion extends Vehiculo implements Aereo {
    private boolean caza;

    public Avion(Flota flota, String marca, String modelo, String color, String velocidadMaxima, String tipoMotor,
            boolean caza) {
        super(flota, marca, modelo, color, velocidadMaxima, tipoMotor);
        this.caza = caza;
    }

    public Avion(Flota flota, String marca, String modelo, String color, String velocidadMaxima, String tipoMotor) {
        super(flota, marca, modelo, color, velocidadMaxima, tipoMotor);
    }

    public boolean isCaza() {
        return caza;
    }

    public void setCaza(boolean caza) {
        this.caza = caza;
    }

    @Override
    public void volar() {
        System.out.println("Soy un " + this.getModelo() + " y empiezo a volar");
    }

    @Override
    public void aterrizar() {
        System.out.println("Soy un " + this.getModelo() + " y aterricé");
    }

    @Override
    public void arrancarVehiculo() {
        System.out.println("Soy un avion " + this.getModelo() + " y acabo de arrancar");
    }

}
