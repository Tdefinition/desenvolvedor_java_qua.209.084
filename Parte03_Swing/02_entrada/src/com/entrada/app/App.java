package com.entrada.app;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //declaração de variáveis
        String nome;

        //entrada de dados
        //para usar o Input dialog tem que chamar a variavel:

        nome = JOptionPane.showInputDialog("Informe seu nome: ");

        //saída de dados 
        JOptionPane.showMessageDialog(null, "Meu nome é "+ nome);
    }
}
