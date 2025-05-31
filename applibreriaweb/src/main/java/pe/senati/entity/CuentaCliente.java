package pe.senati.entity;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuenta_clientes")
public class CuentaCliente implements Serializable
{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cuenta_id;

    @Column(unique = true, nullable = false)
    private String  usuario;

    @Column(nullable = false)
    private String clave;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate fechaRegistro;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id", unique = true, nullable = false)
    private Cliente cliente;
 
    public CuentaCliente() {}

    public CuentaCliente(Integer cuenta_id, String usuario, String clave) {
        this.cuenta_id = cuenta_id;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Integer getCuenta_id() {
        return cuenta_id;
    }

    public void setCuenta_id(Integer cuenta_id) {
        this.cuenta_id = cuenta_id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
    
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
