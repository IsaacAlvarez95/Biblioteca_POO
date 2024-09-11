import java.time.LocalDate;

public final class Libro{

    private String titulo;
    private Autor autor;
    private int añoPublicacion;
    private String isbn;
    private Boolean disponible; //Muestra si esta disponible o no

    public Libro(String titulo,
                      Autor autor,
                      int añoPublicacion,
                      String isbn,
                      Boolean disponible){
        
        this.autor = new Autor(autor.getID(), autor.getCorreo(), autor.getAutor());
        setTitulo(titulo);
        setAño(añoPublicacion);
        setisbn(isbn);
        setDisponible(disponible);
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
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    //Consulta el autor
    public Autor getAutor(){
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

    //Inserta si esta disponible
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    //Consulta el año de publicacion
    public boolean getDisponible(){
        return disponible;
    }

    //Regresa la informacion del libro
    public Libro getInformacion(){
        Libro informacion = new Libro(titulo, autor, añoPublicacion, isbn, disponible);
        return informacion;
    }

    //Regresa true si salio hace mas de 20 años
    public boolean esAntiguo(){
        int añoActual = LocalDate.now().getYear();
        return (añoActual - añoPublicacion) > 20;
    }
}
