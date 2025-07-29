package Exersecao5;

import java.util.Scanner;


public class ValidacaodeLogin {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

             /* Exercício 2: Validação de Login

            Peça ao usuário para inserir um nome de usuário e uma senha. 
            Verifique se o nome de usuário é "admin" e a senha é "1234". 
            Se ambos forem corretos, exiba "Acesso permitido". 
            Caso contrário, exiba "Acesso negado". */

            System.out.println("Digite o Nome Do Usuario: ");
            String usuario = scanner.next();
            System.out.println("Digite a senha do Usuario: ");
            String password = scanner.next();


            if(usuario.equals("Marcos") && password.equals("1997")){
                    System.out.println("Acesso Permitido !:");
            }else {
                    System.out.println("Acesso Negado!");
            }

    
        }
    }
  
}
