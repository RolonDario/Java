
public class Coche extends Vehiculo implements Terrestre {

    private int puertas;
    private String tipoTecho;
    private String traccion;

    public Coche(Flota flota, String marca, String modelo, String color, String velocidadMaxima, String tipoMotor,
            int puertas, String tipoTecho, String traccion) {
        super(flota, marca, modelo, color, velocidadMaxima, tipoMotor);
        this.puertas = puertas;
        this.tipoTecho = tipoTecho;
        this.traccion = traccion;
    }

    public Coche(Flota flota, String marca, String modelo, String color, String velocidadMaxima, String tipoMotor) {
        super(flota, marca, modelo, color, velocidadMaxima, tipoMotor);
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTipoTecho() {
        return tipoTecho;
    }

    public void setTipoTecho(String tipoTecho) {
        this.tipoTecho = tipoTecho;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    @Override
    public void rodar() {
        System.out.println("Soy un " + this.getModelo() + " y empecé a rodar");
        ;
    }

    @Override
    public void estacionar() {
        System.out.println("Soy un " + this.getModelo() + " y estacioné");
    }

    @Override
    public void arrancarVehiculo() {
        System.out.println("Soy un coche " + this.getModelo() + ", hice contacto y arranqué");
    }
}
