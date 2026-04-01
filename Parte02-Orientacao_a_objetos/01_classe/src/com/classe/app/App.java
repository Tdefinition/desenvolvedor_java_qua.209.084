package com.classe.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        //instanciar uma classe é criar um objeto 
        Pessoa person = new Pessoa();
        //eu posso dar o nome do objeto igual ao da clase mas a primeira letra não pode ser maiuscula
        Scanner sc = new Scanner(System.in);
        //entrada de dados
        System.out.println("Informe o nome da pessoa: ");
        person.nome = sc.nextLine();
        System.out.println("Informe o email da pessoa: ");
        person.email = sc.nextLine();
        System.out.println("informe a idade da pessoa: ");
        person.idade = sc.nextInt();
        System.out.println("Informe a altura da pessoa: ");
        person.altura = sc.nextDouble();
    ;
        //defina os valores dos atributos
       

       person.cumprimentar();
       person.apresentar();

        sc.close();
    }
}
//construtor- responsavel por fazer o objeto "nascer " dentro do programa

