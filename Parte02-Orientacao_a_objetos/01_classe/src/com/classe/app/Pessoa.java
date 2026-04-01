package com.classe.app;

public class Pessoa {
    //definem as caracteristicas 
    //assim como nas variaveis voce tem que definir o tipo
    //diferente da variaveis você 
    //atributos
    public String nome;
    public String email; 
    public int idade;
    public double altura;

    //método são ações
public void cumprimentar(){
    System.out.println("Olé, boa noite!");

    }
public void apresentar(){
    System.out.println("Meu nome é: "+ this.nome);
    System.out.println(" meu e-mail é: " + this.email);
    System.out.println("tenho" + this.idade + "anos");
    System.out.println("e tenho" + this.altura+ " metros de altura." );
}
}
//essa classe não roda no programa, ela serve pra ajudar no java.app

