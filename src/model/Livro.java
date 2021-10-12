package model;

public class Livro {
    private int numero = 0;
    private String titulo;
    private String autor;
    private String ano;
    private StatusEnum status = StatusEnum.DISPONIVEL;
    private String nomeVizinho = "";

    public Livro() {
    }

    public Livro(int numero, String titulo, String autor, String ano) {
        this.numero = numero;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public Livro(int numero, String titulo, String autor, String ano, StatusEnum status, String nomeVizinho) {
        this.numero = numero;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.status = status;
        this.nomeVizinho = nomeVizinho;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getNomeVizinho() {
        return nomeVizinho;
    }

    public void setNomeVizinho(String nomeVizinho) {
        this.nomeVizinho = nomeVizinho;
    }

    @Override
    public String toString() {
        return "\n" +
                "Numero: " + numero +
                "," + "\n" + "Titulo: " + titulo +
                "," + "\n" + "Autor: "  + autor +
                "," + "\n" + "Ano: "  + ano +
                "," + "\n" + "Status: " + status +
                "," + "\n" + "Emprestado para: " + nomeVizinho;
    }
}
