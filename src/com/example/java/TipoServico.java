package com.example.java;

public enum TipoServico {
    OLEO(100.0), LAVAGEM(50.0), REVISAO(200.0);

    private Double valorPorServico;

    TipoServico(Double valorPorServico) {
        this.valorPorServico = valorPorServico;
    }

    public Double getValorPorServico() {
        return valorPorServico;
    }
}
