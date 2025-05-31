package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Editorial;
import pe.senati.service.EditorialService;

@Controller
@RequestMapping("/editoriales")
public class EditorialController {
    @Autowired
    private EditorialService editorialService;

    public EditorialController() {}

    @GetMapping("/listar")
    public String listar_GET(Map<String, Object> map) {
        map.put("bEditoriales", editorialService.findAll());
        return "Editorial/ListarEditorial";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model) {
        Editorial editorialNull = new Editorial();
        model.addAttribute("editorial", editorialNull);
        return "Editorial/CrearEditorial";
    }

    @PostMapping("/registrar")
    public String registrar_POST(Editorial editorial) {
        editorialService.insert(editorial);
        return "redirect:/editoriales/listar";
    }

    @GetMapping("/editar/{editorial_id}")
    public String editar_GET(Model model, @PathVariable Integer editorial_id) {
        Editorial editorialModel = editorialService.findById(editorial_id);
        model.addAttribute("editorial", editorialModel);
        return "Editorial/EditarEditorial";
    }

    @PostMapping("/editar/{editorial_id}")
    public String editar_POST(Editorial editorial) {
        editorialService.update(editorial);
        return "redirect:/editoriales/listar";
    }

    @GetMapping("/borrar/{editorial_id}")
    public String borrar_GET(Model model, @PathVariable Integer editorial_id) {
        Editorial editorialModel = editorialService.findById(editorial_id);
        model.addAttribute("editorial", editorialModel);
        return "Editorial/BorrarEditorial";
    }

    @PostMapping("/borrar/{editorial_id}")
    public String borrar_POST(Editorial editorial) {
        editorialService.delete(editorial.getEditorial_id());
        return "redirect:/editoriales/listar";
    }
}
