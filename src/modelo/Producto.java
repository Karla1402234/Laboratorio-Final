package modelo;

public class Producto { 

    private int idProducto;
    private String nombre;
    private double precioCompra;
    private double precioVenta;
    private int cantidadMax;
    private int cantidadMin;
    private Categoria categoria;

    public Producto(int idProducto, String nombre, double precioCompra,
                    double precioVenta, int cantidadMax,
                    int cantidadMin, Categoria categoria) {

        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadMax = cantidadMax;
        this.cantidadMin = cantidadMin;
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public int getCantidadMin() {
        return cantidadMin;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return nombre;
    }
}