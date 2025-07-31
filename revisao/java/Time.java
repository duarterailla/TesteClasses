package com.revisao.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Time {
    private String nome;
    private List<Atleta> atletas;

    public Time(String nome) {
        this.nome = nome;
        atletas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Time" +
                ", nome: " + this.getNome();
    }

    public String getNome() {
        return nome;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void adicionaAtleta(Atleta... atletas) {
        /*for (Atleta atleta : atletas){
            this.atletas.add(atleta);
        }*/

        this.atletas.addAll(Arrays.asList(atletas));
    }
}