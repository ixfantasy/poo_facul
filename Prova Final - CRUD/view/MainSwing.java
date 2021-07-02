/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainSwing implements ActionListener {
	
	private JFrame janela;
	private JPanel painel;
	
	private JLabel lbltitulo;
	private JLabel lblGrupo;
	
	private JButton btnJg;
	private JButton btnLj;
	private JButton btnCtrl;

	
    public MainSwing(){   
    	janela = new JFrame();
		
		// painel
		painel = new JPanel();
		painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		painel.setLayout(new GridLayout(0,1));
		
		
		/* COMPONENTES DA TELA */
		// titulo
		lbltitulo = new JLabel("Sistema de Venda de Jogos");
		lbltitulo.setFont(new Font("Verdana", Font.BOLD, 20));
		painel.add(lbltitulo);
		
		
		// grupo
		lblGrupo = new JLabel("Grupo: Jorbe Junior e Nathália Fortunato");
		lblGrupo.setFont(new Font("Verdana", Font.BOLD, 10));
		painel.add(lblGrupo);
		
		
		// Jogo
		btnJg = new JButton("Jogo");
		btnJg.addActionListener(this);
		painel.add(btnJg);
		
		
		// Loja
		btnLj = new JButton("Loja");
		btnLj.addActionListener(this);
		painel.add(btnLj);
		
		
		// Controle
		btnCtrl = new JButton("Controle");
		btnCtrl.addActionListener(this);
		painel.add(btnCtrl);
		
		
		// janela
		janela.add(painel, BorderLayout.CENTER);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Tela Principal");
		janela.setSize(500, 500);
		janela.pack();
		janela.setVisible(true);
	}
    

	@Override
	public void actionPerformed(ActionEvent e) {
		// funcionamento dos botões
		if(e.getSource() == btnJg) {
            janela.dispose();
            new JogoView();
		}
		else if(e.getSource() == btnLj) {
            janela.dispose();
            new LojaView();
		}
		else if(e.getSource() == btnCtrl) {
            janela.dispose();
            new ControleView();
		}
	}
	
}