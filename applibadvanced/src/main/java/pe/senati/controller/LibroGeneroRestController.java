package pe.senati.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Genero;
import pe.senati.entity.Libro;
import pe.senati.mapper.LibroGeneroMapper;
import pe.senati.service.GeneroService;
import pe.senati.service.LibroService;
import pe.senati.util.UtilMapper;
import pe.senati.vo.LibroGenero;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/libro_genero")
public class LibroGeneroRestController 
{
    @Autowired
    private LibroService libroService;

    @Autowired
    private GeneroService generoService;

    public LibroGeneroRestController() {}

    @GetMapping("/listar")
    public ResponseEntity<?> listar_GET() 
    {
        Collection<Object[]> list = libroService.findAll_libro_genero();
        Collection<LibroGeneroMapper> listMapper = UtilMapper.convertToLibroGeneros(list);
        return new ResponseEntity<>(listMapper, HttpStatus.OK);
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> registrar_POST(@RequestBody LibroGenero libroGenero) 
    {
         Libro libroDb = libroService.findById(libroGenero.getLibro().getLibro_id());

        if (libroDb!=null) 
        {
            Genero generoDb = generoService.findById(libroGenero.getGenero().getGenero_id());    

            if (generoDb!=null) 
            {
                libroDb.addGenero(generoDb);
                libroService.update(libroDb);
                return new ResponseEntity<>("¡Libro - Genero registrado!", HttpStatus.CREATED);    
            }

            return new ResponseEntity<>("¡Error, genero no encontrado!", HttpStatus.NOT_FOUND);    
        }

        return new ResponseEntity<>("¡Error, libro no encontrado!", HttpStatus.NOT_FOUND);
    }
    
    
    
}
