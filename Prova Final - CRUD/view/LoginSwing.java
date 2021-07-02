/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginSwing implements ActionListener {
	
    private JFrame janela;
    private JPanel painel;

    private JLabel lblUser;
    private JLabel lblPass;
    private JLabel lblResul;

    private JTextField txtUser;

    private JPasswordField pssPass;

    private JButton btnLog;
    
    public LoginSwing(){

        // frame
        janela = new JFrame();


        // panel
        painel = new JPanel();
        janela.add(painel);
        painel.setLayout(null);


        // lbl Usuario
        lblUser = new JLabel("Usuario");
        lblUser.setBounds(10, 20, 80, 25);
        painel.add(lblUser);


        // txt Usuario
        txtUser = new JTextField(20);
        txtUser.setBounds(100, 20, 165, 25);
        painel.add(txtUser);


        // lbl Senha
        lblPass = new JLabel("Senha");
        lblPass.setBounds(10, 50, 80, 25);
        painel.add(lblPass);


        // pss Senha
        pssPass = new JPasswordField();
        pssPass.setBounds(100, 50, 165, 25);
        painel.add(pssPass);


        // btn Login
        btnLog = new JButton("Login");
        btnLog.setBounds(10, 80, 80, 25);
        btnLog.addActionListener(this);
        painel.add(btnLog);


        // lbl Resul
        lblResul = new JLabel("");
        lblResul.setBounds(10, 110, 300, 25);
        painel.add(lblResul);


        // frame
        janela.setSize(350, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Login");
        janela.setVisible(true);
    }
    
    // MAIN
    public static void main(String[] args){
        new LoginSwing();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = txtUser.getText();  
        String pass = new String(pssPass.getPassword());

        System.out.println(user + ", " + pass);

        if(user.equals("alex") && pass.equals("123")){
            lblResul.setText("ACESSO PERMITIDO");

            janela.dispose();
            new MainSwing();
        }
        else {
            lblResul.setText("ACESSO NEGADO");
        }
	}
}