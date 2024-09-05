
import java.time.LocalDate;

public final class Libro{

    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

    public Libro(String titulo,
                      String autor,
                      int añoPublicacion,
                      String isbn){
        setTitulo(titulo);
        setAutor(autor);
        setAño(añoPublicacion);
        setisbn(isbn);
    }
    //Inserta el titulo
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    //Consulta el titulo
    public String getTitulo(){
        return titulo;
    }

    //Inserta el autor
    public void setAutor(String autor){
        this.autor = autor;
    }
    //Consulta el autor
    public String getAutor(){
        return autor;
    }

    //Inserta el año de publicacion
    public void setAño(int añoPublicacion){
        this.añoPublicacion = añoPublicacion;
    }
    //Consulta el año de publicacion
    public int getAño(){
        return añoPublicacion;
    }

    //Inserta el ISBN
    public void setisbn(String isbn){
        this.isbn = isbn;
    }
    //Consulta el ISBN
    public String getisbn(){
        return isbn;
    }

    //Muestra la informacion del libro
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo + "\n" +
                           "Autor: " + autor + "\n" +
                           "Año de publicacion: " + añoPublicacion+ "\n" +
                           "ISBN: " + isbn + "\n");
    }

    //Regresa true si salio hace mas de 20 años
    public boolean esAntiguo(){
        int añoActual = LocalDate.now().getYear();
        return (añoActual - añoPublicacion) > 20;
    }
}
