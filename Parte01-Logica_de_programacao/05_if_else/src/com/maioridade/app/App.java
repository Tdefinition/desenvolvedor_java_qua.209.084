package com.maioridade.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //declaração de variaveis
      String nome;
      int idade; 
      //instancia a classe Scanner
      Scanner sc = new Scanner(System.in);
      // input
      System.out.println("Informe seu nome:");
      nome = sc.nextLine();
    
      System.out.println("Informe sua idade:");
      idade = sc.nextInt();

      //verificar idade 
      if (idade >= 18){
        System.out.println("É maior de idade!");
      } 
      else{
        System.out.println("É menor de idade!");
      }
    //fecha objeto
    sc.close();

    }
    
}
