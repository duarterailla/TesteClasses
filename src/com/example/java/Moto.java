package com.example.java;

import java.time.LocalDate;

public class Moto extends Veiculo{
    private Integer cilindrada;

    public Moto(String modelo, LocalDate localDate, Proprietario proprietario, Integer cilindrada) {
        super(modelo, localDate, proprietario);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", Moto" +
                ", cilindrada: " + this.getCilindrada();
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    @Override
    public Double lavarVeiculo() {
        return this.valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
    }

    @Override
    public Double trocarOleo() {
        return this.valorCobrado += TipoServico.OLEO.getValorPorServico();
    }

    @Override
    public Double revisao() {
        return this.valorCobrado += TipoServico.REVISAO.getValorPorServico();
    }
}
