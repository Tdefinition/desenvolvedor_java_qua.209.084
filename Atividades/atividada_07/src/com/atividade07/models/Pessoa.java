package com.atividade07.models;
//deverá informar o:
//nome, email e cpf(classe PessoaFisica), 
//ou nome fantasia, razão social, email e cnpj(classe PessoaJuridica)
public class Pessoa {
//argumento em comum para todas as classes
    private String email;

    //construtor
public Pessoa(String email){
    this.email= email;
  
    }
      //getter and setter

    public String getEmail(){
        return this.email;
    }

    public void setEmail(){
        this.email = email;
    }

}
