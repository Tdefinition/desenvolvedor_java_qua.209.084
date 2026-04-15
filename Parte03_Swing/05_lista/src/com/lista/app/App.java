package com.lista.app;

import javax.swing.JOptionPane;
import com.lista.models.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
       
        Calculadora calculadora = new Calculadora(0, 0);

        //declaração de arrays
        String[] opcoes =  {"Soma", "Subtração", "Multiplicação", "Divisão", "Sair"};
        Object opcao ;
        String opcaoSelecionada ;
        do{
        
            opcao = JOptionPane.showInputDialog(null
             ,"Selecione uma opção", 
                "Opções",
                 JOptionPane.QUESTION_MESSAGE, 
                 null, 
                 opcoes,// qual Array ele vai utilizar
                 opcoes[0]);//posicção do array que será o padrão

            if( opcao.equals("Sair")){

            }else {
                JOptionPane.showMessageDialog(null, "Programa encerrado");
             } while( opcao != "Sair") ;
    }
}

}
// a sintaxe correta para declarar o arrray seria
// String[] nomedoarray = {valores da lista}

//switch case nao funciona com o tipo 