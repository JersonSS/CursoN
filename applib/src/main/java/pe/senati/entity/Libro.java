package pe.senati.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Libro 
{
    private Integer libro_id;
    private String titulo;
    private String autor;
    private String editorial;
    private String genero;
    private Boolean digital; // true si es ebook, false si es físico
    private Character edicion; // A, B, C... 
    private Short numeroPaginas;
    private Integer stock;
    private Double precio;
    
    @DateTimeFormat(pattern = "yyyy/MM/dd", iso = ISO.DATE)
    private LocalDate fechaPublicacion;
    
    @DateTimeFormat(pattern = "yyyy/MM/dd", iso = ISO.DATE)
    private LocalDate fechaRegistro;

    public Libro() {}

    public Libro(Integer libro_id, String titulo, String autor, String editorial, String genero, Boolean digital,
            Character edicion, Short numeroPaginas, Integer stock, Double precio, LocalDate fechaPublicacion,
            LocalDate fechaRegistro) {
        this.libro_id = libro_id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.digital = digital;
        this.edicion = edicion;
        this.numeroPaginas = numeroPaginas;
        this.stock = stock;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(Integer libro_id) {
        this.libro_id = libro_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getDigital() {
        return digital;
    }

    public void setDigital(Boolean digital) {
        this.digital = digital;
    }

    public Character getEdicion() {
        return edicion;
    }

    public void setEdicion(Character edicion) {
        this.edicion = edicion;
    }

    public Short getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Short numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    

}
