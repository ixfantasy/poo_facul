/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

package questao3;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public void alterar(String nome){
        super.setNome(nome);
    }

    public void imprimir(){
        System.out.println("Nome atual: " + super.getNome());
    }
}