package com.revisao.java;

public class Atleta {
    private String nome;
    private Double altura;

    public Atleta(String nome, Double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Atleta" +
                ", nome: " + this.getNome() +
                ", altura: " + this.getAltura() + " metros";
    }

    public String getNome() {
        return nome;
    }

    public Double getAltura() {
        return altura;
    }
}