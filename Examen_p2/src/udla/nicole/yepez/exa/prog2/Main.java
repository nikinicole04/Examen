package udla.nicole.yepez.exa.prog2;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Scanner mScanner = new Scanner(System.in);
        ArrayList<Producto> listaProductos=new ArrayList<>();
        ArrayList<Empleado> listaEmpleados=new ArrayList<>();

        // Variables de control
        int mSeleccion = 0;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        while (true) {
            System.out.println("******************************");
            System.out.println("        MENÚ PRINCIPAL        ");
            System.out.println("******************************");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Agregar Empleado");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.print("Que opción quieres acceder: ");

            // Leer la opción seleccionada
            mSeleccion = mScanner.nextInt();

            // Ejecutar una acción basada en la opción
            switch (mSeleccion) {
                case 1:
                    System.out.print("Ingrese el tipo de producto (1: Ropa, 2: Calzado, 3: Accesorio): ");
                    int mtipo = mScanner.nextInt();
                    mScanner.nextLine(); // Limpiar el buffer
                    System.out.print("Código único: ");
                    String codigo = mScanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = mScanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = mScanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = mScanner.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = mScanner.nextInt();
                    mScanner.nextLine(); // Limpiar el buffer
                    switch (mtipo) {
                        case 1:
                            System.out.print("Talla: ");
                            String mTalla = mScanner.nextLine();
                            listaProductos.add(new Ropa(codigo, nombre,categoria,precio, cantidad,mTalla));
                            break;
                        case 2:
                            System.out.print("Numero: ");
                            int mNumero = mScanner.nextInt();
                            listaProductos.add(new Calzado(codigo, nombre,categoria,precio, cantidad,mNumero));
                            break;
                        case 3:
                            System.out.print("Tipo: ");
                            String pTipo = mScanner.nextLine();
                            listaProductos.add(new Accesorio(codigo, nombre,categoria,precio, cantidad,pTipo));
                            break;
                        default:
                            System.out.println("Tipo de producto no válido.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el tipo de empleado (1: Vendedor, 2: Gerente ");
                    int mtipo2 = mScanner.nextInt();
                    mScanner.nextLine(); // Limpiar el buffer
                    System.out.print("ID único: ");
                    String mid = mScanner.nextLine();
                    System.out.print("Nombre: ");
                    String mnombre = mScanner.nextLine();
                    System.out.print("Salario: ");
                    double msalario = mScanner.nextDouble();
                    mScanner.nextLine(); // Limpiar el buffer
                    switch (mtipo2) {
                        case 1:
                            System.out.print("Comision: ");
                            double mcomision = mScanner.nextDouble();
                            listaEmpleados.add(new Vendedor(mid,mnombre,msalario,mcomision));
                            break;
                        case 2:
                            System.out.print("Bono Anual: ");
                            double mbono = mScanner.nextDouble();
                            listaEmpleados.add(new Gerente(mid,mnombre,msalario,mbono));
                            break;
                        default:
                            System.out.println("Tipo de producto no válido.");
                    }
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción 3.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    mScanner.close();
                    System.exit(0);  // Salir del programa
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }
}

