/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

package questao3;

public class KpopCantor extends KpopGrupo {
    
    // atributos
    private String nome;


    /* CONSTRUTOR */
    public KpopCantor(String grupo, String nome){
        super(grupo);
        this.nome = nome;
    }


    /* GETTERS + SETTERS */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    /* ALTERAR O GRUPO */
    public void alterarGrupo(String novo){
        super.setGrupo(novo);
    }


    /* IMPRIMIR INFORMAÇÕES */
    public void imprimirInfo(){
        System.out.println("NOME DO GRUPO: " + super.getGrupo() + " // NOME DO CANTOR: " + getNome());
    }
}