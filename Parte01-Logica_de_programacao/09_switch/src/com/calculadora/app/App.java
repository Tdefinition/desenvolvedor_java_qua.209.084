//switch case (escolha caso) vai receber uma variavel e verificar se é um valor
//especifico. Se sim ele retorna um valor especifo , caso não ele retorna outro valor
package com.calculadora.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instanciar a classe 
        Scanner sc = new Scanner(System.in);

        //declarar as variáveis 

        double num1;
        double num2;
        double result;
        String operador;

        System.out.println("Informe o primeiro numero: ");
        num1 = sc.nextDouble();
        System.out.println("Informe o segundo numero: ");
        num2 = sc.nextDouble();

        //limpeza de buffer 
        sc.nextLine();
        
        System.out.println("Informe a operção desejada: ");
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multplicação");
        System.out.println("4 - divisão");
        operador = sc.nextLine();

switch ( operador){
    //dois pontos inicia um bloco de um case
    case "1": 
        result = num1 + num2;
        System.out.println("O valor da soma é: "+ result);
        break;
//para quebrar o case utilizase o comando break ( é obrigadorio para todos os cases)
    case "2": 
        result = num1 - num2;
        System.out.println("O valor da subtração é: " + result);
        break;
    case "3":
        result = num1*num2;
        System.out.println("O valor da multiplicação é: " + result);
        break;
    case "4":
        result = num1/num2;
        System.out.println("O valor da divisão é: " + result);


    default: System.out.println("Operação inválida");
}
//fechar a classe
        sc.close();
    }
}
//se eu tenho uma leitura de uma variavel primitiva antes da leitura de string 
//eu preciso limpar o buffer- como a operação sc.nextLine();
