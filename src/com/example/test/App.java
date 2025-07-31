package com.example.test;

import com.example.exception.BibliotecaException;
import com.example.java.Biblioteca;
import com.example.java.Livro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        Livro l1 = new Livro("Programação em Java", "Roni Schanuel", 100.0);
        Livro l2 = new Livro("Programação em Python", "Arthur Giangiarulo", 130.0);
        Livro l3 = new Livro("Programação em JavaScript", "B7Web", 80.0);

        List<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        biblioteca.adicionarLivro(livros);

        boolean loop = true;

        do {
            try {
                menu();
                int opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        biblioteca.listarLivros();
                        break;
                    case 2:
                        biblioteca.adicionarLivro(sc);
                        break;
                    case 3:
                        System.out.println("Valor medio encontrado nessa faixa: R$" + biblioteca.pesquisarFaixaDePreco(sc) + "\n");
                        break;
                    case 4:
                        System.out.println("\nValor total em livros: R$" + biblioteca.calcularTotalLivros() + "\n");
                        break;
                    case 5:
                        loop = false;
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("\nInsira uma opção válida no menu. Tente novamente!\n");
                        break;
                }
            } catch (BibliotecaException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Certifique-se de inserir um número.");
                e.printStackTrace();
            }
        } while (loop);
    }

    static void menu(){
        System.out.print("----- Seja bem vindo a biblioteca Serratec! ----- \nSelecione uma das opções abaixo para prosseguir." +
                "\n1 -> Listar livros \n2 -> Adicionar um novo livro \n3 -> Pesquisar faixa de preços \n4 -> Calcular valor (R$) em livros" +
                "\n5 -> Encerrar sistema da biblioteca \nDigite a opção desejada: ");
    }
}