package pe.senati.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ventas")
public class Venta implements Serializable
{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer venta_id;

    @Column
    private Double total;

    @DateTimeFormat(pattern = "yyyy/MM/dd", iso = ISO.DATE)
    private LocalDate fechaVenta;


    @OneToMany(mappedBy = "venta")
    private List<DetalleVenta> itemsDetalleVentas = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    public Venta() {}

    public Venta(Integer venta_id, Double total, LocalDate fechaVenta) {
        this.venta_id = venta_id;
        this.total = total;
        this.fechaVenta = fechaVenta;
    }

    public Integer getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(Integer venta_id) {
        this.venta_id = venta_id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public List<DetalleVenta> getItemsDetalleVentas() {
        return itemsDetalleVentas;
    }

    public void setItemsDetalleVentas(List<DetalleVenta> itemsDetalleVentas) {
        this.itemsDetalleVentas = itemsDetalleVentas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
