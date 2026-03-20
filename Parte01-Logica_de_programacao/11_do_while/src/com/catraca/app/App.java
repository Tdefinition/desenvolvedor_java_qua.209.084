package com.catraca.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nome;
        double peso;
        double altura;
        int opc;

        do {


          System.out.println("Deseja registrar nova entrada: ");  
          System.out.println("1 - Registrar nova entrada.");
          System.out.println("2 - Sair do programa ");
          opc = sc.nextInt();
         if( opc == 1){
            sc.nextLine();
            System.out.println("Informe seu nome: ");
            nome = sc.nextLine();
            System.out.println("Informe seu peso em kg: ");
            peso = sc.nextDouble();
            System.out.println("Informe sua altura em metros: ");
            altura = sc.nextDouble();

            if( altura >1.25 && peso < 120){

                System.out.println("Entrada de "+ nome+" autorizada");
            } else {
                System.out.println("Entrada de "+ nome+" não autorizada");
            }
         }else if( opc == 2) {
            System.out.println("Obrigado pela preferencia!");

         } else{ 
            System.out.println("Opção inválida");
         } 
         
        
        } while ( opc != 2);

       sc.close();
    }

}
// diferença entre while e do while
// no while o laço pode ou não ser executado
// no do while não importa se a condição é verdadira ser falsa ou não
// a execção ocorreá ao menos uma vez msm a condições estando falsa
// pois a condicional não é pra executar o laço e sim se vai repetir ele ou não
//por isso ele vai executar o laço ao menos uma vez
// estrutura do do while 
// do {
//while();
// }

// operador de diferente (!=)

