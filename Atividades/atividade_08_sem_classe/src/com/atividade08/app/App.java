package com.atividade08.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
    String nome;
    int idade;

    nome = JOptionPane.showInputDialog("Informe seu nome: ");
    idade =Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

    if( idade < 18){
        JOptionPane.showMessageDialog(null, "Usuário menor de idade");
    }
    else{
        JOptionPane.showMessageDialog(null, "Usuário maior de idade");
    }
    }
}
//Crie um programa que recebe do usuario os valores dos atributos
//nome e idade em JOptionPane e o programa informa se o usario é maior 
//ou menor de idade 