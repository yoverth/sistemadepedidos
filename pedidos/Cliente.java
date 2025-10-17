public class Cliente {
    String cedula;
    String nombre;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("Cliente: " + nombre + " | Cédula: " + cedula);
    }
}
