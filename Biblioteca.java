import java.util.*;

public class Biblioteca{
    private final ArrayList<Libro> libros;
    
    public Biblioteca(){
        this.libros = new ArrayList<>();
    }
    //Agrega un libro a la lista
    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }

    //Busca un libro por el titulo 
    public ArrayList<Libro> buscarLibroPorTitulo(String titulo){
        ArrayList<Libro> librosTitulo = new ArrayList<>();
        for (Libro libro: this.libros) {
            if (titulo.equals(libro.getTitulo())) {
                librosTitulo.add(libro);
            }    
        }
        return librosTitulo;
    }

    //regresa el tamaño del arrayList
    public ArrayList<Libro> getLibros(){
        return libros;
    }
}