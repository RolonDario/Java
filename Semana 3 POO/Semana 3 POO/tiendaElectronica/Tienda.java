import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Tienda {
    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private HashMap<Integer, ArrayList<Producto>> registroDeVentas;

    public Tienda() {
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.registroDeVentas = new HashMap<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public HashMap<Integer, ArrayList<Producto>> getRegistroDeVentas() {
        return registroDeVentas;
    }

    public void setRegistroDeVentas(HashMap<Integer, ArrayList<Producto>> registroDeVentas) {
        this.registroDeVentas = registroDeVentas;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void venderProducto(Producto producto) {
        if (producto.getCantidadEnStock() > 0) {
            System.out.print("El producto " + producto.getNombre() + " ha sido vendido.");
        } else {
            System.out.println("No hay suficiente stock");
        }
    }

    public void registrarVenta(Integer c, ArrayList<Producto> p) {
        this.registroDeVentas.put(c, p);
    }

    public void mostrarRegistroDeVentas() {
        System.out.println("El registro de ventas de la tienda es: ");
        for (Entry<Integer, ArrayList<Producto>> entry : registroDeVentas.entrySet()) {
            Integer clave = entry.getKey();
            List<Producto> productos = entry.getValue();
            System.out.println("|____Cliente: " + clave + "_______|");
            System.out.println("|_Productos comprados_|");
            for (Producto p : productos) {
                System.out.println("|__" + p.getNombre());
            }
        }
    }

}
