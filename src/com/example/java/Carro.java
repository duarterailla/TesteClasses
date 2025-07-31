package com.example.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo{
    private String categoria;

    public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
        super(modelo, dataConserto, proprietario);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", Carro" +
                ", categoria: " + this.getCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public Double lavarVeiculo() {
        return this.valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
    }

    @Override
    public Double trocarOleo() {
        if(this.dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY) {
            return this.valorCobrado += (TipoServico.OLEO.getValorPorServico() - 50.0);
        } else {
            return this.valorCobrado += TipoServico.OLEO.getValorPorServico();
        }
    }

    @Override
    public Double revisao() {
        if(this.dataConserto.getMonth() == Month.AUGUST){
            return this.valorCobrado += TipoServico.REVISAO.getValorPorServico() - (TipoServico.REVISAO.getValorPorServico() * 0.1);
        } else {
            return this.valorCobrado += TipoServico.REVISAO.getValorPorServico();
        }
    }
}