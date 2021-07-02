public class PessoaTester {
    
    public static void main(String[] args){

        /* Pessoa pessoa = new Pessoa("Nath");

        pessoa.fazerAniversario(); */

        Aluno aluno = new Aluno();
        aluno.setNome("Fulano");
        aluno.fazerAniversario();


        Funcionario func = new Funcionario();
        func.setNome("Cicrano");
        func.fazerAniversario();
        func.mudarTrabalho();
    }
}
