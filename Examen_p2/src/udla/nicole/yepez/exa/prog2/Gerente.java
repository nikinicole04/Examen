package udla.nicole.yepez.exa.prog2;

// Clase Gerente que hereda de Empleado
public class Gerente extends Empleado {
    // Atributo específico de la clase Gerente
    private double bonoAnual;

    // Constructor para inicializar el gerente con los atributos comunes y específicos
    public Gerente(String id, String nombre, double salario, double bonoAnual) {
        super(id, nombre, salario);  // Llamada al constructor de la clase base Empleado
        this.bonoAnual = bonoAnual;  // Inicialización de bono anual específico de Gerente
    }

    // Métod getter para obtener el bono anual del gerente
    public double getBonoAnual() {
        return bonoAnual;
    }

    // Implementación del métod calcularIngreso que calcula el ingreso total del gerente
    @Override
    public double calcularIngreso() {
        return salario + bonoAnual;  // El ingreso total es la suma del salario y el bono anual
    }
}
