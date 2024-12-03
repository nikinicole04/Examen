package udla.nicole.yepez.exa.prog2;
// Clase abstracta Empleado que define los atributos y métodos comunes a todos los empleados
public abstract class Empleado {
    // Atributos comunes a todos los empleados
    protected String id;
    protected String nombre;
    protected double salario;

    // Constructor para inicializar los valores comunes de los empleados
    public Empleado(String id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    // Métodos getter para acceder a los atributos
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    // Métod abstracto para calcular el ingreso del empleado
    public abstract double calcularIngreso();
}
