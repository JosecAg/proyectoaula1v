
package proyectoaulav;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private int id;
    private String name;
    private String cedula;
    private String tipodeuda;
    private Set<Producto> productos = new HashSet<>();

    public Cliente(int id, String name, String cedula, String tipodeuda) {
        this.id = id;
        this.name = name;
        this.cedula = cedula;
        this.tipodeuda = tipodeuda;
    }

    public void registrarCliente() {

        System.out.println("Cliente registrado: " + name);
    }

    public void eliminarCliente() {

        System.out.println("Cliente eliminado: " + name);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipodeuda() {
        return tipodeuda;
    }

    public void setTipodeuda(String tipodeuda) {
        this.tipodeuda = tipodeuda;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }
}
