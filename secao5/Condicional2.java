package secao5;

public class Condicional2 {
    public static void main(String[] args) {

        int numero = 10;

        String resultado = (numero % 2 == 0) ? "par" : "Impar";

        System.out.println(resultado);

        // CONDIÇAO X > 5 ? EXPERESSAO SE E TRUE "OK"  EXPESSSAO SE E FALSE NAO OK"
        

        // 2 IF ENCADEADO

        
        int idade = 20;
        boolean temCarteira = true;

        if (idade >= 18) {
            if (temCarteira) {
                System.out.println("Pode dirigir");
            } else {
                System.out.println("Precisa ter CNH");
            }
        } else {
            System.out.println("Você não pode dirigir ainda!");
        }
    }
}

