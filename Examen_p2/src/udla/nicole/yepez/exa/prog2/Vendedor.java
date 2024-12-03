package udla.nicole.yepez.exa.prog2;


        public class Vendedor extends Empleado {
            // Atributo específico de Vendedor
            private double comision; // Comisión por ventas realizadas.

           // Constructor para inicializar el vendedor con los atributos comunes y específicos
            public Vendedor(String id, String nombre, double salario, double comision) {
                super(id, nombre, salario); // Llama al constructor de la clase padre (Empleado).
                this.comision = comision;
            }

            //Métod getter para obtener el tipo comision
              public double getComision() {
                return comision;
            }

            // el métod abstracto calcularIngreso() definido en la clase Empleado.

            @Override
            public double calcularIngreso() {
                return getSalario() + comision;
            }

            //Metod toString
            @Override
            public String toString() {
                return "Vendedor {" +
                        "ID='" + getId() + '\'' +
                        ", Nombre='" + getNombre() + '\'' +
                        ", Salario Base=" + getSalario() +
                        ", Comisión=" + comision +
                        ", Ingreso Total=" + calcularIngreso() +
                        '}';
            }
        }


