package com.atividade04.app;
import java.util.Scanner;
//TODO -Atividade 4
//Desenvolva um programa que crie um objeto da classe veiculo
// pode ser qualquer veiculo com os atributos :
// fabricante
//modelo
//placa
//ano
//cor
//o programa devera mostrar os dados do veiculo 
//note : veiculo não mostra dados, portanto não pode ser via metodo
//note: usuario devera informar os dados do veiculo 
public class App {
    
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      Veiculo carro = new Veiculo();


      System.out.println("Informe o fabricante do seu veículo:  ");
      carro.fabricante = sc.nextLine();
      System.out.println("Informe o modelo do seu veículo:  ");
      carro.modelo = sc.nextLine();
      System.out.println("Informe a placa do seu veículo:  ");
      carro.placa = sc.nextLine();
      System.out.println("Informe a cor do seu veículo:  ");
      carro.cor = sc.nextLine();
      System.out.println("Informe o ano do seu veículo:  ");
      carro.ano = sc.nextLine();


      System.out.println("O fabricante do seu veículo é: "+ carro.fabricante);
      System.out.println("O modelo do seu veículo é: "+ carro.modelo);
      System.out.println("A placa do seu veículo é: "+ carro.placa);
      System.out.println("O ano do seu veículo é: "+ carro.ano);
      System.out.println("A cor do seu veículo é: "+ carro.cor);


    sc.close();
    }
}
