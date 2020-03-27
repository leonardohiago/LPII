package model;

public class Livro {

    private String titulo;
    private String isbn;

    public Livro (String t, String i) {
        this.titulo = t;
        this.isbn = i;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitulo() {
        this.titulo = titulo;
    }

    public void setIsbn() {
        this.isbn = isbn;
    }

    public String toString(){
        return "\nTítulo: " + this.titulo +"\nISBN: " + this.isbn + "\n";
    }
}
