package com.exercicio2.java;

import com.exercicio2.enumAnimal.AnimalEstado;
import com.exercicio2.exception.AnimalException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Loja {
    private String nomeLoja;
    List<AnimalEstimacao> animais = new ArrayList<>();

    public Loja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public List<AnimalEstimacao> getAnimais() {
        return animais;
    }

    public void adicionarAnimal(AnimalEstimacao... animal) {
        this.animais.addAll(Arrays.asList(animal));
    }

    public void adicionarAnimal(Scanner scanner) {
        System.out.print("O animal a ser registrado na loja é um cão ou um gato?\n1 -> Cão \n2 -> Gato \nDigite o número correspondente: ");
        int opcao = scanner.nextInt();

        System.out.print("Qual o nome: ");
        String nome = scanner.next();

        System.out.print("Qual a idade: ");
        Integer idade = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Qual a raça do cão: ");
                String raca = scanner.next();

                this.animais.add(new Cachorro(nome, idade, raca));
                break;
            case 2:
                System.out.print("Qual a cor do gato: ");
                String cor = scanner.next();

                this.animais.add(new Gato(nome, idade, cor));
                break;
            default:
                System.out.print("Por favor selecione registrador um cão ou um gato");
                break;
        }
    }

    public void listarAnimais(){
        int idAnimal = 1;
        for(AnimalEstimacao animal : animais){
            System.out.println("Identificação do animal: " + idAnimal);
            System.out.println(animal.imprimir() + "\n");
            idAnimal++;
        }
    }

    public void adotarAnimal(List<AnimalEstimacao> animais, Scanner scanner) {
        System.out.print("Qual o número referente ao animal que deseja adotar? (Antes do nome na opção listar)\nInsira o número: ");
        int i = scanner.nextInt() - 1;

        if (i < 0 || i >= animais.size()) {
            throw new AnimalException("Animal não encontrado. Número inválido.");
        }

        AnimalEstimacao animal = animais.get(i);

        if (animal.getAdotado() == AnimalEstado.ADOTADO) {
            throw new AnimalException("Esse animal já foi adotado.");
        }

        animal.setAdotado(AnimalEstado.ADOTADO);
        System.out.println("Parabéns! Você adotou o(a) " + animal.getNome() + " com sucesso!");
    }
}