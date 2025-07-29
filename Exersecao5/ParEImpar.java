package Exersecao5;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            /*Exercício 3: Identificação de Paridade com Strings

            Peça ao usuário para inserir um número. 
            Verifique se o número é par ou ímpar, e exiba a palavra "Par" ou "Ímpar". 
             Use uma string para armazenar o resultado e exibi-la.

             Depois de avaliar o número, tu vai colocar se é par ou impar em uma var. */

             System.out.println("Digite um numero: ");
             int numero = scanner.nextInt();

             String resultado = "";

             if(numero % 2 == 0){
                resultado = "Par";
             }else{
                resultado = "Impar0";
             }

             System.out.println("O resultado e" + resultado);

             }




        }
        


        
    }
    

