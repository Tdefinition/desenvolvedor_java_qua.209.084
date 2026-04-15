package com.atividade08.app;

import javax.swing.JOptionPane;

import com.atividade08.models.Usuario;
public class App {
    public static void main(String[] args) throws Exception {

    Usuario usuario = new Usuario(null , 0);

    usuario.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
    usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));

    //saida de dados 
    JOptionPane.showMessageDialog(null, usuario.getNome()  + usuario.verificarIdade());
        
    }
}
