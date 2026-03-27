package com.atividade05.models;

public class Professor {

    public String nome;
    public String matricula;

    public double areaDoTriangulo( double b , double h){

        return (b*h)/2;

    }
    public double areaDoCirculo( double r){

        return Math.PI*Math.pow(r,2);

    }
    public double equaçãoLinear(double a, double b){

        return -b/a;
        //ax + b = y 
        //ax + b = 0 
        //ax = -b 
        //x = -b/a
    }
}
