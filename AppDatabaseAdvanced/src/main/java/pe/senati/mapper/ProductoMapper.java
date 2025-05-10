package pe.senati.mapper;

import java.time.LocalDate;

import pe.senati.entity.Producto;


public class ProductoMapper 
{
    private Integer producto_id;
	
    private String nombre;
	
    private String marca;
	
    private Double precio;
    
    private LocalDate ffabricacion;
    
    private LocalDate fvencimiento;
    
    private Integer stock;

    private Integer categoria_id;

    public ProductoMapper() {}

    public ProductoMapper(Integer producto_id, String nombre, String marca, Double precio, LocalDate ffabricacion,
            LocalDate fvencimiento, Integer stock, Integer categoria_id) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.ffabricacion = ffabricacion;
        this.fvencimiento = fvencimiento;
        this.stock = stock;
        this.categoria_id = categoria_id;
    }

    public ProductoMapper(Producto producto) {
        this(producto.getProducto_id(), producto.getNombre(), producto.getMarca(), producto.getPrecio(), producto.getFfabricacion(), producto.getFvencimiento(),
        producto.getStock(), producto.getCategoria().getCategoria_id());
    }

    public Integer getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Integer producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDate getFfabricacion() {
        return ffabricacion;
    }

    public void setFfabricacion(LocalDate ffabricacion) {
        this.ffabricacion = ffabricacion;
    }

    public LocalDate getFvencimiento() {
        return fvencimiento;
    }

    public void setFvencimiento(LocalDate fvencimiento) {
        this.fvencimiento = fvencimiento;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
    }

    
}
