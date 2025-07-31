package com.example.java;

public class Operacao implements Livraria {
    private String tipo;
    private Double valorOperacao;
    private Livro livro;

    public Operacao(String tipo, Livro livro) {
        this.tipo = tipo;
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.getTipo() + ", Valor: " + String.format("%.3f" ,this.getValorOperacao()) +
                ", Autor: " + this.livro.getAutor() + ", Titulo: " + this.livro.getTitulo();
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValorOperacao() {
        return valorOperacao;
    }

    public void venderLivro(){
        this.livro.valor += (this.livro.valor*0.09);
        this.valorOperacao = this.livro.valor;
    }

    public void emprestarLivro(){
        this.livro.setValor((this.livro.getValor() * 0.02) + TAXAEMPRESTIMO);
        this.valorOperacao = this.livro.valor;
    }
}
