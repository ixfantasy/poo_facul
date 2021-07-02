/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import bo.*;
import controller.*;

public class JogoView implements ActionListener {
	
	// JAVA SWING
	private JFrame janela;
	private JPanel painel;
	
	private JLabel lbltitulo;
	private JLabel lblGrupo;
	private JLabel lblid;
	private JLabel lblNome;
	private JLabel lblGenero;
	private JLabel lblResul;
	
	
	private JTextField txtid;
	private JTextField txtNome;
	private JTextField txtGenero;
	
	
	private JButton btnCrt;
	private JButton btnRead;
	private JButton btnUpd;
	private JButton btnDel;
	
	
	private String id;
	private String nome;
	private String genero;
	
	public JogoView() {
		janela = new JFrame();
		
		// painel
		painel = new JPanel();
		painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		painel.setLayout(new GridLayout(0,1));
		
		
		/* COMPONENTES DA TELA */
		// titulo
		lbltitulo = new JLabel("Banco de Dados - Jogos");
		lbltitulo.setFont(new Font("Verdana", Font.BOLD, 20));
		painel.add(lbltitulo);
		
		
		// grupo
		lblGrupo = new JLabel("Grupo: Jorbe Junior e Nathália Fortunato");
		lblGrupo.setFont(new Font("Verdana", Font.BOLD, 10));
		painel.add(lblGrupo);
		
		
		// id_jogo
		lblid = new JLabel("ID_JOGO");
		painel.add(lblid);
		
		txtid = new JTextField();
		painel.add(txtid);
		
		
		// nome
		lblNome = new JLabel("NOME");
		painel.add(lblNome);
		
		txtNome = new JTextField();
		painel.add(txtNome);
		
		
		// genero
		lblGenero = new JLabel("GENERO");
		painel.add(lblGenero);
		
		txtGenero = new JTextField();
		painel.add(txtGenero);
		
		
		// Create
		btnCrt = new JButton("Adicionar Novo Jogo");
		btnCrt.addActionListener(this);
		painel.add(btnCrt);
		
		
		// Read
		btnRead = new JButton("Listar Jogos");
		btnRead.addActionListener(this);
		painel.add(btnRead);
		
		
		// Update
		btnUpd = new JButton("Atualizar um Jogo");
		btnUpd.addActionListener(this);
		painel.add(btnUpd);
		
		
		// Delete
		btnDel = new JButton("Deletar um Jogo");
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
		janela.setTitle("Jogos");
		janela.setSize(500, 500);
		janela.pack();
		janela.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// pegar informações nos fields
		id = txtid.getText();
		nome = txtNome.getText();
		genero = txtGenero.getText();
		
		// jogar informações dentro da classe
		Jogo jogo = new Jogo();
		jogo.setId_jg(id);
		jogo.setNome(nome);
		jogo.setGenero(genero);
		
		JogoController control = new JogoController();
		
		// funcionamento dos botões
		if(e.getSource() == btnCrt) {
			control.createJ(jogo);
			lblResul.setText("Jogo incluido com sucesso!");
		}
		else if(e.getSource() == btnRead) {
			lblResul.setText("LISTA DISPONIVEL NO CONSOLE!");
			
			System.out.println("LISTAGEM DE JOGOS:");
			
			for(Jogo jogo2:control.readJ()) {
				System.out.println("ID: " + jogo2.getId_jg());
				System.out.println("NOME: " + jogo2.getNome());
				System.out.println("GENERO: " + jogo2.getGenero() );
				System.out.println("------------------------------------");
			}
		}
		else if(e.getSource() == btnUpd) {
			control.updateJ(jogo);
			lblResul.setText("Jogo atualizado com sucesso!");
		}
		else if(e.getSource() == btnDel) {
			control.deleteJ(id);
			lblResul.setText("Jogo deletado com sucesso!");
		}
		
	}
}
