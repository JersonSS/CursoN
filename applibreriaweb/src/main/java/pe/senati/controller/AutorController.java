package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Autor;
import pe.senati.service.AutorService;

@Controller
@RequestMapping("/autores")
public class AutorController 
{
    @Autowired
    private AutorService autorService;

    public AutorController() {}

    @GetMapping("/listar")
    public String listar_GET(Map<String, Object> map) {
        map.put("bAutores", autorService.findAll());
        return "Autor/ListarAutor";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model) {
        Autor autorNull = new Autor();
        model.addAttribute("autor", autorNull);
        return "Autor/CrearAutor";
    }

    @PostMapping("/registrar")
    public String registrar_POST(Autor autor) {
        autorService.insert(autor);
        return "redirect:/autores/listar";
    }

    @GetMapping("/editar/{autor_id}")
    public String editar_GET(Model model, @PathVariable Integer autor_id) {
        Autor autorModel = autorService.findById(autor_id);
        model.addAttribute("autor", autorModel);
        return "Autor/EditarAutor";
    }

    @PostMapping("/editar/{autor_id}")
    public String editar_POST(Autor autor) {
        autorService.update(autor);
        return "redirect:/autores/listar";
    }

    @GetMapping("/borrar/{autor_id}")
    public String borrar_GET(Model model, @PathVariable Integer autor_id) {
        Autor autorModel = autorService.findById(autor_id);
        model.addAttribute("autor", autorModel);
        return "Autor/BorrarAutor";
    }

    @PostMapping("/borrar/{autor_id}")
    public String borrar_POST(Autor autor) {
        autorService.delete(autor.getAutor_id());
        return "redirect:/autores/listar";
    }
}