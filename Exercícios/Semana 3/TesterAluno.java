import java.util.Scanner;

public class TesterAluno {

    public static void main(String[] args){

        // INICIAR CLASSE
        Aluno aluno = new Aluno();

        // INICIAR SCANNER
        Scanner scan = new Scanner(System.in);

        
        // SOLICITAR MATRÍCULA
        System.out.print("Digite a matrícula: ");
        aluno.setMatricula(scan.nextInt());


        // SOLICITAR NOME
        System.out.print("Digite o seu nome: ");
        aluno.setNome(scan.next());


        // SOLICITAR CURSO
        System.out.print("Digite o seu curso: ");
        aluno.setCurso(scan.next());

        // LISTAR ATRIBUTOS
        aluno.listar();

    }
}
