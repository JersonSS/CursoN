package pe.senati.repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import pe.senati.entity.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository
{
    private static final Map<Integer, Libro> tbl_libros = new HashMap<>();
    static
    {
        // libros
        Libro libro1 = new Libro(2001, "Un mundo para Julius", "Alfredo Bryce Echenique", "Editorial Peisa", "Novela", true, 'A', (short) 450, 30, 49.90, LocalDate.of(2020, 5, 12), LocalDate.of(2021, 1, 10));
        Libro libro2 = new Libro(2002, "La ciudad y los perros", "Mario Vargas Llosa", "Seix Barral", "Novela", false, 'B', (short) 376, 25, 59.90, LocalDate.of(2018, 3, 8), LocalDate.of(2019, 4, 15));
        Libro libro3 = new Libro(2003, "Redoble por Rancas", "Manuel Scorza", "Planeta", "Realismo mágico", false, 'A', (short) 315, 20, 44.50, LocalDate.of(2019, 8, 1), LocalDate.of(2020, 2, 20));
        Libro libro4 = new Libro(2004, "No me esperen en abril", "Alfredo Bryce Echenique", "Planeta", "Novela", true, 'C', (short) 290, 15, 39.90, LocalDate.of(2021, 9, 10), LocalDate.of(2022, 3, 5));
        Libro libro5 = new Libro(2005, "El pez en el agua", "Mario Vargas Llosa", "Alfaguara", "Autobiografía", false, 'A', (short) 560, 18, 69.00, LocalDate.of(2017, 2, 17), LocalDate.of(2018, 1, 7));
        Libro libro6 = new Libro(2006, "País de Jauja", "Edgardo Rivera Martínez", "PUCP", "Novela", true, 'A', (short) 260, 10, 38.00, LocalDate.of(2020, 6, 30), LocalDate.of(2021, 1, 30));
        Libro libro7 = new Libro(2007, "Los ríos profundos", "José María Arguedas", "Losada", "Novela andina", false, 'B', (short) 280, 22, 42.50, LocalDate.of(2016, 11, 12), LocalDate.of(2017, 4, 1));
        Libro libro8 = new Libro(2008, "Todas las sangres", "José María Arguedas", "Horizonte", "Novela social", false, 'A', (short) 720, 12, 79.90, LocalDate.of(2015, 10, 5), LocalDate.of(2016, 3, 20));
        Libro libro9 = new Libro(2009, "Abril rojo", "Santiago Roncagliolo", "Alfaguara", "Thriller", true, 'A', (short) 340, 28, 45.90, LocalDate.of(2022, 4, 3), LocalDate.of(2023, 1, 12));
        Libro libro10 = new Libro(2010, "Contigo en la distancia", "Raúl Tola", "Planeta", "Romance", true, 'B', (short) 250, 14, 36.90, LocalDate.of(2021, 12, 22), LocalDate.of(2022, 5, 5));

        // libros guardados
        tbl_libros.put(libro1.getLibro_id(), libro1);
        tbl_libros.put(libro2.getLibro_id(), libro2);
        tbl_libros.put(libro3.getLibro_id(), libro3);
        tbl_libros.put(libro4.getLibro_id(), libro4);
        tbl_libros.put(libro5.getLibro_id(), libro5);
        tbl_libros.put(libro6.getLibro_id(), libro6);
        tbl_libros.put(libro7.getLibro_id(), libro7);
        tbl_libros.put(libro8.getLibro_id(), libro8);
        tbl_libros.put(libro9.getLibro_id(), libro9);
        tbl_libros.put(libro10.getLibro_id(), libro10);

    }
    
    @Override
    public void insert(Libro libro) {
        
        Integer libro_id=tbl_libros.size()+2001;
		libro.setLibro_id(libro_id);

        tbl_libros.put(libro.getLibro_id(), libro);
    }

    @Override
    public void update(Libro libro) {
        tbl_libros.put(libro.getLibro_id(), libro);        
    }

    @Override
    public void delete(Integer libro_id) {
        tbl_libros.remove(libro_id);        
    }

    @Override
    public Libro findById(Integer libro_id) {
        return tbl_libros.get(libro_id);
    }

    @Override
    public Collection<Libro> findAll() {
        return tbl_libros.values();
    }

    

}
