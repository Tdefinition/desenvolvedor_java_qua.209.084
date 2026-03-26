package com.atividade03.app;
// Recrie o programa da calculadora feito no dia 18/03
//(switch..case) mas desta vez acrescentamos a opção de encerrar 
//o programa quando o usuário quiser
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner sc = new Scanner(System.in);

    int opc;
    int num1;
    int num2;
    int result = 0;
    
    do {
    System.out.println("Para usar a calcular, escolha a opereração desejada:");
    System.out.println("Adição - 1");
    System.out.println("Subtração - 2");
    System.out.println("Multplicação - 3");
    System.out.println("Divisão - 4");
    System.out.println("Sair da caluldora - 5");
    opc = sc.nextInt();

    if(opc > 0 && opc < 5){
     System.out.println("Informe o primeiro número: ");
     num1 = sc.nextInt();
     System.out.println("Informe o segundo número: ");
     num2 = sc.nextInt();
     
     switch (opc) {

         case 1 :
        result = num1 + num2;
             break;
        case 2 :
        result = num1 - num2;
            break;
        case 3:
        result = num1 * num2;
            break;
        case 4: 
        result = num1/num2;
            break;

        default:
        break;
            
     }
     System.out.println("Resultado: " + result);
     System.out.println("Escolha a próxima operação");
    }else if(opc !=5){

        System.out.println("Operação inválida!");
        System.out.println("Tente novamente");
    }else{
        
    }
    }while(opc != 5);

sc.close();
}
}
