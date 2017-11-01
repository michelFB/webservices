package Livros_web_services;

public class Livro {
    
    private int ano;
    private String titulo;
    private String isbn;

    public Livro() {
    }

    public Livro(int ano, String titulo, String isbn) {
        this.ano = ano;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
