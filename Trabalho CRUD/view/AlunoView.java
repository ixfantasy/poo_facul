/* Nome: Nathalia Fortunato & Jorbe Junior
 Matr�cula: 0050016724 // 0050016533
 */

package view;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bo.Aluno;
import controller.AlunoController;

public class AlunoView implements ActionListener {

	public void create(){
		
		Scanner in = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com a matricula:");
		aluno.setMatricula(in.next());
		
		System.out.println("Entre com o nome: ");
		aluno.setNome(in.next());
		
		System.out.println("Entre com a Cidade:");
		aluno.setCidade(in.next());
		
		AlunoController controller = new AlunoController();
		controller.create(aluno);
	}
	
	
	public void read(){
		AlunoController controller = new AlunoController();
		
		System.out.println("Listagem de alunos");
		System.out.println("******************");
		
		for(Aluno aluno:controller.read()){
			System.out.println("Aluno matr:" + aluno.getMatricula());
			System.out.println("Aluno nome:" + aluno.getNome());
			System.out.println("Aluno cidade:" + aluno.getCidade());
			System.out.println("-----------------------------------");
		}
	}
	
	
	public void update(){
		Scanner in = new Scanner(System.in);
		
		// Aluno
		Aluno aluno = new Aluno();
		
			// adicionar informa��es
			System.out.println("Entre com a matricula para a atualizacao:");
			aluno.setMatricula(in.next());
			
			System.out.println("Entre com o novo nome: ");
			aluno.setNome(in.next());
			
			System.out.println("Entre com a nova Cidade:");
			aluno.setCidade(in.next());
		
		// Controller
		AlunoController controller = new AlunoController();
		controller.update(aluno);
	}

	
	public void delete(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com a matricula do aluno para deletar:");
		String matri = in.next();
		
		// Controller
		AlunoController controller = new AlunoController();
		controller.delete(matri);
	}
	
	
	// JAVA SWING
	private JFrame janela;
	private JPanel painel;
	
	private JLabel lbltitulo;
	private JLabel lblGrupo;
	private JLabel lblMatri;
	private JLabel lblNome;
	private JLabel lblCidade;
	private JLabel lblResul;
	
	
	private JTextField txtMatri;
	private JTextField txtNome;
	private JTextField txtCidade;
	
	
	private JButton btnCrt;
	private JButton btnRead;
	private JButton btnUpd;
	private JButton btnDel;
	
	
	private String matri;
	private String nome;
	private String cidade;
	
	public AlunoView() {
		janela = new JFrame();
		
		// painel
		painel = new JPanel();
		painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		painel.setLayout(new GridLayout(0,1));
		
		
		/* COMPONENTES DA TELA */
		// titulo
		lbltitulo = new JLabel("Banco de Dados - Alunos");
		lbltitulo.setFont(new Font("Verdana", Font.BOLD, 20));
		painel.add(lbltitulo);
		
		
		// grupo
		lblGrupo = new JLabel("Grupo: Jorbe Junior e Nath�lia Fortunato");
		lblGrupo.setFont(new Font("Verdana", Font.BOLD, 10));
		painel.add(lblGrupo);
		
		
		// matricula
		lblMatri = new JLabel("Matricula");
		painel.add(lblMatri);
		
		txtMatri = new JTextField();
		painel.add(txtMatri);
		
		
		// nome
		lblNome = new JLabel("Nome");
		painel.add(lblNome);
		
		txtNome = new JTextField();
		painel.add(txtNome);
		
		
		// cidade
		lblCidade = new JLabel("Cidade");
		painel.add(lblCidade);
		
		txtCidade = new JTextField();
		painel.add(txtCidade);
		
		
		// Create
		btnCrt = new JButton("Criar Novo Aluno");
		btnCrt.addActionListener(this);
		painel.add(btnCrt);
		
		
		// Read
		btnRead = new JButton("Listar Alunos Cadastrados");
		btnRead.addActionListener(this);
		painel.add(btnRead);
		
		
		// Update
		btnUpd = new JButton("Atualizar um Aluno");
		btnUpd.addActionListener(this);
		painel.add(btnUpd);
		
		
		// Delete
		btnDel = new JButton("Deletar um Aluno");
		btnDel.addActionListener(this);
		painel.add(btnDel);
		
		
		// Resul - Feedback
		lblResul = new JLabel("...");
		lblResul.setFont(new Font("Verdana", Font.BOLD, 15));
		lblResul.setForeground(Color.PINK);
		painel.add(lblResul);
		
		
		// janela
		janela.add(painel, BorderLayout.CENTER);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Alunos");
		janela.setSize(500, 500);
		janela.pack();
		janela.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// inicia
		new AlunoView();
		
		
		/*AlunoView crud = new AlunoView();
		
		System.out.println("Qual acao do CRUD?");
		Scanner in = new Scanner(System.in);
		String resposta = in.next();
		
		if (resposta.equalsIgnoreCase("c")) {
			crud.create();
		} else if(resposta.equalsIgnoreCase("u")) {
			crud.update();
		}
		else if(resposta.equalsIgnoreCase("d")) {
			crud.delete();
		}
		else
			crud.read();
		}*/
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// pegar informa��es nos fields
		matri = txtMatri.getText();
		nome = txtNome.getText();
		cidade = txtCidade.getText();
		
		// jogar informa��es dentro da classe
		Aluno aluno = new Aluno();
		aluno.setMatricula(matri);
		aluno.setNome(nome);
		aluno.setCidade(cidade);
		
		AlunoController control = new AlunoController();
		
		// funcionamento dos bot�es
		if(e.getSource() == btnCrt) {
			control.create(aluno);
			lblResul.setText("Aluno incluido com sucesso!");
		}
		else if(e.getSource() == btnRead) {
			lblResul.setText("Listagem no Console!");
			
			AlunoController controller = new AlunoController();
			
			System.out.println("Listagem de alunos");
			System.out.println("******************");
			
			for(Aluno aluno2:controller.read()){
				System.out.println("Aluno matr:" + aluno2.getMatricula());
				System.out.println("Aluno nome:" + aluno2.getNome());
				System.out.println("Aluno cidade:" + aluno2.getCidade());
				System.out.println("-----------------------------------");
			}
			
		}
		else if(e.getSource() == btnUpd) {
			control.update(aluno);
			lblResul.setText("Aluno atualizado com sucesso!");
		}
		else if(e.getSource() == btnDel) {
			control.delete(matri);
			lblResul.setText("Aluno deletado com sucesso!");
		}
	}
}