
package proyectoaulav;

import java.util.HashSet;
import java.util.Set;

public class Producto {
     private int id;
    private String nombre;
    private float precio;
    private int cantidad;
    private Set<Categoria> categorias = new HashSet<>();

    public Producto(int id, String nombre, float precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void agregarProducto() {
        System.out.println("Producto agregado: " + nombre);
    }

    public void eliminarProducto() {
        System.out.println("Producto eliminado: " + nombre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
    }
}
