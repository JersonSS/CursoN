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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable
{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cliente_id;

    @Column(unique = true, nullable = false)
    private Integer dni;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column(unique = true, nullable = false)
    private String correo;

    @DateTimeFormat(pattern = "yyyy/MM/dd", iso = ISO.DATE)
    private LocalDate fechaNacimiento;

    @Column
    private String telefono;

    @Column
    private String direccion;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private CuentaCliente cuentaCliente;

    @OneToMany(mappedBy = "cliente")
    private List<Venta> itemsVentas = new ArrayList<>();

    public Cliente() {}

    public Cliente(Integer cliente_id, Integer dni, String nombre, String apellido, String correo,
            LocalDate fechaNacimiento, String telefono, String direccion) {
        this.cliente_id = cliente_id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CuentaCliente getCuentaCliente() {
        return cuentaCliente;
    }

    public void setCuentaCliente(CuentaCliente cuentaCliente) {
        this.cuentaCliente = cuentaCliente;
    }

    public List<Venta> getItemsVentas() {
        return itemsVentas;
    }

    public void setItemsVentas(List<Venta> itemsVentas) {
        this.itemsVentas = itemsVentas;
    }

}
