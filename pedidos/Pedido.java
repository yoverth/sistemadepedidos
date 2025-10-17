import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    Cliente cliente;
    ArrayList<Producto> productos = new ArrayList<>();
    Date fecha = new Date();
    String numeroTarjeta; // ahora es String para poder mostrar guiones u otros formatos

    public Pedido(Cliente cliente, String numeroTarjeta) {
        this.cliente = cliente;
        this.numeroTarjeta = numeroTarjeta;
    }

    // Factory Method simple: crea productos según el tipo, con datos básicos
    public Producto crearProducto(String tipo, int numero) {
        if (tipo.equalsIgnoreCase("impresion")) {
            return new Impresion(numero, "color");
        } else if (tipo.equalsIgnoreCase("camara")) {
            return new Camara(numero, "Canon", "EOS M50");
        } else {
            return null;
        }
    }

    public void agregarProducto(String tipo, int numero) {
        Producto p = crearProducto(tipo, numero);
        if (p != null) {
            productos.add(p);
            System.out.println("Producto agregado: " + tipo);
        } else {
            System.out.println("Tipo no reconocido: " + tipo);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) total += p.calcularPrecio();
        return total;
    }

    public void mostrarPedido() {
        System.out.println("\n=== PEDIDO ===");
        cliente.mostrarDatos();                 // muestra nombre y cédula
        System.out.println("Tarjeta: " + numeroTarjeta); // muestra tarjeta
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto p : productos) {
            p.mostrarDetalles();
            System.out.println(" Precio: $" + p.calcularPrecio());
            System.out.println("----------------");
        }
        System.out.println("TOTAL: $" + calcularTotal());
    }
}
