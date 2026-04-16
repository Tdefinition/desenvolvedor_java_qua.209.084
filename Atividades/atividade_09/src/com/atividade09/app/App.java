package com.atividade09.app;

import javax.swing.JOptionPane;

import com.atividade09.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        
    Combustivel combustivel = new Combustivel( 0, 0);

    // declaração de arrays
        String[] opcoes = {"Qual combustível é melhor?", "Sair"};
        Object opcao;
        
    

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Selecione uma opção:", 
                "Opções", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
            );

 if (!opcao.equals("Sair")) {
                
    combustivel.setG( Double.parseDouble(JOptionPane.showInputDialog("Qual é o preço da Gasolina: ")));
    combustivel.setE(Double.parseDouble(JOptionPane.showInputDialog("Qual é o preço do Etanol: ")));

                

                JOptionPane.showMessageDialog(null,  combustivel.qualMelhor());
            }
            else {
                JOptionPane.showMessageDialog(null, "Programa encerrado");
            }
            
        } while( opcao != "Sair") ;

    
}
}
//Faça um programa com JOption que receba  que do usuário os valores dos 
//combustíveis: etanol e gasolina, e exiba qual o melhor combustível para 
//abastecer. O programa deverá mostrarr a opção de entrar com o valor
//do etanol, da gasolina, mostrar melhor combustível ou sair do programa 

//para o etanol ser mais vantajoso, seu preço tem que ser até 70%
//do valor da gasolina 