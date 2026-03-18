package com.ternario.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // declarar instancia
       String nome;
       String result;
       int idade;

       //imstanciar a classe

       Scanner sc = new Scanner(System.in);//eu posso declarar a instancia antes das variaveis, não faz diferença
    //entrada de dados
    System.out.println("Informe seu nome: ");
    nome = sc.nextLine();
    System.out.println("Informe sua idade: ");
    idade = sc.nextInt();

     //como usar um operador ternario

     result= (idade >= 18 ) ? " é maior de idade" : " não é maior de idade ";  //atribuir uma 

     //saida de dados
     System.out.println( nome + result);
    
       //fechar objeto Scanner
       sc.close(); 
    }
}
// o que é um operador ternario? 
//é uma forma simplificada de if else
// substitui o if else me todos os casos? Sim, mas tem casos que vale mais a pena usar o if else
//se o if else for simples/ com poucas linhas compensa trocar ele pelo ternario 