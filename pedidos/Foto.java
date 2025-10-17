public class Foto {
    String fichero;
    String resolucion;
    double tamaño;

    public Foto(String fichero, String resolucion, double tamaño) {
        this.fichero = fichero;
        this.resolucion = resolucion;
        this.tamaño = tamaño;
    }

    public void mostrarInfo() {
        System.out.println("Foto: " + fichero + " | Resolución: " + resolucion + " | Tamaño: " + tamaño + "MB");
    }
}
