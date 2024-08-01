public class Producto {
    private String nombre;
    private Double precio;
    private Integer candidadEnStock;

    Producto(String nombre, Double precio, Integer cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.candidadEnStock = cantidadEnStock;
    }

    Producto() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCandidadEnStock() {
        return candidadEnStock;
    }

    public Integer seVende(Integer n) {
        Integer cantidadActual = (this.candidadEnStock - n);
        this.candidadEnStock = cantidadActual;
        return cantidadActual;
    }

    public void setCandidadEnStock(Integer candidadEnStock) {
        this.candidadEnStock = candidadEnStock;
    }

    @Override
    public String toString() {
        return "Quedan " + this.candidadEnStock + " unidades del producto " + this.nombre;
    }
}