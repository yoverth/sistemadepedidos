public abstract class Producto {
    int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public abstract void mostrarDetalles();
    public abstract double calcularPrecio();
}
