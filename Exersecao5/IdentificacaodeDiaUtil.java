package Exersecao5;

import java.util.Scanner;

public class IdentificacaodeDiaUtil {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            /*> Exercício 4: Identificação de Dia Útil

            Peça ao usuário para inserir um número de 1 a 7, 
            representando os dias da semana (1 para domingo, 2 para segunda, etc.). 
            Use switch para verificar se o dia é um dia útil (segunda a sexta) 
            ou final de semana (sábado e domingo). 
            Exiba uma mensagem correspondente. */

            System.out.println("inserir um número de 1 a 7: ");
            int diaDaSemana = scanner.nextInt();

            switch(diaDaSemana){
                case 1:
                System.out.println("Segunda");
                break;
                case 2:
                System.out.println("Terca");
                break;
                case 3:
                System.out.println("Quarta");
                break;
                case 4:
                System.out.println("Quinta");
                break;
                case 5:
                System.out.println("Sexta");
                break;
                case 6:
                System.out.println("Sabado");
                break;
                case 7:
                System.out.println("Domingo");
                break;
                default:
                
            

            }


        }
    }
    
}
