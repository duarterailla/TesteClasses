package com.exercicio2.app;

import com.exercicio2.java.Cachorro;
import com.exercicio2.java.Gato;
import com.exercicio2.java.Loja;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cachorro[] cachorros = {
                new Cachorro("Malhadinha", 9, "Vira lata"),
                new Cachorro("Rocky", 8, "Buldogue Frances"),
        };

        Gato[] gatos = {
                new Gato("Pandora", 1, "Branco, Preto e Laranja"),
        };

        Loja loja = new Loja("Serratec Pets");

        for (Cachorro cachorro : cachorros) {
            loja.adicionarAnimal(cachorro);
        }
        for (Gato gato : gatos) {
            loja.adicionarAnimal(gato);
        }

        boolean loop = true;
        do{
            menu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    loja.listarAnimais();
                    break;
                case 2:
                    loja.adicionarAnimal(scanner);
                    break;
                case 3:
                    loja.adotarAnimal(loja.getAnimais(), scanner);
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    loop = false;
                    break;
                default:
                    System.out.println("Insira um valor valido!");
                    break;
            }
        }while(loop);
        scanner.close();
    }

    static void menu(){
        System.out.print("---------- Adoção de animais Serratec ----------\n1 -> Listar os animais para adoção \n2 -> Adicionar um animal para adoção " +
                "\n3 -> Adotar um animal \n4 -> Encerrar adoção \nQual opção deseja: ");
    }
}