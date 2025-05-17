package pe.senati.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Categoria;
import pe.senati.mapper.CategoriaMapper;
import pe.senati.service.CategoriaService;
import pe.senati.util.UtilMapper;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaRestController 
{
    @Autowired
    private CategoriaService categoriaService;

    public CategoriaRestController() {}

    @GetMapping("/listar")
    public ResponseEntity<?> listar_GET()
    {
        Collection<Categoria> list= categoriaService.findAll();
        Collection<CategoriaMapper>listMapper = UtilMapper.convertToCategorias(list);
        return new ResponseEntity<>(listMapper, HttpStatus.OK); 
    }

    @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody Categoria categoria) {
        categoriaService.insert(categoria);
        return new ResponseEntity<>("¡Categoria registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{categoria_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer categoria_id, @RequestBody Categoria categoria) {
        Categoria categoriaDb= categoriaService.findById(categoria_id);

        if (categoriaDb != null) 
        {
            categoriaDb.setDescripcion(categoria.getDescripcion());
            
            categoriaService.update(categoriaDb);
            return new ResponseEntity<>("¡Categoria actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, categoria no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{categoria_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer categoria_id) {
        Categoria categoriaDb= categoriaService.findById(categoria_id);

        if (categoriaDb != null) 
        {
            categoriaService.delete2(categoria_id);
            return new ResponseEntity<>("¡Categoria Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, categoria no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{categoria_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer categoria_id) {
        
        Categoria categoriaDb = categoriaService.findById(categoria_id);
        CategoriaMapper categoriaMapper = new CategoriaMapper(categoriaDb);

        if (categoriaDb != null) 
        {
            return new ResponseEntity<>(categoriaMapper, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, categoria no encontrado!", HttpStatus.NOT_FOUND);
    }
    
    
}

