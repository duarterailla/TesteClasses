package com.exercicio2.app;

import com.exercicio2.java.Veiculo;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Veiculo> veiculos = new HashMap<>();

        try {
            boolean loop = true;
            do{
                menu();
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        adicionarVeiculo(veiculos, scanner);
                        break;
                    case 2:
                        buscarPlaca(veiculos, scanner);
                        break;
                    case 3:
                        System.out.println("Encerrando...");
                        loop = false;
                        break;
                    default:
                        System.out.println("Insira um valor válido. Digite novamente!");
                        break;
                }
            } while(loop);
        } catch(InputMismatchException e){
            System.out.println("Foi inserido um valor invalido!");
            e.printStackTrace();
        }
    }

    static void menu(){
        System.out.print("----- Detran -----\n1 -> Adicionar um veiculo \n2 -> Buscar carro pela placa \n3 -> Encerrar a aplicação" +
                "\nQual opção deseja: ");
    }

    static void adicionarVeiculo(Map<String, Veiculo> veiculos,Scanner scanner){
        System.out.print("Digite o marca do veiculo: ");
        String marca = scanner.next();

        System.out.print("Digite o modelo do veiculo: ");
        String modelo = scanner.next();

        System.out.print("Digite o ano do veiculo: ");
        int ano = scanner.nextInt();

        System.out.print("Digite a placa do veiculo: ");
        String placa = scanner.next();

        veiculos.put(placa, new Veiculo(marca, modelo, ano));
    }

    static void buscarPlaca(Map<String, Veiculo> veiculos,Scanner scanner){
        System.out.print("Digite a placa do veiculo para busca: ");
        String busca = scanner.next();

        if(veiculos.containsKey(busca)) {
            System.out.println("\nVeiculo encontrado! \nDados: " + veiculos + "\n");
        } else {
            System.out.println("\nVeiculo não encontrado!\n");
        }
    }
}