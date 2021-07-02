/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

package questao2;

public abstract class Funcionario extends Pessoa {
    
    // atributos
    private String matricula;
    private Funcionario gerente;
    
    
    /* GETTERS + SETTERS */
    // matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // gerente
    public Funcionario getGerente() {
        return gerente;
    }
    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }


    /* MÉTODO ABSTRATO */
    public abstract double calculaSalario();


    /* CONSTRUTOR */
    public Funcionario(String nome, String matricula){
        super(nome);
        this.matricula = matricula;
    }
}