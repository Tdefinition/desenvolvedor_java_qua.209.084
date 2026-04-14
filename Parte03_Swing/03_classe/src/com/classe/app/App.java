package com.classe.app;

import com.classe.models.Pessoa;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa= new Pessoa( null, null, null, 0, 0.0);

        pessoa.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em metros: ").replace(",", ".")));
        pessoa.setCpf(JOptionPane.showInputDialog("Informe seu CPF: "));
        pessoa.setEmail(JOptionPane.showInputDialog("Informe seu E-mail: "));

        
        //show Massage Dialog vai mostrar uma menssagem por tela
        //para resulver isso :
        JOptionPane.showMessageDialog(null,
             "Nome: " + pessoa.getNome()+
             "\nIdade: " + pessoa.getIdade()+
             "\nAltura: "+ pessoa.getAltura()+ " metros"+
             "\nCPF: "+ pessoa.getCpf()+
             "\nE-mail: "+ pessoa.getEmail()
            );


    }
}
//metodo show me inputb Dialog só aceita string 
//entao para ele receber a idade devemos 
//voce usara o INTEGAR que é uma classe que transforma a classe o do atributo 
