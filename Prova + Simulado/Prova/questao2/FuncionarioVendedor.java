/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

package questao2;

public class FuncionarioVendedor extends Funcionario {
    
    // atributos
    private double quantidadeVendida;
    private double taxaComissao;


    /* MÉTODO TOSTRING */
    @Override
    public String toString() {
        return "{ NOME: " + getNome() + " // TIPO: Vendedor // SALÁRIO: R$" + calculaSalario() + " }";
    }

    
    /* GETTERS + SETTERS */
    // quantidadeVendida
    public double getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(double quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    // taxaComissao
    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }


    /* MÉTODO CALCULASALARIO */
    public double calculaSalario(){
        return quantidadeVendida * taxaComissao;
    }


    /* MÉTODO CONSTRUTOR */
    public FuncionarioVendedor(String nome, String matricula){
        super(nome, matricula);
    }
}