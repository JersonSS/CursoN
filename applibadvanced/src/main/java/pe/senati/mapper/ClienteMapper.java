package pe.senati.mapper;

import java.time.LocalDate;

import pe.senati.entity.Cliente;

public class ClienteMapper 
{
    private Integer cliente_id;
    private Integer dni;
    private String nombre;
    private String apellido;
    private String correo;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String direccion;

    public ClienteMapper() {}

    public ClienteMapper(Integer cliente_id, Integer dni, String nombre, String apellido, String correo,
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

    public ClienteMapper(Cliente cliente) {
        this(cliente.getCliente_id(), cliente.getDni(), cliente.getNombre(), cliente.getApellido(), cliente.getCorreo(),
            cliente.getFechaNacimiento(), cliente.getTelefono(), cliente.getDireccion());
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

}
