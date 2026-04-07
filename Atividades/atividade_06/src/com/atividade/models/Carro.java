package com.atividade.models;

final public class Carro extends Veiculo {

    //atributo 
    private boolean bagageiro;

    //construtor
    public Carro(String fabricante, String modelo, String placa, String cor, String ano, String categoria) {
        super(fabricante, modelo, placa, cor, ano, categoria);
        this.bagageiro = bagageiro;
    }

//getter and setter 
    public boolean isBagageiro() {
        return this.bagageiro;
    }

    public boolean getBagageiro() {
        return this.bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

}
//boolean retorna true ou false, se o carro tiver bagageiro ou não.