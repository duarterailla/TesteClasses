package com.exercicio2.java;

public class Veiculo {
    private String marca;
    private String modelo;
    private Integer ano;

    public Veiculo(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo" +
                ", marca: " + this.getMarca() +
                ", modelo: " + this.getModelo() +
                ", ano: " + this.getAno();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }
}