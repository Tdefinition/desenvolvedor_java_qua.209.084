package com.atividade.models;

final public class Moto extends Veiculo {
    //atributo
    private String cilindradas;
//construtor
    public Moto(String fabricante, String modelo, String placa, String cor, String ano, String categoria, String cilindradas) {
        super(fabricante, modelo, placa, cor, ano, categoria);
        this.cilindradas = cilindradas;
    }    
    //getter and setter

    public String getCilindradas() {
        return this.cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

}
    