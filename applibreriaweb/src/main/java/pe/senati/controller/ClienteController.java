package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Cliente;
import pe.senati.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController 
{
    @Autowired
    private ClienteService clienteService;

    public ClienteController() {}

    @GetMapping("/listar")
    public String listar_GET(Map<String, Object> map) {
        map.put("bClientes", clienteService.findAll());
        return "Cliente/ListarCliente";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model) {
        Cliente clienteNull = new Cliente();
        model.addAttribute("cliente", clienteNull);
        return "Cliente/CrearCliente";
    }

    @PostMapping("/registrar")
    public String registrar_POST(Cliente cliente) {
        clienteService.insert(cliente);
        return "redirect:/clientes/listar";
    }

    @GetMapping("/editar/{cliente_id}")
    public String editar_GET(Model model, @PathVariable Integer cliente_id) {
        Cliente clienteModel = clienteService.findById(cliente_id);
        model.addAttribute("cliente", clienteModel);
        return "Cliente/EditarCliente";
    }

    @PostMapping("/editar/{cliente_id}")
    public String editar_POST(Cliente cliente) {
        clienteService.update(cliente);
        return "redirect:/clientes/listar";
    }

    @GetMapping("/borrar/{cliente_id}")
    public String borrar_GET(Model model, @PathVariable Integer cliente_id) {
        
        int count = clienteService.isDelete(cliente_id);
        if (count == 0) {
            Cliente clienteModel = clienteService.findById(cliente_id);
            model.addAttribute("cliente", clienteModel);
            return "Cliente/BorrarCliente";
        }
        return "Cliente/Error";
    }

    @PostMapping("/borrar/{cliente_id}")
    public String borrar_POST(Cliente cliente) {
        clienteService.delete(cliente.getCliente_id());
        return "redirect:/clientes/listar";
    }
}
