package pe.senati.mapper;

public class ProductoProveedorMapper 
{
    private Integer producto_id;
    private String producto;
    private Integer proveedor_id;
    private String proveedor;

    public ProductoProveedorMapper() {}

    public ProductoProveedorMapper(Integer producto_id, String producto, Integer proveedor_id, String proveedor) {
        this.producto_id = producto_id;
        this.producto = producto;
        this.proveedor_id = proveedor_id;
        this.proveedor = proveedor;
    }

    public Integer getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Integer producto_id) {
        this.producto_id = producto_id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getProveedor_id() {
        return proveedor_id;
    }

    public void setProveedor_id(Integer proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    

}
