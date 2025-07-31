package com.exercicio1.app;

import com.exercicio1.Java.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, Pessoa> pessoas = new HashMap<>();

        pessoas.put(123, new Pessoa("Marcos", "m@gmail.com"));
        pessoas.put(143, new Pessoa("Carla", "c@gmail.com"));
        pessoas.put(125, new Pessoa("Amarildo", "a@gmail.com"));

        for(Pessoa p : pessoas.values()) {
            System.out.println(p);
        }
    }
}
