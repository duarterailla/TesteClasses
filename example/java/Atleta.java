package com.example.java;

public class Atleta implements Olimpiadas {
    private String nome;
    private Double peso;
    private String modalidade;
    private Pais pais;
    private static Integer atletasParticipantes = 0;

    public Atleta(String nome, Double peso, Pais pais) {
        this.nome = nome;
        this.peso = peso;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public static Integer getAtletasParticipantes() {
        return atletasParticipantes;
    }

    public static void setAtletasParticipantes(Integer atletasParticipantes) {
        Atleta.atletasParticipantes = atletasParticipantes;
    }

    @Override
    public String verificaSituacao() {
        if(this.getPeso() >= 90.0) {
            this.setModalidade("Peso pesado");
            setAtletasParticipantes(getAtletasParticipantes() + 1);
            return "Partipará";
        } else if(this.getPeso() >= 60.0 &&  this.getPeso() < 90.0) {
            this.setModalidade("Peso médio");
            setAtletasParticipantes(getAtletasParticipantes() + 1);
            return "Partipará";
        } else {
            this.setModalidade("Inapto");
            return "Não participará";
        }
    }
}