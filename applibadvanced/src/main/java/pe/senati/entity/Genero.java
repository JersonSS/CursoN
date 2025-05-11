package pe.senati.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "generos")
public class Genero implements Serializable
{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  genero_id;

    @Column(nullable = false)
    private String nombre;

    @Column
    private String descripcion;

    @ManyToMany(mappedBy = "itemsGeneros")
    private List<Libro> itemsLibros = new ArrayList<>();

    public Genero() {}

    public Genero(Integer genero_id, String nombre, String descripcion) {
        this.genero_id = genero_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(Integer genero_id) {
        this.genero_id = genero_id;
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

    public List<Libro> getItemsLibros() {
        return itemsLibros;
    }

    public void setItemsLibros(List<Libro> itemsLibros) {
        this.itemsLibros = itemsLibros;
    }

}
