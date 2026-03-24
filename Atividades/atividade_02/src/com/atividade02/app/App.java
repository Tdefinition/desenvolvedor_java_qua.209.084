package com.atividade02.app;
//crie um projeto que receba o do usuario o nome e a idade uma unica 
// durante todo o programa. Depois exiba uma lista de filmes:
// sala 1 - filme 1 - livre 
//sala 2 - filme 2 - 12 anos 
//sala 3 - filme 3 - 14 anos
// sala 4 - filme 4- 16 anos
// sala 5 - filme 5 - 18 anos
//O usuario deve escolhe o filme desejado. 
//SE tiver a idade minima paara ver o filme desejado o ingresso é impresso 
// se não tiver a idade min bloqueia a entrada e re-exibe a lista de filmes
//para o usuario escolher outro filme
// o programa só se encerra quando o usuário escolher um filme permitido 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nome;
        int age;
        int opc;
        int clas = 0;

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe sua idade: ");
        age = sc.nextInt();

    do {
        sc.nextLine();
        System.out.println("Filmes disponíveis");
        System.out.println("Sala: 1- A roda quadrada - Livre");
        System.out.println("Sala: 2 A volta dos que não foram - 12 anos");
        System.out.println("Sala: 3- Poeira em alto mar - 14 anos");
        System.out.println("Sala: 4- As tranças do reis careca - 16 anos");
        System.out.println("Sala: 5- A vingança do peixe frito - 18 anos");
        opc = sc.nextInt();

    switch(opc){

    case 1: clas = 0;
    break;
    
    case 2: clas = 12;
    break;

    case 3: clas = 14;
    break;

    case 4: clas = 16;
    break;

    case 5: clas = 18;
    break;

    default: clas = 1000;
    System.out.println("Operação inválida");
            
    }

    if(opc>0 && opc<5){
        if( age>=clas){
             System.out.println("Retire o seu ingresso!");
        }else {
            System.out.println("Idade não suficiente. Por favor, escolha outro filme.");
        }
        
    } else{
        System.out.println("Tente novamente");
    }
    }while(clas> age);

        sc.close();
    }
}//digita o nome idade
//do{ repetir a lista de filmes e } while{}
