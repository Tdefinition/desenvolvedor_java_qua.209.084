package com.heranca.app;
import java.util.Scanner;


import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

//Dados da empresa 
empresa.razaoSocial = "Alex SA";
empresa.nomeFantasia = "Kids Graça Eventos Infantis ";
empresa.cnpj = "51.438.99/0001-96";
empresa.email = "kisgraca@contato.com";
empresa.telefone = "(61) 98765-4321";
empresa.endereco = "Campo da Esperança";
empresa.website = "kidsGraça.com";
//dados do usuario

System.out.println("DADOS DO USUÁRIO");
System.out.println("Informe o nome do usuário: ");
usuario.nome = sc.nextLine();
System.out.println("Informe o CPF do usuário: ");
usuario.cpf = sc.nextLine();
System.out.println("Informe o e-mail do usuário: ");
usuario.email = sc.nextLine();
System.out.println("Informe o telefone do usuário: ");
usuario.telefone = sc.nextLine();
System.out.println("Informe o endereço do usuário: ");
usuario.endereco = sc.nextLine();
System.out.println("Informe a idade do usuário: ");
usuario.idade = sc.nextInt();

//saída de Dados 
System.out.println(usuario.apresentar());
System.out.println(empresa.recepcionar(usuario.nome));
sc.close();
       
    }
}
//porgrama onde iremos instanciar dois objetos diferentes
//cada um de uma classe diferente 
//um objeto representa um usuario
//o outro representa pela empresa

//a super classe deve ter somente atributos e mátodos que tem nas duas classe 