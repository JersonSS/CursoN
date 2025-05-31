package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.CuentaCliente;
import pe.senati.service.CuentaClienteService;
import pe.senati.service.ClienteService;

@Controller
@RequestMapping("/cuentas-clientes")
public class CuentaClienteController {
    @Autowired
    private CuentaClienteService cuentaClienteService;

    @Autowired
    private ClienteService clienteService;

    public CuentaClienteController() {
    }

    @GetMapping("/listar")
    public String listar_GET(Map map) {
        map.put("bCuentasClientes", cuentaClienteService.findAll());
        return "CuentaCliente/ListarCuentaCliente";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model, Map map) {
        CuentaCliente cuentaClienteNull = new CuentaCliente();
        model.addAttribute("cuentaCliente", cuentaClienteNull);

        map.put("bClientes", clienteService.findAll());
        return "CuentaCliente/CrearCuentaCliente";
    }

    @PostMapping("/registrar")
    public String registrar_POST(CuentaCliente cuentaCliente) {
        cuentaClienteService.insert(cuentaCliente);
        return "redirect:/cuentas-clientes/listar";
    }

    @GetMapping("/editar/{cuenta_id}")
    public String editar_GET(Model model, @PathVariable Integer cuenta_id, Map map) {
        CuentaCliente cuentaClienteModel = cuentaClienteService.findById(cuenta_id);
        model.addAttribute("cuentaCliente", cuentaClienteModel);

        model.addAttribute("bClientes", clienteService.findAll());
        map.put("bClientes", clienteService.findAll());

        return "CuentaCliente/EditarCuentaCliente";
    }

    @PostMapping("/editar/{cuenta_id}")
    public String editar_POST(CuentaCliente cuentaCliente) {
        cuentaClienteService.update(cuentaCliente);
        return "redirect:/cuentas-clientes/listar";
    }

    @GetMapping("/borrar/{cuenta_id}")
    public String borrar_GET(Model model, @PathVariable Integer cuenta_id) {

        int count = cuentaClienteService.isDelete(cuenta_id);

        if(count==0){
            CuentaCliente cuentaClienteModel = cuentaClienteService.findById(cuenta_id);
            model.addAttribute("cuentaCliente", cuentaClienteModel);
            return "CuentaCliente/BorrarCuentaCliente";

        }

        return "CuentaCliente/Error";
    }

    @PostMapping("/borrar/{cuenta_id}")
    public String borrar_DELETE(CuentaCliente cuentaCliente) {

        cuentaClienteService.delete(cuentaCliente.getCuenta_id());
        return "redirect:/cuentas-clientes/listar";
    }
}
