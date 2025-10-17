public class Main {
    public static void main(String[] args) {
        // ===== Cliente 1 =====
        Cliente c1 = new Cliente("12345", "Jonathan");
        Pedido pedido1 = new Pedido(c1, "1112-2222-3333-4444"); // tarjeta como String

        pedido1.agregarProducto("impresion", 1);
        pedido1.agregarProducto("camara", 2);

        Foto foto1 = new Foto("paisaje.jpg", "1920x1080", 2.5);
        for (Producto p : pedido1.productos)
            if (p instanceof Impresion)
                ((Impresion) p).agregarFoto(foto1);

        pedido1.mostrarPedido();

        // ===== Cliente 2 =====
        Cliente c2 = new Cliente("67890", "Camila");
        Pedido pedido2 = new Pedido(c2, "3334-4444-5555-6666"); // tarjeta incluida

        pedido2.agregarProducto("camara", 3);
        pedido2.agregarProducto("impresion", 4);

        Foto foto2 = new Foto("familia.jpg", "1080x720", 1.8);
        for (Producto p : pedido2.productos)
            if (p instanceof Impresion)
                ((Impresion) p).agregarFoto(foto2);

        pedido2.mostrarPedido();
    }
}
