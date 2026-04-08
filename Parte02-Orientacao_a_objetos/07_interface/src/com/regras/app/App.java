package com.regras.app;
import com.regras.models.Pessoa;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa homem = new Pessoa(null, null);
        Pessoa mulher = new Pessoa(null, null);

        System.out.println("Informe o nome do Homem: ");
        homem.setNome(sc.nextLine()); 
        System.out.println("Informe o E-mail do Homem: ");
        homem.setEmail(sc.nextLine());
        System.out.println("Informe o nome da Mulher: ");
        mulher.setNome(sc.nextLine());
        System.out.println("Informe o E-mail da Mulher: ");
        mulher.setEmail(sc.nextLine());

        System.out.println(homem.apresentar());
        System.out.println(mulher.apresentar());
        System.out.println(homem.cumprimentar(mulher.getNome()));
        System.out.println(mulher.cumprimentar(homem.getNome()));
        homem.exibirDados();
        mulher.exibirDados();





        sc.close();
    }
}


//o nome do package não pode ser interface porque é uma palavra restrita nesse caso
// interface é uma espécie de cotrato
// exemplo: qnd vcs se matriculam em um curso por exemplo
//é necessario assinar um contrato com clausulas(regras que devem ser cumpridas)
// interface são entao regras que as classes devem seguir 
//se a classe nao seguir as regras de uma interface ela não vai funcionar
//mesmo que toda a sintaxe do código esteja correta