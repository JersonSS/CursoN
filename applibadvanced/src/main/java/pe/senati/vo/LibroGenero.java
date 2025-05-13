package pe.senati.vo;

import pe.senati.entity.Genero;
import pe.senati.entity.Libro;

public class LibroGenero 
{
    private Libro libro;
    private Genero genero;

    public LibroGenero() {}

    public LibroGenero(Libro libro, Genero genero) {
        this.libro = libro;
        this.genero = genero;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    
}
