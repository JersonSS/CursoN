package pe.senati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.CuentaCliente;
import pe.senati.mapper.CuentaClienteMapper;
import pe.senati.service.CuentaClienteService;
import pe.senati.util.UtilMapper;

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
@RequestMapping("api/cuentaCliente")
public class CuentaClienteRestController 
{

    public CuentaClienteRestController() {}

    @Autowired
    private CuentaClienteService cuentaClienteService;


    @GetMapping("/listar")
    public  ResponseEntity<?> listar_GET() 
    {
        Collection<CuentaCliente> list= cuentaClienteService.findAll();
        Collection<CuentaClienteMapper> listMapper = UtilMapper.convertToCuentaClientes(list);
        return new ResponseEntity<>(listMapper, HttpStatus.OK);
    }

     @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody CuentaCliente cuentaCliente) {
        cuentaClienteService.insert(cuentaCliente);
        return new ResponseEntity<>("¡CuentaCliente registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{cuentaCliente_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer cuentaCliente_id, @RequestBody CuentaCliente cuentaCliente) {
        CuentaCliente cuentaClienteDb= cuentaClienteService.findById(cuentaCliente_id);

        if (cuentaClienteDb != null) 
        {
            cuentaClienteDb.setUsuario(cuentaCliente.getUsuario());
            cuentaClienteDb.setClave(cuentaCliente.getClave());
            cuentaClienteDb.setCliente(cuentaCliente.getCliente());
            
            cuentaClienteService.update(cuentaClienteDb);
            return new ResponseEntity<>("¡CuentaCliente actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, cuentaCliente no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{cuentaCliente_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer cuentaCliente_id) {
        CuentaCliente cuentaClienteDb= cuentaClienteService.findById(cuentaCliente_id);

        if (cuentaClienteDb != null) 
        {
            cuentaClienteService.delete(cuentaCliente_id);
            return new ResponseEntity<>("¡CuentaCliente Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, cuentaCliente no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{cuentaCliente_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer cuentaCliente_id) {
        
        CuentaCliente cuentaClienteDb = cuentaClienteService.findById(cuentaCliente_id);
        CuentaClienteMapper cuentaClienteMapper = new CuentaClienteMapper(cuentaClienteDb);

        if (cuentaClienteDb != null) 
        {
            return new ResponseEntity<>(cuentaClienteMapper, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, cuentaCliente no encontrado!", HttpStatus.NOT_FOUND);
    }

    
}