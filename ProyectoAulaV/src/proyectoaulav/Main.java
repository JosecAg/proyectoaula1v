
package proyectoaulav;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    agregarCategoria();
                    break;
                case 4:
                    realizarVenta();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("---- Menú ----");
        System.out.println("1. Agregar cliente");
        System.out.println("2. Agregar producto");
        System.out.println("3. Agregar categoría");
        System.out.println("4. Realizar venta");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private static void agregarCliente() {
        System.out.print("Ingrese el ID del cliente: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cédula del cliente: ");
        String cedula = scanner.nextLine();

        System.out.print("Ingrese el tipo de deuda del cliente: ");
        String tipodeuda = scanner.nextLine();

        Cliente cliente = new Cliente(id, nombre, cedula, tipodeuda);
        cliente.registrarCliente();
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el ID del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        float precio = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Ingrese la cantidad del producto: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        Producto producto = new Producto(id, nombre, precio, cantidad);
        producto.agregarProducto();
    }

    private static void agregarCategoria() {
        System.out.print("Ingrese el ID de la categoría: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre de la categoría: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la descripción de la categoría: ");
        String descripcion = scanner.nextLine();

        Categoria categoria = new Categoria(id, nombre, descripcion);
        categoria.agregarCategoria();
    }

    private static void realizarVenta() {
        System.out.println("Funcionalidad aún no implementada.");
    }
}