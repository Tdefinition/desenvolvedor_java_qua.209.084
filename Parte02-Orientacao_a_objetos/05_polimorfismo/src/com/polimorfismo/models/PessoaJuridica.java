package com.polimorfismo.models;

final public class PessoaJuridica extends Pessoa {
    public String nomeFantasia;
    public String cnpj;




    public PessoaJuridica(String email, String telefone, String nomeFantasia, String cnpj) {
        super(email, telefone);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        
    } 

    public void exibirDados(){
        System.out.println("Nome da empresa: "+ nomeFantasia);
        System.out.println( "CNPJ da empresa: "+ cnpj);
        super.exibirDados();


    }


}
//  super( ); no construtor tem que ta na primeira linha