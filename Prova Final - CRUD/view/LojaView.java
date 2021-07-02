/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import bo.*;
import controller.*;

public class LojaView implements ActionListener {

	// JAVA SWING
	private JFrame janela;
	private JPanel painel;
	
	private JLabel lbltitulo;
	private JLabel lblGrupo;
	private JLabel lblid;
	private JLabel lblNome;
	private JLabel lblTipo;
	private JLabel lblResul;
	
	
	private JTextField txtid;
	private JTextField txtNome;
	private JTextField txtTipo;
	
	
	private JButton btnCrt;
	private JButton btnRead;
	private JButton btnUpd;
	private JButton btnDel;
	
	
	private String id;
	private String nome;
	private String tipo;
	
	public LojaView() {
		janela = new JFrame();
		
		// painel
		painel = new JPanel();
		painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		painel.setLayout(new GridLayout(0,1));
		
		
		/* COMPONENTES DA TELA */
		// titulo
		lbltitulo = new JLabel("Banco de Dados - Lojas");
		lbltitulo.setFont(new Font("Verdana", Font.BOLD, 20));
		painel.add(lbltitulo);
		
		
		// grupo
		lblGrupo = new JLabel("Grupo: Jorbe Junior e Nathália Fortunato");
		lblGrupo.setFont(new Font("Verdana", Font.BOLD, 10));
		painel.add(lblGrupo);
		
		
		// id_loja
		lblid = new JLabel("ID_LOJA");
		painel.add(lblid);
		
		txtid = new JTextField();
		painel.add(txtid);
		
		
		// nome
		lblNome = new JLabel("NOME");
		painel.add(lblNome);
		
		txtNome = new JTextField();
		painel.add(txtNome);
		
		
		// tipo
		lblTipo = new JLabel("TIPO");
		painel.add(lblTipo);
		
		txtTipo = new JTextField();
		painel.add(txtTipo);
		
		
		// Create
		btnCrt = new JButton("Adicionar Nova Loja");
		btnCrt.addActionListener(this);
		painel.add(btnCrt);
		
		
		// Read
		btnRead = new JButton("Listar Lojas");
		btnRead.addActionListener(this);
		painel.add(btnRead);
		
		
		// Update
		btnUpd = new JButton("Atualizar uma Loja");
		btnUpd.addActionListener(this);
		painel.add(btnUpd);
		
		
		// Delete
		btnDel = new JButton("Deletar uma Loja");
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
		janela.setTitle("Lojas");
		janela.setSize(500, 500);
		janela.pack();
		janela.setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e) {
		// pegar informações nos fields
		id = txtid.getText();
		nome = txtNome.getText();
		tipo = txtTipo.getText();
		
		// jogar informações dentro da classe
		Loja loja = new Loja();
		loja.setId_lj(id);
		loja.setNome(nome);
		loja.setTipo(tipo);
		
		LojaController control = new LojaController();
		
		// funcionamento dos botões
		if(e.getSource() == btnCrt) {
			control.createL(loja);
			lblResul.setText("Loja incluida com sucesso!");
		}
		else if(e.getSource() == btnRead) {
			lblResul.setText("LISTA DISPONIVEL NO CONSOLE!");
			
			System.out.println("LISTAGEM DE LOJAS:");
			
			for(Loja loja2:control.readL()) {
				System.out.println("ID: " + loja2.getId_lj());
				System.out.println("NOME: " + loja2.getNome());
				System.out.println("TIPO: " + loja2.getTipo() );
				System.out.println("------------------------------------");
			}
		}
		else if(e.getSource() == btnUpd) {
			control.updateL(loja);
			lblResul.setText("Loja atualizada com sucesso!");
		}
		else if(e.getSource() == btnDel) {
			control.deleteL(id);
			lblResul.setText("Loja deletada com sucesso!");
		}
		
	}
}
