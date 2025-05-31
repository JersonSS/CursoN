package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Libro;
import pe.senati.service.LibroService;
import pe.senati.service.EditorialService;
import pe.senati.service.AutorService;
import pe.senati.service.GeneroService;

@Controller
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @Autowired
    private EditorialService editorialService;

    @Autowired
    private AutorService autorService;

    @Autowired
    private GeneroService generoService;

    public LibroController() {
    }

    @GetMapping("/listar")
    public String listar_GET(Map<String, Object> map) {
        map.put("bLibros", libroService.findAll());
        return "Libro/ListarLibro";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model, Map<String, Object> map) {
        Libro libroNull = new Libro();
        model.addAttribute("libro", libroNull);

        map.put("bEditoriales", editorialService.findAll());
        map.put("bAutores", autorService.findAll());
        map.put("bGeneros", generoService.findAll());
        return "Libro/CrearLibro";
    }

    @PostMapping("/registrar")
    public String registrar_POST(Libro libro) {
        libroService.insert(libro);
        return "redirect:/libros/listar";
    }

    @GetMapping("/editar/{libro_id}")
    public String editar_GET(Model model, @PathVariable Integer libro_id, Map<String, Object> map) {
        Libro libroModel = libroService.findById(libro_id);
        model.addAttribute("libro", libroModel);

        map.put("bEditoriales", editorialService.findAll());
        map.put("bAutores", autorService.findAll());
        map.put("bGeneros", generoService.findAll());

        return "Libro/EditarLibro";
    }

    @PostMapping("/editar/{libro_id}")
    public String editar_POST(Libro libro) {
        libroService.update(libro);
        return "redirect:/libros/listar";
    }

    @GetMapping("/borrar/{libro_id}")
    public String borrar_GET(Model model, @PathVariable Integer libro_id) {

        int count = libroService.isDelete(libro_id);

        if(count==0){
            Libro libroModel = libroService.findById(libro_id);
            model.addAttribute("libro", libroModel);
            return "Libro/BorrarLibro";

        }

        return "Libro/Error";
    }

    @PostMapping("/borrar/{libro_id}")
    public String borrar_DELETE(Libro libro) {

        libroService.delete(libro.getLibro_id());
        return "redirect:/libros/listar";
    }
}
