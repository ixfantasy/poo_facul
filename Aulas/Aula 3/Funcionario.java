public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public Funcionario(){
        trabalhando = false;
    }
    
    // SETTERS + GETTERS
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }


    // MÉTODO DE CLASSE
    public void mudarTrabalho(){
        System.out.println("Mudou de trabalho.");
    }
}
