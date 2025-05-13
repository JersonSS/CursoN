package pe.senati.mapper;

import pe.senati.entity.DetalleVenta;

public class DetallaVentaMapper 
{
    private Integer detalle_id;
    private Integer cantidad;
    private Integer precioUnitario;
    private Double subtotal;
    private Integer venta_id;
    private Integer libro_id;

    public DetallaVentaMapper() {}

    public DetallaVentaMapper(Integer detalle_id, Integer cantidad, Integer precioUnitario, Double subtotal,
            Integer venta_id, Integer libro_id) {
        this.detalle_id = detalle_id;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.venta_id = venta_id;
        this.libro_id = libro_id;
    }

    public DetallaVentaMapper(DetalleVenta detalleVenta) {
        this(detalleVenta.getDetalle_id(), detalleVenta.getCantidad(), detalleVenta.getPrecioUnitario(), detalleVenta.getSubtotal(), 
            detalleVenta.getVenta().getVenta_id(), detalleVenta.getLibro().getLibro_id());
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

    public Integer getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(Integer venta_id) {
        this.venta_id = venta_id;
    }

    public Integer getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(Integer libro_id) {
        this.libro_id = libro_id;
    }

    
}
