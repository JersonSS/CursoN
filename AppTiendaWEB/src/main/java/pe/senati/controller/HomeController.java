package pe.senati.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController 
{
    public HomeController() {}

    @GetMapping("/index")
    public String index_GET() {
        return "index";
    }
    
}
