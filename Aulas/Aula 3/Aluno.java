public class Aluno extends Pessoa { // faz a conexão de herança

    private String matricula;
    private String curso;
    
    // SETTERS + GETTERS
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }


    // MÉTODO DE CLASSE
    public void cancelarMatricula(){
        System.out.println("Matricula cancelada!!");
    }
}