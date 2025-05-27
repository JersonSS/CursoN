package pe.senati.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_ventas")
public class DetalleVenta implements Serializable
{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detalle_id;

    @Column
    private Integer cantidad;

    @Column
    private Integer precioUnitario;

    @Column
    private Double subtotal;

    @ManyToOne
    @JoinColumn(name = "venta_id", nullable = false)
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "libro_id", nullable = false)
    private Libro libro;


    public DetalleVenta() {}


    public DetalleVenta(Integer detalle_id, Integer cantidad, Integer precioUnitario, Double subtotal) {
        this.detalle_id = detalle_id;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }


    public Integer getDetalle_id() {
        return detalle_id;
    }


    public void setDetalle_id(Integer detalle_id) {
        this.detalle_id = detalle_id;
    }


    public Integer getCantidad() {
        return cantidad;
    }


    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


    public Integer getPrecioUnitario() {
        return precioUnitario;
    }


    public void setPrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


    public Double getSubtotal() {
        return subtotal;
    }


    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }


    public Venta getVenta() {
        return venta;
    }


    public void setVenta(Venta venta) {
        this.venta = venta;
    }


    public Libro getLibro() {
        return libro;
    }


    public void setLibro(Libro libro) {
        this.libro = libro;
    }

}
