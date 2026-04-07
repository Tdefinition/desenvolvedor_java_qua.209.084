package com.atividade.models;

final public class Caminhao extends Veiculo {
    int carroceria;
    public Caminhao( String fabricante, String modelo, String placa, String cor, String ano, String categoria) {
    super (fabricante, modelo, placa, cor, ano, categoria);
    this.carroceria = carroceria;
    }

    public int getCarroceria() {
        return this.carroceria;
    }

    public void setCarroceria(int carroceria) {
        this.carroceria = carroceria;
    }

}
