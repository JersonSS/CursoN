package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Genero;
import pe.senati.service.GeneroService;

@Controller
@RequestMapping("/generos")
public class GeneroController {
    @Autowired
    private GeneroService generoService;

    public GeneroController() {}

    @GetMapping("/listar")
    public String listar_GET(Map<String, Object> map) {
        map.put("bGeneros", generoService.findAll());
        return "Genero/ListarGenero";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model) {
        Genero generoNull = new Genero();
        model.addAttribute("genero", generoNull);
        return "Genero/CrearGenero";
    }

    @PostMapping("/registrar")
    public String registrar_POST(Genero genero) {
        generoService.insert(genero);
        return "redirect:/generos/listar";
    }

    @GetMapping("/editar/{genero_id}")
    public String editar_GET(Model model, @PathVariable Integer genero_id) {
        Genero generoModel = generoService.findById(genero_id);
        model.addAttribute("genero", generoModel);
        return "Genero/EditarGenero";
    }

    @PostMapping("/editar/{genero_id}")
    public String editar_POST(Genero genero) {
        generoService.update(genero);
        return "redirect:/generos/listar";
    }

    @GetMapping("/borrar/{genero_id}")
    public String borrar_GET(Model model, @PathVariable Integer genero_id) {
        Genero generoModel = generoService.findById(genero_id);
        model.addAttribute("genero", generoModel);
        return "Genero/BorrarGenero";
    }

    @PostMapping("/borrar/{genero_id}")
    public String borrar_POST(Genero genero) {
        generoService.delete(genero.getGenero_id());
        return "redirect:/generos/listar";
    }
}
