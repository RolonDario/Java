public class Vehiculo {
    private String marca;
    private int cantidadDeRuedas;
    protected boolean competencia;
    protected boolean alarma;
    private String kmMaximo;
    private String kmMinimo;

    public Vehiculo(String marca, int cantidadDeRuedas, boolean competencia, boolean alarma, String kmMaximo,
            String kmMinimo) {
        this.marca = marca;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.competencia = competencia;
        this.alarma = alarma;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }

    public Vehiculo(String marca, int cantidadDeRuedas, boolean competencia, String kmMaximo, String kmMinimo) {
        this.marca = marca;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.competencia = competencia;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public boolean isCompetencia() {
        return competencia;
    }

    public void setCompetencia(boolean competencia) {
        this.competencia = competencia;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public String getKmMaximo() {
        return kmMaximo;
    }

    public void setKmMaximo(String kmMaximo) {
        this.kmMaximo = kmMaximo;
    }

    public String getKmMinimo() {
        return kmMinimo;
    }

    public void setKmMinimo(String kmMinimo) {
        this.kmMinimo = kmMinimo;
    }

    public String motrarPorPantallaMarca() {
        String marca = this.marca;
        return marca;
    }

    public String arrancarVehiculo() {
        return "El vehiculó arrancó";
    }

    @Override
    public String toString() {
        return "Marca del auto: " + this.motrarPorPantallaMarca()
                + " Cantidad de ruedas: " + this.getCantidadDeRuedas()
                + " Es de competencia: " + this.isCompetencia()
                + " Km Maximo: " + this.getKmMaximo()
                + " Km minimo: " + this.getKmMinimo();
    }

}
