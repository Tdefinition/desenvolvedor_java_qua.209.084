package com.atividade07.models;
//ou nome fantasia, razão social, email e cnpj(classe PessoaJuridica)
final public class PessoaJuridica extends Pessoa {

    private String nomeFantasia; 
    private String razaoSocial;
    private String cnpj;

 public String PessoaJuridica(String email, String nomeFantasia, String razaoSocial, String cnpj){
    super (email);
    this.nomeFantasia = nomeFantasia;
    this.razaoSocial = razaoSocial;
    this.cnpj = cnpj;

 }


}
