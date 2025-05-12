package pe.senati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Cliente;
import pe.senati.service.ClienteService;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/cliente")
public class ClienteRestController 
{

    public ClienteRestController() {}

    @Autowired
    private ClienteService clienteService;


    @GetMapping("/listar")
    public  ResponseEntity<?> listar_GET() 
    {
        Collection<Cliente> list= clienteService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

     @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody Cliente cliente) {
        clienteService.insert(cliente);
        return new ResponseEntity<>("¡Cliente registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{cliente_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer cliente_id, @RequestBody Cliente cliente) {
        Cliente clienteDb= clienteService.findById(cliente_id);

        if (clienteDb != null) 
        {
            clienteDb.setDni(cliente.getDni());
            clienteDb.setNombre(cliente.getNombre());
            clienteDb.setApellido(cliente.getApellido());
            clienteDb.setCorreo(cliente.getCorreo());
            clienteDb.setFechaNacimiento(cliente.getFechaNacimiento());
            clienteDb.setTelefono(cliente.getTelefono());
            clienteDb.setDireccion(cliente.getDireccion());
            
            clienteService.update(clienteDb);
            return new ResponseEntity<>("¡Cliente actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, cliente no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{cliente_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer cliente_id) {
        Cliente clienteDb= clienteService.findById(cliente_id);

        if (clienteDb != null) 
        {
            clienteService.delete(cliente_id);
            return new ResponseEntity<>("¡Cliente Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, cliente no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{cliente_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer cliente_id) {
        
        Cliente clienteDb = clienteService.findById(cliente_id);

        if (clienteDb != null) 
        {
            return new ResponseEntity<>(clienteDb, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, cliente no encontrado!", HttpStatus.NOT_FOUND);
    }

    
}