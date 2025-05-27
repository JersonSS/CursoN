package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Proveedor;
import pe.senati.service.ProveedorService;

@Controller
@RequestMapping("/proveedor")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    public ProveedorController() {
    }

    @GetMapping("/listar")
    public String listar_GET(Map map) {
        map.put("bProveedores", proveedorService.findAll());
        return "Proveedor/Listar";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model) {
        Proveedor proveedorNull = new Proveedor();
        model.addAttribute("proveedor", proveedorNull);
        return "Proveedor/Registrar";
    }

    @PostMapping("/registrar")
    public String registrar_POST(Proveedor proveedor) {
        proveedorService.insert(proveedor);
        return "redirect:/proveedor/listar";
    }

    @GetMapping("/editar/{proveedor_id}")
    public String editar_GET(Model model, @PathVariable Integer proveedor_id) {
        Proveedor proveedorModel = proveedorService.findById(proveedor_id);
        model.addAttribute("proveedor", proveedorModel);
        return "Proveedor/Editar";
    }

    @PostMapping("/editar/{proveedor_id}")
    public String editar_POST(Proveedor proveedor) {
        proveedorService.update(proveedor);
        return "redirect:/proveedor/listar";
    }

    @GetMapping("/borrar/{proveedor_id}")
    public String borrar_GET(Model model, @PathVariable Integer proveedor_id) {
        Proveedor proveedorModel = proveedorService.findById(proveedor_id);
        model.addAttribute("proveedor", proveedorModel);
        return "Proveedor/Borrar";
    }

    @PostMapping("/borrar/{proveedor_id}")
    public String borrar_DELETE(Proveedor proveedor) {
        proveedorService.delete(proveedor.getProveedor_id());
        return "redirect:/proveedor/listar";
    }
}