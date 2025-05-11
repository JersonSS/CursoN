package pe.senati.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "autores")
public class Autor implements Serializable 
{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer autor_id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String nacionalidad;

    @DateTimeFormat(pattern = "yyyy/MM/dd", iso = ISO.DATE)
    private LocalDate fechaNacimiento;

    @ManyToMany
    @JoinTable(
        name = "autor_libro",
        joinColumns = @JoinColumn(name = "autor_id"),
        inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<Libro> itemsLibros = new ArrayList<>();


    public Autor() {}


    public Autor(Integer autor_id, String nombre, String apellido, String nacionalidad, LocalDate fechaNacimiento) {
        this.autor_id = autor_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }


    public Integer getAutor_id() {
        return autor_id;
    }


    public void setAutor_id(Integer autor_id) {
        this.autor_id = autor_id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }


    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public List<Libro> getItemsLibros() {
        return itemsLibros;
    }


    public void setItemsLibros(List<Libro> itemsLibros) {
        this.itemsLibros = itemsLibros;
    }

}
