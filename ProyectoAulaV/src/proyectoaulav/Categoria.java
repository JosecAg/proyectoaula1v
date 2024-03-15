
package proyectoaulav;

import java.util.HashSet;
import java.util.Set;

public class Categoria {
     private int id;
    private String nombre;
    private String descripcion;
    private Set<Grupo> grupos = new HashSet<>();

    public Categoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void agregarCategoria() {
        System.out.println("Categoría agregada: " + nombre);
    }

    public void eliminarCategoria() {
        System.out.println("Categoría eliminada: " + nombre);
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(Set<Grupo> grupos) {
        this.grupos = grupos;
    }
}
