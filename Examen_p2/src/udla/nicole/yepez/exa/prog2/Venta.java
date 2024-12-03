package udla.nicole.yepez.exa.prog2;

// Clase Venta que representa una venta realizada en el sistema
//import java.util.ArrayList;
//import java.util.List;

import java.util.ArrayList;

public class Venta {
    // Atributos de la clase Venta
    private String id;
    private String fecha;
    private Empleado empleado;
    private ArrayList<Producto> productosVendidos;
    private double total;

    // Constructor para inicializar una venta
    public Venta(String id, String fecha, Empleado empleado) {
        this.id = id;
        this.fecha = fecha;
        this.empleado = empleado;
        this.productosVendidos = new ArrayList<>();  // Inicializa la lista de productos vendidos
        this.total = 0;  // Inicializa el total de la venta a 0
    }

    // Métod para agregar productos a la venta y reducir la cantidad en inventario
    public void agregarProducto(Producto producto, int cantidad) {
        producto.reducirCantidad(cantidad);  // Reducir la cantidad del producto en inventario
        productosVendidos.add(producto);  // Agregar el producto a la lista de productos vendidos
        total += producto.getPrecio() * cantidad;  // Sumar al total de la venta
    }

    // Métod para obtener los detalles completos de la venta
    public String getDetalleVenta() {
        StringBuilder detalle = new StringBuilder("Venta ID: " + id + "\nFecha: " + fecha + "\nEmpleado: " + empleado.getNombre() + "\nProductos vendidos:\n");
        for (Producto producto : productosVendidos) {
            detalle.append("- " + producto.getDetalle() + "\n");
        }
        detalle.append("Total: " + total);  // Añadir el total de la venta
        return detalle.toString();
    }
}
