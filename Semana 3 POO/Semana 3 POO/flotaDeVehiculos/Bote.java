
public class Bote extends Vehiculo implements Acuatico {
    private boolean carguero;
    private int cargaMaxima;

    public Bote(Flota flota, String marca, String modelo, String color, String velocidadMaxima, String tipoMotor,
            boolean carguero, int cargaMaxima) {
        super(flota, marca, modelo, color, velocidadMaxima, tipoMotor);
        this.carguero = carguero;
        this.cargaMaxima = cargaMaxima;
    }

    public boolean isCarguero() {
        return carguero;
    }

    public void setCarguero(boolean carguero) {
        this.carguero = carguero;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void navegar() {
        System.out.println("Soy un " + this.getModelo() + " y empiezo a navegar");
    }

    @Override
    public void arribar() {
        System.out.println("Soy un " + this.getModelo() + " y puse anclas");
    }

    @Override
    public void arrancarVehiculo() {
        System.out.println("Soy un bote " + this.getModelo() + " y arranqué de lujo");
    }

}
