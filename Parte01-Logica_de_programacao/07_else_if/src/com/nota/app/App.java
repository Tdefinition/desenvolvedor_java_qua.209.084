package com.nota.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // declaração de variável
       String  nome ;
       double  nota;

       //declarar instancia
       Scanner sc = new Scanner(System.in);

      // entrada de dados
      
      System.out.println("Informe o nome do aluno:");
      nome = sc.nextLine();
      System.out.println("Informe a nota entre 0 a 10:");
      nota = sc.nextDouble();

      //verificar se a nota é valida ( se não é negativa)
      if(nota >= 0 && nota <= 10 ) {
        
        if( nota >= 7){
            System.out.println( nome + " está aprovado.");

        } else if ( nota >= 5 ) {
            System.out.println( nome+ " está de recuperação.");
        } else{
            System.out.println( nome+ " está reprovado."); 
        }

      } else{
        System.out.println("Nota inválida");
      }

       
       //fecha objeto Scanner
    
       sc.close();
    }
}
