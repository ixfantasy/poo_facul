import java.util.*;

public class Ibovespa {

    public static void main(String[] args){

        Scanner tecl = new Scanner(System.in);

        String nome = "";
        float preco = 0.0f;

        try {

            System.out.print("Entre com o nome: ");
            nome = tecl.next();

            System.out.print("Entre com o preco: ");
            preco = tecl.nextFloat();
            
        } catch (Exception e) {
            System.out.println("Erro!");
            System.out.println(e.getMessage());
        }

        
        Acao petr4_1 = new Acao();
        petr4_1.setNome(nome);
        petr4_1.setPreco(preco);
        petr4_1.setValorizacao(0.01f);


        Acao petr4_2 = new Acao();
        petr4_2.setNome("VALE3");
        petr4_2.setPreco(92.44f);
        petr4_2.setValorizacao(0.8f);


        ArrayList<Acao> acoes = new ArrayList<Acao>();
        acoes.add(petr4_1);
        acoes.add(petr4_2);

        petr4_1.listar(acoes);
        petr4_2.ordenar(acoes); // ordenar por preco crescente

        tecl.close();
    }
}