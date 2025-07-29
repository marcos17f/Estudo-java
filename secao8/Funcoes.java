package secao8;


public class Funcoes {
    public static void main(String[]args){
        //- 1 Criando a primeira funçao
        // tanto funçoes como variaveis, a gente nomeia
        saudacao();
        mensagem();

        //2 Parametros
        soma(2, 4);

        saudar("Marcos");
        

        // return
        dobrar(5);

        int numero = 10;

        int numeroDobrado = dobrar(numero);

        System.out.println("O Resultado e " + numeroDobrado);

        System.out.println(dobrar ( 12));
       
        
    }

        //NIVEL DE ACESSO, STATIC => nao precisa instancia classe para executar, Tipo Retorno
        //NOME, OS PARANTESES(ARGS), BLOCO {}

        public static void saudacao(){
            System.out.println("Ola Marcos SEJA BEM VINDO AS FUNÇOES. ");
        }

        public static void mensagem (){
            System.out.println("Esse e o teste de Marcos");
        }

        public static void soma(int a,int b){
            int resultado = a + b;
            System.out.println("O Resultado da soma e : " + resultado);

        }

        public static void saudar(String name){
            System.out.println("Ola " + name + ", Tudo bem?");
        }
        

        public static int dobrar(int n){
            return n * 2;
        }


    }


    
