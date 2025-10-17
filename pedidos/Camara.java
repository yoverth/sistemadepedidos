public class Camara extends Producto {
    String marca;
    String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDetalles() {
        System.out.println("Cámara N°" + numero + " | " + marca + " " + modelo);
    }

    public double calcularPrecio() {
        return 200.0;
    }
}
