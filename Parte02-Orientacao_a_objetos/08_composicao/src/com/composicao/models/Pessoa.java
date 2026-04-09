package com.composicao.models;

public class Pessoa {
    //atributos 
    private String nome;
    private String telefone;
    private String cpf;
    private String email;
    private String cnh;



    public Pessoa(String nome, String telefone, String cpf, String email, String cnh) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.cnh = cnh;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnh() {
        return this.cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
   

}
