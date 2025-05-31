package pe.senati.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "editoriales")
public class Editorial implements Serializable
{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer editorial_id;

    @Column
    private String nombre;

    @Column
    private String pais;

    @OneToMany
    private List<Libro> itemslibros = new ArrayList<>();

    public Editorial() {}

    public Editorial(Integer editorial_id, String nombre, String pais) {
        this.editorial_id = editorial_id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public Integer getEditorial_id() {
        return editorial_id;
    }

    public void setEditorial_id(Integer editorial_id) {
        this.editorial_id = editorial_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Libro> getItemslibros() {
        return itemslibros;
    }

    public void setItemslibros(List<Libro> itemslibros) {
        this.itemslibros = itemslibros;
    }
    
}
