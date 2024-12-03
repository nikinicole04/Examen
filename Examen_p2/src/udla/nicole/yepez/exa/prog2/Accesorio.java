package udla.nicole.yepez.exa.prog2;

// Clase Accesorio que hereda de Producto y añade el atributo específico 'tipo'
public class Accesorio extends Producto {
    // Atributo específico de la clase Accesorio
    private String tipo;

    // Constructor para inicializar el accesorio con los atributos comunes y específicos
    public Accesorio (String pcodigo, String pnombre, String pcategoria,double pprecio, int pcantidad,String ptipo) {
        super(pcodigo, pnombre, pcategoria, pprecio, pcantidad);  // Llamada al constructor de la clase base Producto
        this.tipo = ptipo;  // Inicialización de tipo específico de Accesorio
    }

    // Métod getter para obtener el tipo del accesorio
    public String getTipo() {
        return tipo;
    }

    // Implementación del métod getDetalle que devuelve una descripción completa del producto
    @Override
    public String getDetalle() {
        return nombre + " (Tipo: " + tipo + ") - Precio: " + precio;
    }
}

