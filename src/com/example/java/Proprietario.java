package com.example.java;

public class Proprietario {
    private String nome;

    public Proprietario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return " Proprietario" + ", nome: " + this.getNome();
    }

    public String getNome() {
        return nome;
    }
}