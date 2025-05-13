package pe.senati.mapper;

import pe.senati.entity.Editorial;

public class EditorialMapper 
{
    private Integer editorial_id;
    private String nombre;
    private String pais;

    public EditorialMapper() {}

    public EditorialMapper(Integer editorial_id, String nombre, String pais) {
        this.editorial_id = editorial_id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public EditorialMapper(Editorial editorial) {
        this(editorial.getEditorial_id(), editorial.getNombre(), editorial.getPais());
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

    
}
