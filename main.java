class main{
public static void main(String args[]){

    //Genera 3 libros y la biblioteca

    Biblioteca biblioteca = new Biblioteca();
    Autor autor = new Autor(0000001, "William Golding", "Ninguno");
    Libro libro = new Libro("El señor de las moscas", autor ,1954,"978-0-7614-4700-9", false);
    biblioteca.agregarLibro(libro);

    autor = new Autor(0000002, "Oscar Wilde", "Ninguno");
    libro = new Libro("El Fantasma de canterville",autor,1987,"978-607-07-8480-4", false);
    biblioteca.agregarLibro(libro);

    autor = new Autor(0000003, "Akira Toriyama", "Ninguno");
    libro = new Libro("Dragon Ball",autor,1985,"4-08-851831-4", true);
    biblioteca.agregarLibro(libro);
    
    //Muestra los libros
    System.out.println("Libros en biblioteca \n");
    for (Libro libroFor: biblioteca.getLibros()) {
        autor = libroFor.getAutor();
        System.out.println("Titulo: " + libroFor.getTitulo() + "\n" +
                           "Autor: " + autor.getAutor() + "\n" +
                           "     -ID del autor: " + autor.getID() + "\n" +
                           "     -Correo Electronico: " + autor.getCorreo() + "\n" +
                           "Año de publicacion: " + libroFor.getAño()+ "\n" +
                           "ISBN: " + libroFor.getisbn() + "\n" +
                           "Disponibilidad: " + libroFor.getDisponible() + "\n");
    }

    //Busca un libro y lo muestra
    String titulo = "El Fantasma de Canterville"; //Titulo a buscar
    System.out.println("Libros con el titulo " + titulo + " encontrados: \n");
    int contador = 0;
    for (Libro libroFor: biblioteca.getLibros()) {
        autor = libroFor.getAutor();
        if (titulo.equalsIgnoreCase(libroFor.getTitulo())) {
                System.out.println("Titulo: " + libroFor.getTitulo() + "\n" +
                           "Autor: " + autor.getAutor() + "\n" +
                           "      ID del autor: " + autor.getID() + "\n" +
                           "      Correo Electronico: " + autor.getCorreo() + "\n" +
                           "Año de publicacion: " + libroFor.getAño()+ "\n" +
                           "ISBN: " + libroFor.getisbn() + "\n" +
                           "Disponibilidad: " + libroFor.getDisponible() + "\n");
                contador++;
        }    
    }
    if (contador == 0) {
        System.out.println("No hay ninguna coincidencia! \n");
    }
}

}