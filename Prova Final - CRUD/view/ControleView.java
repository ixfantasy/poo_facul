/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import bo.*;
import controller.*;

public class ControleView implements ActionListener {
	
	// JAVA SWING
	private JFrame janela;
	private JPanel painel;
	
	private JLabel lbltitulo;
	private JLabel lblGrupo;
	private JLabel lblidC;
	private JLabel lblPreco;
	private JLabel lblidJ;
	private JLabel lblidL;
	private JLabel lblResul;
	
	
	private JTextField txtidC;
	private JTextField txtPreco;
	private JTextField txtidJ;
	private JTextField txtidL;
	
	
	private JButton btnCrt;
	private JButton btnRead;
	private JButton btnUpd;
	private JButton btnDel;
	
	
	private String idC;
	private String preco;
	private String idJ;
	private String idL;
	
	public ControleView() {
		janela = new JFrame();
		
		// painel
		painel = new JPanel();
		painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		painel.setLayout(new GridLayout(0,1));
		
		
		/* COMPONENTES DA TELA */
		// titulo
		lbltitulo = new JLabel("Banco de Dados - Produtos");
		lbltitulo.setFont(new Font("Verdana", Font.BOLD, 20));
		painel.add(lbltitulo);
		
		
		// grupo
		lblGrupo = new JLabel("Grupo: Jorbe Junior e Nathália Fortunato");
		lblGrupo.setFont(new Font("Verdana", Font.BOLD, 10));
		painel.add(lblGrupo);
		
		
		// id_c
		lblidC = new JLabel("ID_C");
		painel.add(lblidC);
		
		txtidC = new JTextField();
		painel.add(txtidC);
		
		
		// preco
		lblPreco = new JLabel("PRECO");
		painel.add(lblPreco);
		
		txtPreco = new JTextField();
		painel.add(txtPreco);
		
		
		// id_jogo
		lblidJ = new JLabel("ID_JOGO");
		painel.add(lblidJ);
		
		txtidJ = new JTextField();
		painel.add(txtidJ);
		
		
		// id_loja
		lblidL = new JLabel("ID_LOJA");
		painel.add(lblidL);
		
		txtidL = new JTextField();
		painel.add(txtidL);
		
		
		// Create
		btnCrt = new JButton("Adicionar Novo Produto");
		btnCrt.addActionListener(this);
		painel.add(btnCrt);
		
		
		// Read
		btnRead = new JButton("Listar Produtos");
		btnRead.addActionListener(this);
		painel.add(btnRead);
		
		
		// Update
		btnUpd = new JButton("Atualizar um Produto");
		btnUpd.addActionListener(this);
		painel.add(btnUpd);
		
		
		// Delete
		btnDel = new JButton("Deletar um Produto");
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
		janela.setTitle("Controle");
		janela.setSize(500, 500);
		janela.pack();
		janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// pegar informações nos fields
		idC = txtidC.getText();
		preco = txtPreco.getText();
		idJ = txtidJ.getText();
		idL = txtidL.getText();
		
		// jogar informações dentro da classe
		Controle ctrl = new Controle();
		ctrl.setId_c(idC);
		ctrl.setPreco(preco);
		ctrl.setId_jg(idJ);
		ctrl.setId_lj(idL);
		
		ControleController control = new ControleController();
		
		// funcionamento dos botões
		if(e.getSource() == btnCrt) {
			control.createC(ctrl);
			lblResul.setText("Produto incluido com sucesso!");
		}
		else if(e.getSource() == btnRead) {
			lblResul.setText("LISTA DISPONIVEL NO CONSOLE!");
			
			System.out.println("LISTAGEM DE PRODUTOS:");
			
			for(Controle controle2:control.readC()) {
				System.out.println("ID_CTRL: " + controle2.getId_c());
				System.out.println("PRECO: " + controle2.getPreco());
				System.out.println("ID_JOGO: " + controle2.getId_jg() );
				System.out.println("ID_LOJA: " + controle2.getId_lj() );
				System.out.println("------------------------------------");
			}
		}
		else if(e.getSource() == btnUpd) {
			control.updateC(ctrl);
			lblResul.setText("Produto atualizado com sucesso!");
		}
		else if(e.getSource() == btnDel) {
			control.deleteC(idC);
			lblResul.setText("Produto deletado com sucesso!");
		}
		
	}
	
}
