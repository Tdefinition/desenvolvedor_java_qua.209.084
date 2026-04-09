package com.composicao.app;
import com.composicao.models.*;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Pessoa motorista = new Pessoa(null, null, null, null,null);

        Veiculo carro = new Veiculo(null, null, null, null, null, null, motorista);
        
//entrada de dados do motorista

System.out.println("Informe o  nome do motorista: ");
motorista.setNome(sc.nextLine());
System.out.println("Informe o CPF do motorista: ");
motorista.setCpf(sc.nextLine());
System.out.println("Informe o telefone do motorista: ");
motorista.setTelefone(sc.nextLine());
System.out.println("Informe o E-mail do motorista: ");
motorista.setEmail(sc.nextLine());
System.out.println("Informe a CNH do motorista: ");
motorista.setCnh(sc.nextLine());

System.out.println("Informe a fabricante do carro: ");
carro.setFabricante(sc.nextLine());
System.out.println("Informe o modelo do carro: ");
carro.setModelo(sc.nextLine());
System.out.println("Informe a cor do carro: ");
carro.setCor(sc.nextLine());
System.out.println("Informe o ano do carro: ");
carro.setAno(sc.nextLine());
System.out.println("Informe a placa do carro: ");
carro.setPlaca(sc.nextLine());
System.out.println("Informe o renavam do carro: ");
carro.setRenavan(sc.nextLine());

//como vou saber se esse veiculo é desse motorista?
//associar o carro ao motorista:

carro.setMotorista(motorista);
//associa o carro cadastrado ao motorista cadastrado
 //informando os dados do carro

 System.out.println("Fabricante do carro: "+ carro.getFabricante());
 System.out.println("Modelo do carro: "+ carro.getModelo());
 System.out.println("Cor do carro: "+ carro.getCor());
 System.out.println("Ano do carro: "+ carro.getAno());
 System.out.println("Placa do carro: "+ carro.getPlaca());
 System.out.println("Renavan do carro: "+ carro.getRenavan());
 System.out.println("Nome do motorista do carro: "+ carro.getMotorista().getNome());
 System.out.println("CPF do motorista do carro: "+ carro.getMotorista().getCpf());
 System.out.println("Telefone do motorista do carro: "+ carro.getMotorista().getTelefone());
 System.out.println("E-mail do motorista do carro: "+ carro.getMotorista().getEmail());
System.out.println("CNH do motorista do carro: "+ carro.getMotorista().getCnh());



 
    sc.close();
    }
}

//relacionar classes não ´e a msm coisa que herança 
//diferença entre as atividades passadas é que 
//relacionamento de um pra muitos
//um objeto tem varios atributos
//e o carro alem dos outros atributos tem um motorista
//que é um objeto que atua como atributo na classe veiculo

//Primeiramente, a composição é um conceito que envolve
// a criação de objetos através da combinação de outros objetos.
//  Em outras palavras, é a prática de construir classes utilizando instâncias de 
// outras classes como componentes. 
// Um bom exemplo é uma classe "Carro" que possui um atributo 
// que é do tipo "Motor" e 
// esse motor por si só tem diversas funcionalidades e comportamentos

//https://blog.formacao.dev/composicao-no-java-o-que-e-e-como-funciona/