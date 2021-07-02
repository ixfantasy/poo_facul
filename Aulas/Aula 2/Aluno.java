public class Aluno {

    // ATRIBUTOS
    private int matricula;
    private String nome;
    private String curso;

    /* IMPRIMIR */
    public void listar(){
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);


        /* == : checks if both objects point to the same memory location

        .equals() : evaluates to the comparison of values in the objects */

        if(this.curso.equalsIgnoreCase("si")){
            System.out.println("Curso: Sistemas de Informação");
        } else {
            System.out.println("Curso: " + this.curso);
        }
    }

    /* SETTERS */
    // MATRÍCULA
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // NOME
    public void setNome(String nome) {
        this.nome = nome;
    }

    // CURSO
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
