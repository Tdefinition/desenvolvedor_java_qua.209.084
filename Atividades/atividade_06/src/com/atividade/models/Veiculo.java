package com.atividade.models;
//O  atributo privado categoria deverá ser informado pelo próprio programa

abstract public class Veiculo {

//atributods
 private String fabricante;
 private String modelo;
 private String placa;
 private String cor;
 private String ano;
 private String categoria;
//construtor
 public Veiculo( String fabricante, String modelo, String placa, String cor, String ano, String categoria){
 this.fabricante = fabricante;
 this.modelo = modelo;
 this.placa = placa;
 this.cor = cor;
 this.ano = ano;
 this.categoria = categoria;


 }
//metodos de acesso(getter and setter)


    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
  

}// o atributo ser privado é por questao de segurança(sempre devem ser private)
//quando o atributo é privado a classe principal n pode Aacessar ela 
// para conseguir acessar o atributo privado, é necessário criar um método de acesso (getter and setter) para cada atributo privado.
//fabricante, modelo, cor, ano, placa