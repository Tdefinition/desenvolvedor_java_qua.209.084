package com.input.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //declaração de variáveis
        String name;
        String email;
        int idade;
        double altura;
//instanciar  a classe Scanner  objeto que recebe os dados do usuário
Scanner sc = new Scanner(System.in);

//entrada de dados 
System.out.println("Informe seu nome: ");
name = sc.nextLine();
System.out.println("Informe sua idade: ");
idade = sc.nextInt();
System.out.println("Informe sua altura em metros: ");
altura = sc.nextDouble();

//limpeza de buffer 
sc.nextLine();

System.out.println("Informe seu e-mail: ");
email = sc.nextLine();

//saída de dados 
System.out.println("Nome: " + name);
System.out.println("Idade: " + idade);
System.out.println("Altura: "+ altura + " metros");
System.out.println("E-mail: " + email);


//fechar o objeto
sc.close();
    }
}
