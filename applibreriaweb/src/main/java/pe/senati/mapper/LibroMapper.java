package pe.senati.mapper;

import java.time.LocalDate;

import pe.senati.entity.Libro;


public class LibroMapper 
{
     private Integer libro_id;

    private String titulo;

    private Boolean digital; 

    private Byte edicion;

    private Short numeroPaginas;

    private Integer stock;

    private Double precio;
    
    private LocalDate fechaPublicacion;
    
    private LocalDate fechaRegistro;

    private Integer editorial_id;

    public LibroMapper() {}

    public LibroMapper(Integer libro_id, String titulo, Boolean digital, Byte edicion, Short numeroPaginas,
            Integer stock, Double precio, LocalDate fechaPublicacion, LocalDate fechaRegistro, Integer editorial_id) {
        this.libro_id = libro_id;
        this.titulo = titulo;
        this.digital = digital;
        this.edicion = edicion;
        this.numeroPaginas = numeroPaginas;
        this.stock = stock;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaRegistro = fechaRegistro;
        this.editorial_id = editorial_id;
    }

    public LibroMapper(Libro libro) {
        this(libro.getLibro_id(), libro.getTitulo(), libro.getDigital(), libro.getEdicion(), libro.getNumeroPaginas(), 
            libro.getStock(), libro.getPrecio(), libro.getFechaPublicacion(), libro.getFechaRegistro(), libro.getEditorial().getEditorial_id());
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

    public Boolean getDigital() {
        return digital;
    }

    public void setDigital(Boolean digital) {
        this.digital = digital;
    }

    public Byte getEdicion() {
        return edicion;
    }

    public void setEdicion(Byte edicion) {
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

    public Integer getEditorial_id() {
        return editorial_id;
    }

    public void setEditorial_id(Integer editorial_id) {
        this.editorial_id = editorial_id;
    }

    

}
