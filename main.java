class main{
public static void main(String args[]){
    //Genera 3 libros y la biblioteca
    Libro libro1 = new Libro("El señor de las moscas","William Golding",1954,"978-0-7614-4700-9");
    Libro libro2 = new Libro("El Fantasma de canterville","Oscar Wilde",1987,"978-607-07-8480-4");
    Libro libro3 = new Libro("Dragon Ball","Akira Toriyama",1985,"4-08-851831-4");
    Biblioteca biblioteca = new Biblioteca();
    //Agrega los libros a biblioteca y los muestra
    biblioteca.agregarLibro(libro1);
    biblioteca.agregarLibro(libro2);
    biblioteca.agregarLibro(libro3);
    biblioteca.mostrarLibros();
    //Busca un libro y lo muestra
    biblioteca.buscarLibroporLibro("El Fantasma de canterville");
}

}