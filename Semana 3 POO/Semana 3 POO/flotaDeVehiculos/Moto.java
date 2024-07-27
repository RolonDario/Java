
public class Moto extends Vehiculo implements Terrestre {

    private int cilindradas;

    public Moto(Flota flota, String marca, String modelo, String color, String velocidadMaxima, String tipoMotor,
            int cilindradas) {
        super(flota, marca, modelo, color, velocidadMaxima, tipoMotor);
        this.cilindradas = cilindradas;
    }

    public Moto(Flota flota, String marca, String modelo, String color, String velocidadMaxima, String tipoMotor) {
        super(flota, marca, modelo, color, velocidadMaxima, tipoMotor);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void rodar() {
        System.out.println("Soy una moto " + this.getMarca() + " de " + this.getCilindradas()
                + " cilindradas y esta es mi forma de rodar");
    }

    @Override
    public void estacionar() {
        System.out.println(
                "Soy una moto " + this.getMarca() + " de " + this.getCilindradas() + " cilindradas y asi estaciono");
    }

    @Override
    public void arrancarVehiculo() {
        System.out
                .println("Soy una moto " + this.getMarca() + " de " + this.getCilindradas()
                        + " cilindradas y arranco *brum brum*");
    }
}
