package com.metodos.app;
import com.metodos.models.*; ///o * serve para utilizar todas as classes, nesse caso tanto o Professor qnt Aluno
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Professor prof = new Professor();
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        double x;
        double y;

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println(aluno.apresentar()); 

        prof.nome = "Alex Machado";
        prof.materia = "Matemática";
       
        System.out.println( prof.darBoasVindas());

        System.out.println("Informe o valor da base: ");
        x = sc.nextDouble();
        System.out.println("Informe o valor da altura: ");
        y = sc.nextDouble();

        System.out.println("A área do quadrilatero é "+ prof.areaQuadrilatero(x, y));

        sc.close();

       
    }
}
