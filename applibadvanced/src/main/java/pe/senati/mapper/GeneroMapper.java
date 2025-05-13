package pe.senati.mapper;

import pe.senati.entity.Genero;

public class GeneroMapper 
{
    private Integer genero_id;
    private String nombre;
    private String descripcion;

    public GeneroMapper() {}

    public GeneroMapper(Integer genero_id, String nombre, String descripcion) {
        this.genero_id = genero_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public GeneroMapper(Genero genero) {
        this(genero.getGenero_id(), genero.getNombre(), genero.getDescripcion());
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

    
}
