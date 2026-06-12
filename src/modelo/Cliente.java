package modelo;

public class Cliente {

    int id;
    String nombre;
    String telefono;

    public Cliente(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
    }
}