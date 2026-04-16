package com.atividade09.models;

public class Combustivel {

    private double g;
    private double e;


    public Combustivel(double g, double e) {
        this.g = g;
        this.e = e;
    }


    public double getG() {
        return this.g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getE() {
        return this.e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public String qualMelhor() {
        return (this.e <= this.g*0.7 ) ? "O melhor combustível é o Etanol" : "O melhor combustível é a Gasolina";
}
}
