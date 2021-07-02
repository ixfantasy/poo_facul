/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

package questao1;

public abstract class Pessoa {

    // atributos
    private String nome;


    /* GETTERS + SETTERS */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    /* CONSTRUTOR */
    public Pessoa(String nome){
        this.nome = nome;
    }
}