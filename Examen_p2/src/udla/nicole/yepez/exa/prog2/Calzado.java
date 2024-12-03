package udla.nicole.yepez.exa.prog2;

// Clase Calzado que hereda de Producto y añade el atributo específico 'numero'
public class Calzado extends Producto {
    // Atributo específico de la clase Calzado
    private int numero;

    // Constructor para inicializar el calzado con los atributos comunes y específicos
    public Calzado (String pcodigo, String pnombre, String pcategoria,double pprecio, int pcantidad,int pnumero) {
        super(pcodigo, pnombre, pcategoria, pprecio, pcantidad); // Llamada al constructor de la clase base Producto
        this.numero = pnumero;  // Inicialización del número de calzado
    }

    // Métod getter para obtener el número de calzado
    public int getNumero() {
        return numero;
    }

    // Implementación del métod getDetalle que devuelve una descripción completa del producto
    @Override
    public String getDetalle() {
        return nombre + " (Número: " + numero + ") - Precio: " + precio;
    }
}
