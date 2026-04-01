package com.polimorfismo.models;

abstract public class Pessoa {

 public String email;
 public String telefone;

//construtor 
    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }
//metodo
public void exibirDados(){

 System.out.println("E-mail: "+ this.email);
 System.out.println("Telefone: "+ this.telefone);
}
}
// além do objeto scabber
//vou ter um objeto envolvendo a pessoa 

//consigo instanciar a subclasse e a superclasse no mesmo programa mas isso não é recomendado
//abstração é basicamente dizer o programa o que vai ter e o que não vai
//abstração no objeto é basicamete impedir instanciar certas classes 
//pro programa será como se as classes nao existissem
// abstract public class Pessoa{}
//isso fará que a classe não seja instanciada

