public class App {
    public static void main(String[] args) {
        // creando una tienda cualquiera
        Tienda tienda = new Tienda();

        // Agregar clientes
        Cliente cliente = new Cliente(tienda, 0, "Homero Simpson", "Av. SiempreViva");
        Cliente cliente1 = new Cliente(tienda, 1, "Cosme Fulanito", "Av. SiempreViva");
        Cliente cliente2 = new Cliente(tienda, 2, "Homero Simpsone", "Av. SiempreViva");

        // agregar productos
        Producto celular = new Producto("celular bueno", "Buen celular", tienda, 25000.00, 25);
        Producto celular1 = new Producto("celular bueninisimo", "Buenisimo celular", tienda, 45000.00, 18);
        Producto celular2 = new Producto("celular muy cheto", "Cheto celular", tienda, 75000.00, 3);

        // agregar a la tienda productos
        tienda.agregarProducto(celular);
        tienda.agregarProducto(celular1);
        tienda.agregarProducto(celular2);

        // agregar a la tienda clientes
        tienda.agregarCliente(cliente);
        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);

        // clientes comprando
        cliente.comprar(celular);
        cliente.comprar(celular2);
        cliente.comprar(celular2);

        cliente1.comprar(celular2);

        cliente2.comprar(celular);
        cliente2.comprar(celular1);

        // mostrar registro de ventas
        tienda.mostrarRegistroDeVentas();
    }
}
