public final class Autor{
    //hOLA
    private int id;
    private String autor;
    private String correoElectronico;

    public Autor(int ID, String correoElectronico, String autor){
        setID(ID);
        setAutor(autor);
        setCorreo(correoElectronico);
    }

    //Inserta la ID
    public void setID(int id){
        this.id = id;
    }
    //Regresa la ID
    public int getID(){
        return id;
    }

    //Inserta el Autor
    public void setAutor(String autor){
        this.autor = autor;
    }
    //Regresa el Autor
    public String getAutor(){
        return autor;
    }

    //Inserta el correo
    public void setCorreo(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    //Regresa el Correo
    public String getCorreo(){
        return correoElectronico;
    }
}