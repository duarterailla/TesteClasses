package com.exercicio2.java;

import com.exercicio2.enumAnimal.AnimalEstado;

public abstract class AnimalEstimacao implements Animal{
    private String nome;
    private Integer idade;
    private AnimalEstado adotado;

    public AnimalEstimacao(String nome, Integer idade) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.adotado = AnimalEstado.AGUARDANDO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public AnimalEstado getAdotado() {
        return adotado;
    }

    public void setAdotado(AnimalEstado estado) {
        this.adotado = estado;
    }
}