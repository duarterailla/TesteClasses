package com.example.java;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
    protected String modelo;
    protected Double valorCobrado = 0.0;
    protected LocalDate dataConserto;
    protected Proprietario proprietario;

    public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
        super();
        this.modelo = modelo;
        this.dataConserto = dataConserto;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Veiculo" +
                ", modelo: " + this.getModelo() +
                ", valorCobrado: R$" + this.getValorCobrado() +
                ", dataConserto: " + this.getDataConserto() + proprietario;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getValorCobrado() {
        return valorCobrado;
    }

    public LocalDate getDataConserto() {
        return dataConserto;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }
}
