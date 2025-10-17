public class Impresion extends Producto {
    String color;
    Foto foto;

    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
    }

    public void agregarFoto(Foto foto) {
        this.foto = foto;
    }

    public void mostrarDetalles() {
        System.out.println("Impresión N°" + numero + " | Color: " + color);
        if (foto != null) foto.mostrarInfo();
    }

    public double calcularPrecio() {
        return color.equalsIgnoreCase("color") ? 8.0 : 5.0;
    }
}
