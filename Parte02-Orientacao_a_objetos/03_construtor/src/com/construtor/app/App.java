package com.construtor.app;

import java.util.Scanner;

import com.construtor.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Pessoa usuario = new Pessoa(
            null,
            null,
            null,
            null,
            0,
            0

        );
        System.out.println("Informe seu nome: ");
        usuario.nome = sc.nextLine();
        System.out.println("Informe seu email: ");
        usuario.email = sc.nextLine();
        System.out.println("Informe seu telefone: ");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe seu cpf: ");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe sua idade: ");
        usuario.idade = sc.nextInt();
        System.out.println("Informe sua altura em metros: ");
        usuario.altura = sc.nextDouble();

        
        sc.close();
        
    }
}
