package com.catraca.app;
import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        
        //declarar as variáveis
        String nome;
        double peso;
        double altura;
        
        // instanciar a classe Scanner
        Scanner sc = new Scanner(System.in);
        //entrada de dados
        System.out.println("Insira seu nome:");
        nome = sc.nextLine();
        System.out.println("Insira seu peso em kg:");
        peso = sc.nextDouble();
        System.out.println("Insira sua altura:");
        altura = sc.nextDouble();
        
        //juntar duas condicionais utilizando os operadores booleanos "&&"
        if(peso <= 120 && altura >= 1.25 ){
            System.out.println("Entrada de " + nome + " autorizada.");

        } else{ 
            System.out.println("Entrada de " + nome + " não autorizada."); 

        }


         sc.close();
        

        }

}
