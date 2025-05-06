package pe.senati.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer proveedor_id;

    @Column
    private String nombre;
    
    @Column
    private Integer telefono;
    
    @Column(unique = true, nullable = false)
    private String website;

    @Column(unique = true, nullable = false)
    private Long ruc;

    @ManyToMany(mappedBy = "itemsProveedor")
    private Set<Producto> itemsProducto = new HashSet<>();

    public Proveedor() {}

    public Proveedor(Integer proveedor_id, String nombre, Integer telefono, String website, Long ruc) {
        this.proveedor_id = proveedor_id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.website = website;
        this.ruc = ruc;
    }

    public Integer getProveedor_id() {
        return proveedor_id;
    }

    public void setProveedor_id(Integer proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Long getRuc() {
        return ruc;
    }

    public void setRuc(Long ruc) {
        this.ruc = ruc;
    }

    public Set<Producto> getItemsProducto() {
        return itemsProducto;
    }

    public void setItemsProducto(Set<Producto> itemsProducto) {
        this.itemsProducto = itemsProducto;
    }

    
}
