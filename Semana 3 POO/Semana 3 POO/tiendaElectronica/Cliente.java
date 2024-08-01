import java.util.ArrayList;

public class Cliente {
    private Tienda tienda;
    private Integer id;
    private String nombre;
    private String direccion;
    private ArrayList<Producto> productosComprados;

    public Cliente() {
    }

    public Cliente(Tienda tienda, Integer id, String nombre, String direccion) {
        this.tienda = tienda;
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.productosComprados = new ArrayList<>();
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(ArrayList<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }

    public void comprar(Producto producto) {
        // agrego el producto a los productos comprados
        this.productosComprados.add(producto);
        System.out.println("El producto " + producto.getNombre() + " ha sido comprado");
        // aviso a la tienda que se vendió el producto
        this.tienda.venderProducto(producto);
        // registro la venta en la tienda, si ya existe el id, lo reemplazo por el mismo
        // id pero con los productos actualizados
        if (this.tienda.getRegistroDeVentas().containsKey(this.id)) {
            this.tienda.getRegistroDeVentas().replace(this.id, productosComprados);
        } else {
            this.tienda.registrarVenta(this.id, productosComprados);
        }
        producto.actualizarStock(1);
    }
}
