package pe.senati.mapper;

import java.time.LocalDate;

import pe.senati.entity.Venta;

public class VentaMapper 
{
    private Integer venta_id;
    private Double total;
    private LocalDate fechaVenta;
    private Integer cliente_id;

    public VentaMapper() {}


    public VentaMapper(Integer venta_id, Double total, LocalDate fechaVenta, Integer cliente_id) {
        this.venta_id = venta_id;
        this.total = total;
        this.fechaVenta = fechaVenta;
        this.cliente_id = cliente_id;
    }

    public VentaMapper(Venta venta) {
        this(venta.getVenta_id(), venta.getTotal(), venta.getFechaVenta(), venta.getCliente().getCliente_id());
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


    public Integer getCliente_id() {
        return cliente_id;
    }


    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    

    
}
