/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

import javax.swing.*;

public class Welcome {

    private JFrame janela;
    private JPanel painel;

    private JLabel lblWel;
    
    public Welcome(){   
        // frame
        janela = new JFrame();


        // panel
        painel = new JPanel();
        janela.add(painel);
        painel.setLayout(null);


        // lbl Welcome
        lblWel = new JLabel("Bem-vindo!");
        lblWel.setBounds(10, 20, 80, 25);
        painel.add(lblWel);


        // frame
        janela.setSize(350, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Welcome");
        janela.setVisible(true);
    }
}