package Exersecao5;

import  java.util.Scanner;
public class IntervaloAnd {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            /*
             * Peça ao usuário para inserir um número. 
             Verifique se o número está no intervalo de 10 a 20, inclusive. 
             Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba "Fora do intervalo".
             */

             System.out.println("insira o numero: ");
             int numero = scanner.nextInt();

             if(numero >= 10 && numero <=20){
                System.out.println("Dentro do Intervalo");
             }else{
                System.out.println("Fora Do Intervalo");
             }

        }
        
    }
    
}
