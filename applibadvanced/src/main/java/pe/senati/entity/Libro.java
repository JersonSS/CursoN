package pe.senati.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro implements Serializable
{

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer libro_id;

    @Column
    private String titulo;

    @Column
    private Boolean digital; 

    @Column
    private Character edicion;

    @Column
    private Short numeroPaginas;

    @Column
    private Integer stock;

    @Column
    private Double precio;
    
    @DateTimeFormat(pattern = "yyyy/MM/dd", iso = ISO.DATE)
    private LocalDate fechaPublicacion;
    
    @DateTimeFormat(pattern = "yyyy/MM/dd", iso = ISO.DATE)
    private LocalDate fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "editorial_id", nullable = false)
    private Editorial editorial;

    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL)
    private List<DetalleVenta> itemsDetalleVentas = new ArrayList<>();

    @ManyToMany(mappedBy = "itemsLibros")
    private List<Autor> itemsAutores = new ArrayList<>();

    @ManyToMany
    @JoinTable(
        name = "libro_genero",
        joinColumns = @JoinColumn(name = "libro_id"),
        inverseJoinColumns = @JoinColumn(name = "genero_id")
    )
    private List<Genero> itemsGeneros = new ArrayList<>();

    public Libro() {}

    public Libro(Integer libro_id, String titulo, Boolean digital, Character edicion, Short numeroPaginas,
            Integer stock, Double precio, LocalDate fechaPublicacion, LocalDate fechaRegistro) {
        this.libro_id = libro_id;
        this.titulo = titulo;
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

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<DetalleVenta> getItemsDetalleVentas() {
        return itemsDetalleVentas;
    }

    public void setItemsDetalleVentas(List<DetalleVenta> itemsDetalleVentas) {
        this.itemsDetalleVentas = itemsDetalleVentas;
    }

    public List<Autor> getItemsAutores() {
        return itemsAutores;
    }

    public void setItemsAutores(List<Autor> itemsAutores) {
        this.itemsAutores = itemsAutores;
    }

    public List<Genero> getItemsGeneros() {
        return itemsGeneros;
    }

    public void setItemsGeneros(List<Genero> itemsGeneros) {
        this.itemsGeneros = itemsGeneros;
    }
    
}
