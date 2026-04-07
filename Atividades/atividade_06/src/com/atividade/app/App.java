// TODO: atividade 06
// A partir da superclasse abstrata Veiculo, crie as subclasses finais: 
// Moto, Carro, Onibus e Caminhao, todas no package models. Instancie cada 
// uma das subclasses na classe principal, e peça para o usuário informar 
// os seguintes atributos privados de um veículo escolhido pelo próprio 
// usuário: fabricante, modelo, cor, ano, placa. O  atributo privado 
// categoria deverá ser informado pelo próprio programa. 
// Diferenças entre as classes: carro terá bagageiro, onibus poderá ser 
// leito ou não, e caminhao terá carroceria.
// Ao final, o programa exibirá os dados do veículo escolhido por ele.
// NOTE: utilize herança, abstração e encapsulamento para codar.
package com.atividade.app;
//instanciar o objeto dentro do switch case torna o programa mais leve, pois o objeto só é criado quando o usuário escolhe a opção correspondente.
import java.util.Scanner;
import com.atividade.models.Carro;
import com.atividade.models.Caminhao;
import com.atividade.models.Moto;
import com.atividade.models.Onibus;
//nao vamos importar o veiculo entao não vamos importar todas as classes 
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    String tipoVeiculo;

    //o ususario que vai escolher o tipo de veiculo 
    System.out.println("Informe qual o tipo de veículo você deseja cadastrar: ");
    System.out.println("A- Moto");
    System.out.println("B - Carro");
    System.out.println("C - Caminhão");
    System.out.println("D - Ônibus");
    tipoVeiculo = sc.nextLine();


    switch (tipoVeiculo){

        case "A":
            Moto moto = new Moto( null, null, null, null, null, "A", null );
//categoria do veiculo deve ser informada pelo programa então : dentro do new ( ao inves de null 
// ser "A" ja que a categoria não vai ser informada pelo usuario nos proximos passos))
        System.out.println("Informe o fabricante: ");
        moto.fabricante = (sc.nextLine());
        System.out.println("");

        break;
    }





    sc.close();

    }
}
