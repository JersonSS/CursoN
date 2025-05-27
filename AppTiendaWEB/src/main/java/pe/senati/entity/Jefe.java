package pe.senati.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jefes")
public class Jefe implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jefe_id;

    @Column
    private String nombre;
    
    @Column
    private String celular;
    
    @Column
    private String nacionalidad;

    @OneToOne(mappedBy = "jefe", cascade = CascadeType.REMOVE, orphanRemoval = true)// jefe(clase) lo que se va enviar como foraneo a categoria
    @JsonIgnore
    private Categoria categoria;

    public Jefe() {}

    public Jefe(Integer jefe_id, String nombre, String celular, String nacionalidad) {
        this.jefe_id = jefe_id;
        this.nombre = nombre;
        this.celular = celular;
        this.nacionalidad = nacionalidad;
    }

    public Integer getJefe_id() {
        return jefe_id;
    }

    public void setJefe_id(Integer jefe_id) {
        this.jefe_id = jefe_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
}
