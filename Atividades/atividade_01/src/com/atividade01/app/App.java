package com.atividade01.app;
 import java.util.Scanner;

public class App {
   //crie um programa que receba do usuário : nome , peso e altura
   //e exiba na tela do seu pc o valor de seu IMC e seu diagnóstico
   // calculo do imc : peso/ (altura * altura)
   //diagnostico : menor que 18.5 = abaixo do peso 
   // imc entre 18.5 e 25 = apesp ideal
   // imc entre 25 e 30 = aima do peso
   // imc entre 30 e 35: obeso
   //imc entre 35 e 40: obesidade nivel 2
   // imc acima de 40 : obesidade morbida 

    public static void main(String[] args) throws Exception {
        // declarar a variavel
    String nome;
    double altura;
    double peso;
    double imc;
   //  instanciar a classe 

     Scanner sc = new Scanner(System.in);

//entrada de dados

    System.out.println("Informe seu nome: ");
    nome = sc.nextLine();
    System.out.println("Informe seu peso: ");
    peso = sc.nextDouble();
    System.out.println("Informe sua altura: ");
    altura = sc.nextDouble();

    imc = peso/(altura*altura);

    if(imc >= 18.5){
        if(imc< 25){
            System.out.println( nome + " está com o peso ideal.");
        }else if(imc < 30 ){
            System.out.println(nome + " está acima do peso.");
        }else if ( imc <35 ){
            System.out.println(nome + " está obeso.");
        } else if ( imc < 40){
         System.out.println(nome+ " está com obesidade tipo 2");
        } else{ 
            System.out.println(nome + " está com obesidade morbida");
        }

    }else{
        System.out.println(nome + " está abaixo do peso");
    
    }

     sc.close();
 
    }
}
