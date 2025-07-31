package com.exercicio2.java;

import com.exercicio2.enumAnimal.AnimalEstado;

public class Gato extends AnimalEstimacao{
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String imprimir() {
        return "Nome do gato(a): " + this.getNome() + "\nIdade: " + this.getIdade() + "\nCor: " + this.getCor()
                + "\nDisponibilidade para adoção: " + (this.getAdotado() == AnimalEstado.ADOTADO ? "Já adotado" : "Não adotado");
    }
}