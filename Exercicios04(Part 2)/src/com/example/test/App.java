package com.example.test;

import com.example.java.Livro;
import com.example.java.Operacao;

public class App {
    public static void main(String[] args) {
        Livro l1 = new Livro("Marco Antonio", "Cisco CCNA", 85.0);
        Livro l2 = new Livro("Katty Sierra", "Use a cabeça Java", 98.0);

        Operacao op1 = new Operacao("Venda", l1);
        Operacao op2 = new Operacao("Emprestimo", l2);

        l1.reajuste(6.0);
        op1.venderLivro();
        op2.emprestarLivro();

        System.out.println(op1);
        System.out.println(op2);
    }
}
