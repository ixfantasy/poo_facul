import java.util.*;

public class Acao implements II_Ibovespa {
    
    private String nome;
    private float preco;
    private float valorizacao;

    @Override
    public String toString() {
        return "Acao [nome=" + nome + ", preco=" + preco + ", valorizacao=" + valorizacao + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


    public float getValorizacao() {
        return valorizacao;
    }

    public void setValorizacao(float valorizacao) {
        this.valorizacao = valorizacao;
    }


    @Override
    public void listar(ArrayList<Acao> acoes) {
        System.out.println("Lista evolucao da PETROBRAS");
        
        for(Acao minhaAcao : acoes){
            System.out.println(minhaAcao);
        }
    }


    @Override
    public void ordenar(ArrayList<Acao> acoes) {
        System.out.println("Antes de ordenar: " + acoes);
        
        Collections.sort(acoes, new Comparator<Acao>() {

            public  int compare(Acao o1, Acao o2){
                return Float.compare(o1.getPreco(), o2.getPreco());
            }
        });

        System.out.println("Depois de ordenar: " + acoes);
    }

}
