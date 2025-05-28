package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Categoria;
import pe.senati.service.CategoriaService;
import pe.senati.service.JefeService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private JefeService jefeService;

    public CategoriaController() {
    }

    @GetMapping("/listar")
    public String listar_GET(Map map) {
        map.put("bCategorias", categoriaService.findAll());
        return "Categoria/Listar";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model, Map map) {
        Categoria categoriaNull = new Categoria();
        model.addAttribute("categoria", categoriaNull);

        map.put("bJefes", jefeService.findAll());
        return "Categoria/Registrar";
    }

    @PostMapping("/registrar")
    public String registrar_POST(Categoria categoria) {
        categoriaService.insert(categoria);
        return "redirect:/categoria/listar";
    }

    @GetMapping("/editar/{categoria_id}")
    public String editar_GET(Model model, @PathVariable Integer categoria_id, Map map) {
        Categoria categoriaModel = categoriaService.findById(categoria_id);
        model.addAttribute("categoria", categoriaModel);

        model.addAttribute("bJefes", jefeService.findAll());
        map.put("bJefes", jefeService.findAll());

        return "Categoria/Editar";
    }

    @PostMapping("/editar/{categoria_id}")
    public String editar_POST(Categoria categoria) {
        categoriaService.update(categoria);
        return "redirect:/categoria/listar";
    }

    @GetMapping("/borrar/{categoria_id}")
    public String borrar_GET(Model model, @PathVariable Integer categoria_id) {

        int count = categoriaService.isDelete(categoria_id);

        if(count==0){
            Categoria categoriaModel = categoriaService.findById(categoria_id);
            model.addAttribute("categoria", categoriaModel);
            return "Categoria/Borrar";

        }

        return "Categoria/Error";
    }

    @PostMapping("/borrar/{categoria_id}")
    public String borrar_DELETE(Categoria categoria) {

        categoriaService.delete(categoria.getCategoria_id());
        return "redirect:/categoria/listar";
    }
}