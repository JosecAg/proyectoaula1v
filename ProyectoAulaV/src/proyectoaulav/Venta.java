
package proyectoaulav;

import java.util.HashSet;
import java.util.Set;

public class Venta {
    private int id;
    private Cliente cliente;
    private Set<Producto> productos = new HashSet<>();

    public Venta(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado a la venta: " + producto.getNombre());
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
        System.out.println("Producto eliminado de la venta: " + producto.getNombre());
    }

    public float calcularTotal() {
        float total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }

    public void realizarVenta() {
        // Lógica para realizar la venta
        System.out.println("Venta realizada para el cliente: " + cliente.getName());
        System.out.println("Total de la venta: $" + calcularTotal());
    }
}
