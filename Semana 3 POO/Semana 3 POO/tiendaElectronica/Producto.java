public class Producto {
    private Tienda tienda;
    private String nombre;
    private String descripcion;
    protected Double precio;
    protected Integer cantidadEnStock;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, Tienda tienda, Double precio, Integer cantidadEnStock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tienda = tienda;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(Integer cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public void actualizarStock(Integer n) {
        if ((this.cantidadEnStock - n) >= 0) {
            Integer nuevoStock = this.cantidadEnStock - n;
            this.cantidadEnStock = nuevoStock;
            System.out.println(" Quedan " + this.cantidadEnStock + " unidades de " + this.nombre);
        } else {
            System.out.println("No hay suficiente cantidad en stock");
        }
    }

    public void actualizarPrecio(Double p) {
        this.precio = p;
        System.out.println("El precio actual se cambió a $" + p + " por unidad");
    }

}
