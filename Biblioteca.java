
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
    //Muestra todos los libros
    public void mostrarLibros(){
        System.out.println("Libros en biblioteca \n");
        for (Libro libro: this.libros) {
            libro.mostrarInformacion();
        }
    }
    //Busca un libro por el titulo 
    public void buscarLibroporLibro(String titulo){
        System.out.println("Libros con el titulo " + titulo + " encontrados: \n");
        int contador = 0;
        for (Libro libro: this.libros) {
            if (titulo.equals(libro.getTitulo())) {
                libro.mostrarInformacion();
                contador++;
            }    
        }
        if(contador == 0){
            System.out.println("No hay ninguna coincidencia! \n");
        }
    }
}