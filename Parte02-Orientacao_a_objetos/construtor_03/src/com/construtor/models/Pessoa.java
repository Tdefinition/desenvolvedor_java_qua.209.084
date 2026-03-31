package com.construtor.models;

public class Pessoa {

    public String nome;
    public String email;
    public String telefone;
    public String cpf;
    public int idade;
    public double altura;


    public Pessoa() {
    }
//criar dois cond=strutores permite criar pessoas de diferentes formas
//uma sem argumento 
//e outra com duas 

    public Pessoa(String nome, String email, String telefone, String cpf, int idade, double altura) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;

    }

    





}
// toda pasta precisa ter um construtor , ele é um método especifico
//que só faz uma coisa: constroi o objeto 
