package pe.senati.mapper;

public class LibroGeneroMapper 
{
    private Integer libro_id;
    private String libro;
    private Integer genero_id;
    private String genero;

    public LibroGeneroMapper() {}

    public LibroGeneroMapper(Integer libro_id, String libro, Integer genero_id, String genero) {
        this.libro_id = libro_id;
        this.libro = libro;
        this.genero_id = genero_id;
        this.genero = genero;
    }

    public Integer getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(Integer libro_id) {
        this.libro_id = libro_id;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public Integer getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(Integer genero_id) {
        this.genero_id = genero_id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
