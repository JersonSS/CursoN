package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Jefe;
import pe.senati.service.JefeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;





@Controller
@RequestMapping("/jefe")
public class JefeController 
{
    @Autowired
    private JefeService jefeService;

    public JefeController() {}

    @GetMapping("/listar")
    public String listar_GET(Map map) 
    {
        map.put("bJefes", jefeService.findAll());
        return "Jefe/Listar";
    }

    @GetMapping("/registrar")
    public String registrar_GET(Model model) {

        Jefe jefeNull = new Jefe();
        model.addAttribute("jefe", jefeNull);

        return "Jefe/Registrar";
    }

    @PostMapping("/registrar")
    public String registrar_POST(Jefe jefe) {
        
        jefeService.insert(jefe);

        return "redirect:/jefe/listar";
    }

    @GetMapping("/editar/{jefe_id}")
    public String editar_GET(Model model,@PathVariable Integer jefe_id) {
        Jefe jefeModel = jefeService.findById(jefe_id);
        model.addAttribute("jefe", jefeModel);
        return "Jefe/Editar";
    }

    @PostMapping("/editar/{jefe_id}")
    public String editar_POST(Jefe jefe) {
        jefeService.update(jefe);
        
        return "redirect:/jefe/listar";
    }
    
    
    
    
    
}
