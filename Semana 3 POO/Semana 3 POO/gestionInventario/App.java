import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, Producto> productos = new HashMap<>();
        // Creo un producto
        Producto pollo = new Producto("Pollo", 2500.00, 10);
        // Agrego producto
        productos.put(pollo.getNombre(), pollo);

        // Se venden 3 pollos
        if (productos.get("Pollo") != null) {
            pollo.seVende(3);
        } else {
            System.out.println("No hay tal producto");
        }

        // Se muestran las cantidades que quedan de algún producto, en este caso, pollo
        System.out.println(productos.get("Pollo").toString());
    }
}
