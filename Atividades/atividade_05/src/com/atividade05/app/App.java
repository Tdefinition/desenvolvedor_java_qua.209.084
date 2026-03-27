package com.atividade05.app;
import java.util.Scanner;
import com.atividade05.models.*; //importa todas as classes contidads em models
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Professor prof = new Professor();


        double a = 0;
        double b = 0;
        double r = 0;
        double h = 0;
        String opc;

        System.out.println("Informe seu nome: ");
        aluno.nome = sc.nextLine();
        System.out.println("Informe e e-mail: ");
        aluno.email = sc.nextLine();
        System.out.println("Informe sua idade: ");
        aluno.idade = sc.nextInt();
        
        prof.nome = "Alex Machado";
        prof.matricula = "12345";

        //imprimir o nome e a matricula do professor no programa é opcional

        System.out.println("Nome do aluno: "+ aluno.nome);
        System.out.println("E-mail do aluno: "+ aluno.email);
        System.out.println("Idade do aluno: "+ aluno.idade + "anos.");

        System.out.println("Escolha a operação desejada: ");
        System.out.println(" 1 - Calcular a área do triângulo");
        System.out.println(" 2 - Calcular a área do circulo");
        System.out.println(" 3 - Calcular a equação do 1° grau");
        sc.nextLine();
        opc = sc.nextLine();

        switch(opc){

            case"1":
            System.out.println("Informe o valor da base:  ");
            b = sc.nextDouble();
            System.out.println("Informe o valor da altura:  ");
            h = sc.nextDouble();
            System.out.println("O valor da área da base é: " + prof.areaDoTriangulo(b, h));

            break;
            case("2"):
            System.out.println("Informe o valor do raio:  ");
            r = sc.nextDouble();
            System.out.println("O valor da área do círculo é: " + prof.areaDoCirculo(r));
           
            break;

            case "3": 
             //valor de a não pode ser zero
             System.out.println("Informe o valor de a: ");
             a = sc.nextDouble();
             System.out.println("Informe o valor de b: ");
             b = sc.nextDouble();
             
            System.out.println((a != 0) ? "A raiz da equação do 1° grau é : " +
            prof.equaçãoLinear(a, b) : "Coeficiente a não pode ser 0" );
            break; 

            default : 
            System.out.println("Operação inválida");
        }
        sc.close();
        
    }
}
