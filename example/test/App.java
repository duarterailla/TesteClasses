package com.example.test;

import com.example.java.Atleta;
import com.example.java.Pais;

public class App {
    public static void main(String[] args) {
        Pais[] paises = {
                new Pais("Brasil"),
                new Pais("Argentina"),
                new Pais("Portugal"),
        };

        Atleta[] atletas = {
                new Atleta("Neymar da Silva Santos Junior", 59.0, paises[0]),
                new Atleta("Lionel Andrés Messi Cuccittini", 70.0, paises[1]),
                new Atleta("Cristiano Ronaldo dos Santos Aveiro", 80.0, paises[2]),
        };

        for(Atleta atleta : atletas) {
            System.out.println("O atleta " + atleta.getNome() + " " + atleta.verificaSituacao());
        }
        System.out.println("Total de atletas participantes: " + Atleta.getAtletasParticipantes());
    }
}