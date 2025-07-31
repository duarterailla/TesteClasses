package com.exercicio2.java;

import com.exercicio2.enumAnimal.AnimalEstado;

public class Cachorro extends AnimalEstimacao{
    private String raca;

    public Cachorro(String nome, Integer idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String imprimir() {
        return "Nome do cão: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nRaça: " + this.getRaca()
                + "\nDisponibilidade para adoção: " + (this.getAdotado() == AnimalEstado.ADOTADO ? "Já adotado" : "Não adotado");
    }
}