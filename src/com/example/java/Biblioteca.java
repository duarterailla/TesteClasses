package com.example.java;

import com.example.exception.BibliotecaException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private String responsavel;
    private List<Livro> listaLivros = new ArrayList<Livro>();

    public String getResponsavel() {
        return responsavel;
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void adicionarLivro(List<Livro> livros){
        if(livros == null){
            throw new BibliotecaException("Para adicionar um novo livro, não pode ser inserido um valor nulo!");
        } else {
            this.listaLivros.addAll(livros);
        }
    }

    public void adicionarLivro(Scanner scanner) {
        try {
            System.out.print("Insira o título do livro: ");
            String titulo = scanner.next();

            System.out.print("Insira o autor do livro: ");
            String autor = scanner.next();

            System.out.print("Insira o preço do livro: ");
            double preco = scanner.nextDouble();

            if (titulo.isEmpty() || autor.isEmpty() || preco <= 0) {
                throw new BibliotecaException("Impossível inserir um livro novo. Existem valores inválidos!");
            }

            this.listaLivros.add(new Livro(titulo, autor, preco));
            System.out.println("Livro adicionado com sucesso!\n");
        } catch (BibliotecaException e) {
            throw new BibliotecaException("Erro na entrada de dados. Certifique-se de digitar os valores corretos!");
        }
    }

    public void listarLivros(){
        System.out.println("\n----- Livros disponiveis na biblioteca Serratec -----");
        for(Livro livro : this.listaLivros){
            System.out.println(livro);
        }
        System.out.print("\n");
    }

    public Integer pesquisarFaixaDePreco(Scanner scanner){
        System.out.println("Insira o valor inicial para o filtro de faixa de preço");
        Double valorInicial = scanner.nextDouble();

        System.out.println("Insira o valor final para o filtro de faixa de preço");
        Double valorFinal = scanner.nextDouble();

        if(valorInicial > valorFinal){
            throw new BibliotecaException("O valor inicial não pode ser maior que o valor final!");
        } else if (valorInicial < 0 || valorFinal < 0){
            throw new BibliotecaException("O valor deve ser um número valido, não é permitido valores negativos!");
        } else if (valorInicial.equals(valorFinal)){
            throw new BibliotecaException("Insira valores diferentes para o calculo da faixa de preço!");
        } else if (valorFinal.equals(0)){
            throw new BibliotecaException("O valor final deve ser maior que 0, para o calculo da faixa de preço");
        }

        Integer resultado = 0;
        Integer cont = 0;
        for(Livro livro : this.listaLivros){
            if(livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal){
                resultado += livro.getPreco().intValue();
                cont++;
            }
        }
        return resultado / cont;
    }

    public Double calcularTotalLivros(){
        Double total = 0.0;

        for(Livro livro : this.listaLivros){
            total += livro.getPreco();
        }

        return total;
    }
}