package pe.senati.vo;

import pe.senati.entity.Autor;
import pe.senati.entity.Libro;

public class AutorLibro 
{
    private Autor autor;
    private Libro libro;

    public AutorLibro() {}

    public AutorLibro(Autor autor, Libro libro) {
        this.autor = autor;
        this.libro = libro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    
}
