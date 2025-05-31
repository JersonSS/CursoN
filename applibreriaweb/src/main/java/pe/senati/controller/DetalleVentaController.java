package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.DetalleVenta;
import pe.senati.service.DetalleVentaService;
import pe.senati.service.VentaService;
import pe.senati.service.LibroService;

@Controller
@RequestMapping("/detalles-ventas")
public class DetalleVentaController {
    @Autowired
    private DetalleVentaService detalleVentaService;

    @Autowired
    private VentaService ventaService;

    @Autowired
    private LibroService libroService;

    public DetalleVentaController() {
    }

    @GetMapping("/listar")
    public String listar_GET(Map<String, Object> map) {
        map.put("bDetallesVentas", detalleVentaService.findAll());
        return "DetalleVenta/ListarDetalleVenta";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model, Map<String, Object> map) {
        DetalleVenta detalleVentaNull = new DetalleVenta();
        model.addAttribute("detalleVenta", detalleVentaNull);

        map.put("bVentas", ventaService.findAll());
        map.put("bLibros", libroService.findAll());
        return "DetalleVenta/CrearDetalleVenta";
    }

    @PostMapping("/registrar")
    public String registrar_POST(DetalleVenta detalleVenta) {
        detalleVentaService.insert(detalleVenta);
        return "redirect:/detalles-ventas/listar";
    }

    @GetMapping("/editar/{detalle_id}")
    public String editar_GET(Model model, @PathVariable Integer detalle_id, Map<String, Object> map) {
        DetalleVenta detalleVentaModel = detalleVentaService.findById(detalle_id);
        model.addAttribute("detalleVenta", detalleVentaModel);

        map.put("bVentas", ventaService.findAll());
        map.put("bLibros", libroService.findAll());

        return "DetalleVenta/EditarDetalleVenta";
    }

    @PostMapping("/editar/{detalle_id}")
    public String editar_POST(DetalleVenta detalleVenta) {
        detalleVentaService.update(detalleVenta);
        return "redirect:/detalles-ventas/listar";
    }

    @GetMapping("/borrar/{detalle_id}")
    public String borrar_GET(Model model, @PathVariable Integer detalle_id) {

        DetalleVenta detalleVentaModel = detalleVentaService.findById(detalle_id);
        model.addAttribute("detalleVenta", detalleVentaModel);
        return "DetalleVenta/BorrarDetalleVenta";

    }

    @PostMapping("/borrar/{detalle_id}")
    public String borrar_DELETE(DetalleVenta detalleVenta) {

        detalleVentaService.delete(detalleVenta.getDetalle_id());
        return "redirect:/detalles-ventas/listar";
    }
}
