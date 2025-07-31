package com.revisao.app;

import com.revisao.java.Atleta;
import com.revisao.java.Time;

public class App {
    public static void main(String[] args) {
        Atleta a1 = new Atleta("Elton Kasesky", 1.80);
        Atleta a2 = new Atleta("Jean Carlos", 1.78);
        Atleta a3 = new Atleta("Ana Julia", 1.62);

        Time time = new Time("Flamengo");

        time.adicionaAtleta(a1, a2, a3);

        for(Atleta atleta : time.getAtletas()) {
            System.out.println(atleta);
        }
    }
}