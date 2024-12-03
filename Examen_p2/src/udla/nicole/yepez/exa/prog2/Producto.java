package udla.nicole.yepez.exa.prog2;
// Clase abstracta Producto
public abstract class Producto {
    // Atributos comunes a todos los productos
    protected String codigo;
    protected String nombre;
    protected String categoria;
    protected double precio;
    protected int cantidad;


    // Constructor para inicializar los valores comunes a todos los productos
    public Producto(String pcodigo, String pnombre, String pcategoria,double pprecio, int pcantidad) {
        this.codigo = pcodigo;
        this.nombre = pnombre;
        this.categoria = pcategoria;
        this.precio = pprecio;
        this.cantidad = pcantidad;
    }

    // Métodos getter para acceder a los atributos
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Métod abstracto que debe ser implementado por las subclases para obtener detalles del producto
    public abstract String getDetalle();

    // Métod para reducir la cantidad de productos en stock después de una venta
    public void reducirCantidad(int cantidadVendida) {
        if (cantidadVendida <= cantidad) {
            cantidad -= cantidadVendida;  // Se reduce la cantidad en inventario
        } else {
            System.out.println("No hay suficiente stock de " + nombre);  // Mensaje en caso de no tener stock suficiente
        }
    }

    // Métod para obtener el total del valor de los productos en stock
    public double getTotal() {
        return precio * cantidad;
    }
}

