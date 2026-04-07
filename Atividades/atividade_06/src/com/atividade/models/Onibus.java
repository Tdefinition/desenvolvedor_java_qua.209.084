package com.atividade.models;

final public class Onibus extends Veiculo {
    private boolean leito; 

    public Onibus( String fabricante, String modelo, String placa, String cor, String ano, String categoria) {
        super(fabricante, modelo, placa, cor, ano, categoria);
        this.leito = leito;
    }
    //getter and setter 
    public boolean isLeito() {
        return this.leito;
    }
    //is é usado para retornar um valor booleano, indicando se o ônibus é leito ou não.
    public boolean getLeito(){
        return this.leito;
    }
    public void setLeito(boolean leito){
        this.leito = leito;
    }

}
