import java.util.*; // para importar tudo

public class Aula1 {

    public static void main(String[] args){
        /* DECLARAÇÃO DE VARIÁVEIS */
        char option;
        option = 'c';

        int x = 35;

        double f = 3.5;

        boolean r = true;

        /* PRINTANDO UM TEXTO */
        System.out.print("Olá, mundo!");
        System.out.println("Olá, mundo! 2");


        /* ENTRADA DE DADOS
        Importar o Scanner através do pacote jave.util

        next() - String
        nextInt() - Int
        nextDouble() - Double
        nextFloat() - Float */

        Scanner scan = new Scanner(System.in); // cria variável do tipo Scanner

        String nome = "";
        System.out.printf("Digite o seu nome:");

        nome = scan.next();
        System.out.printf("\nMeu nome é %s.", nome);
        System.out.println("Tchau, " + nome);
        System.out.print("Java!!");

        scan.close(); // fecha a variável do Scanner

        /* CONVERSÃO DE DADOS
        Convertendo String para qualquer tipo primitivo

        int - Integer.parseInt( string )
        float - Float.parseFloat( string )
        double - Double.parseFloat( string ) */


        /* ESTRUTURAS DE SELEÇÃO
        if / else
        switch */

        if(18 > 3){
            System.out.println("O número é maior!");
        } else {
            System.out.println("O número é menor!");
        }

        switch(3){
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;
            default:
                break;
        }


        /* ESTRUTURAS DE REPETIÇÃO */
        x = 0;

        while(x < 10){
            System.out.println(x);
            x++;
        }
    }
}
