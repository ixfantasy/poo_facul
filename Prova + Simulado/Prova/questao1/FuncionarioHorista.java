/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

package questao1;

public class FuncionarioHorista extends Funcionario {
    
    // atributos
    private double horasTrabalhadas;
    private double valorHora;
    
    
    /* GETTERS + SETTERS */
    // horasTrabalhadas
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // valorHora
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    /* MÉTODO CALCULASALARIO */
    public double calculaSalario(){
        return horasTrabalhadas * valorHora;
    }


    /* PRIMEIRO CONSTRUTOR */
    public FuncionarioHorista(String nome, String matricula){
        super(nome, matricula);
    }


    /* SEGUNDO CONSTRUTOR */
    public FuncionarioHorista(){
        super("Sem Nome", "Sem Matricula");
    }
}