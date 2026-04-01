package com.polimorfismo.models;

final public class PessoaFisica extends Pessoa{
    //atributos
    public String nome;
    public String cpf;
    public int idade;
    
    public PessoaFisica(String nome, String cpf, int idade, String email, String telefone) {
            super(email, telefone);
           this.nome = nome;
           this.cpf = cpf;
           this.idade = idade;
        }

    public void exibirDados(){
         //mas além disso vai ter:
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("Idade: " + idade);
        super.exibirDados();//vai ter o comportamento da superclasse 
       

    }
    
}
//posso impedir que se faça a herença de uma classe( geralmente a subclasse)
//ela poderá ser instanciada normalmente mas não poderao
//criar uma subclasse apartir dela 
// final public class PessoaFisica{}

//polimorfismo - duas classes diferentes terem o mesmo método
//porem esse msm metodo age de modo diferente em cada classe 


//o construtor tem que estar após os argumentos 