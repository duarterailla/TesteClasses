package com.exercicio1.java;

import java.util.List;
import java.util.Scanner;

public class Cliente {
    private Integer id;
    private String nome;
    private Integer idade;
    private String telefone;

    @Override
    public String toString() {
        return "Cliente" +
                ", id: " + this.getId() +
                ", nome: " + this.getNome() +
                ", idade: " + this.getIdade() +
                ", telefone: " + this.getTelefone();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void inserirCliente(Scanner scanner, List<Cliente> clientes) {
        int id;
        do{
            System.out.print("Digite o id do cliente: ");
            id = scanner.nextInt();

            if(id <= 0){
                break;
            }

            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.next();

            System.out.print("Digite a idade: ");
            Integer idade = scanner.nextInt();

            System.out.print("Digite o telefone do cliente: ");
            String telefone = scanner.next();

            Cliente cliente = new Cliente();
            cliente.setId(id);
            cliente.setNome(nome);
            cliente.setIdade(idade);
            cliente.setTelefone(telefone);

            clientes.add(cliente);
        }while(id > 0);
    }
}
