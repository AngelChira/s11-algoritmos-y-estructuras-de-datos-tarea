package s11algoritmostarea;

import java.util.LinkedList;
import java.util.List;

public class PilaLE {
    LinkedList<Libro> libros;

    public PilaLE() {
        libros = new LinkedList<>();
    }
    
    public boolean push(Libro libro) {
        return libros.add(libro);
    }
    
    public Libro pop() {
        Libro lib = null;
        if (!libros.isEmpty()) {
            lib = libros.getLast();
            libros.removeLast();
        }        
        return lib;
    }
    
    public void clear() {
        libros.clear();
    }
    
    public boolean isEmpty() {
        return libros.isEmpty();
    }
    
    public int size() {
        return libros.size();
    }
    
    public Libro peek() {
        return libros.getLast();
    }
    
    public List<Libro> listarLibros() {
        return libros;
    }
}
