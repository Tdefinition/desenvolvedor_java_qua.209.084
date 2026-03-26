package com.metodos.models;

public class Professor {
    public String nome;
    public String materia;

    //metodo
    public String darBoasVindas(){

        return "Olá meu nome é "+ this.nome + " e dou aula de " +this.materia+ " .";
    }
    public double areaQuadrilatero( double x , double y){ //quero retornar double entao o método é double

        return x*y;
    }
}
//em um nome de um metoto colocasse parenteses
//dentro deles coloca o argumento 


//return não é uma função então não tem parenteses para escrever a frase
//como o metodo não é vazio eu posso armazenar ele dentro de uma variável
