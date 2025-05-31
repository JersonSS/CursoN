package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Venta;
import pe.senati.service.VentaService;
import pe.senati.service.ClienteService;

@Controller
@RequestMapping("/ventas")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @Autowired
    private ClienteService clienteService;

    public VentaController() {
    }

    @GetMapping("/listar")
    public String listar_GET(Map<String, Object> map) {
        map.put("bVentas", ventaService.findAll());
        return "Venta/ListarVenta";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model, Map<String, Object> map) {
        Venta ventaNull = new Venta();
        model.addAttribute("venta", ventaNull);

        map.put("bClientes", clienteService.findAll());
        return "Venta/CrearVenta";
    }

    @PostMapping("/registrar")
    public String registrar_POST(Venta venta) {
        ventaService.insert(venta);
        return "redirect:/ventas/listar";
    }

    @GetMapping("/editar/{venta_id}")
    public String editar_GET(Model model, @PathVariable Integer venta_id, Map<String, Object> map) {
        Venta ventaModel = ventaService.findById(venta_id);
        model.addAttribute("venta", ventaModel);

        map.put("bClientes", clienteService.findAll());

        return "Venta/EditarVenta";
    }

    @PostMapping("/editar/{venta_id}")
    public String editar_POST(Venta venta) {
        ventaService.update(venta);
        return "redirect:/ventas/listar";
    }

    @GetMapping("/borrar/{venta_id}")
    public String borrar_GET(Model model, @PathVariable Integer venta_id) {

        int count = ventaService.isDelete(venta_id);

        if(count==0){
            Venta ventaModel = ventaService.findById(venta_id);
            model.addAttribute("venta", ventaModel);
            return "Venta/BorrarVenta";

        }

        return "Venta/Error";
    }

    @PostMapping("/borrar/{venta_id}")
    public String borrar_DELETE(Venta venta) {

        ventaService.delete(venta.getVenta_id());
        return "redirect:/ventas/listar";
    }
}
