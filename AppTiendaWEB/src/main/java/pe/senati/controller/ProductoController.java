package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Producto;
import pe.senati.service.ProductoService;
import pe.senati.service.CategoriaService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @Autowired
    private CategoriaService categoriaService;

    public ProductoController() {
    }

    @GetMapping("/listar")
    public String listar_GET(Map map) {
        map.put("bProductos", productoService.findAll());
        return "Producto/Listar";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model, Map map) {
        Producto productoNull = new Producto();
        model.addAttribute("producto", productoNull);

        map.put("bCategorias", categoriaService.findAll());
        return "Producto/Registrar";
    }

    @PostMapping("/registrar")
    public String registrar_POST(Producto producto) {
        productoService.insert(producto);
        return "redirect:/producto/listar";
    }

    @GetMapping("/editar/{producto_id}")
    public String editar_GET(Model model, @PathVariable Integer producto_id, Map map) {
        Producto productoModel = productoService.findById(producto_id);
        model.addAttribute("producto", productoModel);

        map.put("bCategorias", categoriaService.findAll());
        return "Producto/Editar";
    }

    @PostMapping("/editar/{producto_id}")
    public String editar_POST(Producto producto) {
        productoService.update(producto);
        return "redirect:/producto/listar";
    }

    @GetMapping("/borrar/{producto_id}")
    public String borrar_GET(Model model, @PathVariable Integer producto_id) {
        Producto productoModel = productoService.findById(producto_id);
        model.addAttribute("producto", productoModel);

        return "Producto/Borrar";
    }

    @PostMapping("/borrar/{producto_id}")
    public String borrar_DELETE(Producto producto) {
        productoService.delete(producto.getProducto_id());
        return "redirect:/producto/listar";
    }
}