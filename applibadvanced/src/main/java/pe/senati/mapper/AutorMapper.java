package pe.senati.mapper;

import java.time.LocalDate;

import pe.senati.entity.Autor;

public class AutorMapper 
{
    private Integer autor_id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private LocalDate fechaNacimiento;

    public AutorMapper() {}

    public AutorMapper(Integer autor_id, String nombre, String apellido, String nacionalidad,
            LocalDate fechaNacimiento) {
        this.autor_id = autor_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public AutorMapper(Autor autor) {
        this(autor.getAutor_id(), autor.getNombre(), autor.getApellido(), autor.getNacionalidad(),
            autor.getFechaNacimiento());
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

    
}
