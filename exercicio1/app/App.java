package com.exercicio1.app;

import com.exercicio1.java.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        Cliente cliente = new Cliente();

        cliente.inserirCliente(scanner, clientes);

        for(Cliente c : clientes){
            System.out.println(c);
        }
        scanner.close();
    }
}
