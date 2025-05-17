package pe.senati.mapper;

public class AutorLibroMapper 
{
    private Integer autor_id;
    private String autor;
    private Integer libro_id;
    private String libro;

    public AutorLibroMapper() {}

    public AutorLibroMapper(Integer autor_id, String autor, Integer libro_id, String libro) {
        this.autor_id = autor_id;
        this.autor = autor;
        this.libro_id = libro_id;
        this.libro = libro;  
    }

    public Integer getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(Integer autor_id) {
        this.autor_id = autor_id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    
}
