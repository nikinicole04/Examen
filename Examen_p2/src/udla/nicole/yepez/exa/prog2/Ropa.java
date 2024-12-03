package udla.nicole.yepez.exa.prog2;

// Clase Ropa que hereda de Producto y añade el atributo específico 'talla'
public class Ropa extends Producto {
    // Atributo específico de la clase Ropa
    private String talla;

    // Constructor para inicializar la ropa con los atributos comunes y específicos
    public Ropa (String pcodigo, String pnombre, String pcategoria,double pprecio, int pcantidad,String ptalla)
    {
        super(pcodigo, pnombre, pcategoria, pprecio, pcantidad);  // Llamada al constructor de la clase base Producto
        this.talla = ptalla;  // Inicialización de talla específica de Ropa
    }

    // Métod getter para obtener la talla de la ropa
    public String getTalla() {
        return talla;
    }

    // Implementación del métod getDetalle que devuelve una descripción completa del producto
    @Override
    public String getDetalle() {
        return nombre + " (Talla: " + talla + ") - Precio: " + precio;
    }
}
