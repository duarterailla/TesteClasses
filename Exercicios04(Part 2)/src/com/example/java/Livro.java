package com.example.java;

public class Livro {
    private String autor;
    private String titulo;
    protected Double valor;

    public Livro(String autor, String titulo, Double valor) {
        this.autor = autor;
        this.titulo = titulo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return " Livro" +
                ", autor: " + this.getAutor() +
                ", titulo: " + this.getTitulo() +
                ", valor: " + this.getValor();
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public void reajuste(Double reajuste){
        this.valor += valor * (reajuste/100);
    }
}
