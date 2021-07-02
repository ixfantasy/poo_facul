/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    private JFrame janela;
    private JPanel painel;

    private JLabel lblUser;
    private JLabel lblPass;
    private JLabel lblResul;

    private JTextField txtUser;

    private JPasswordField pssPass;

    private JButton btnLog;


    public Login(){

        // frame
        janela = new JFrame();


        // panel
        painel = new JPanel();
        janela.add(painel);
        painel.setLayout(null);


        // lbl Usuário
        lblUser = new JLabel("Usuário");
        lblUser.setBounds(10, 20, 80, 25);
        painel.add(lblUser);


        // txt Usuário
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

    public static void main(String[] args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           String user = txtUser.getText();  
           String pass = new String(pssPass.getPassword());

           System.out.println(user + ", " + pass);

           if(user.equals("nath") && pass.equals("123")){
               lblResul.setText("ACESSO PERMITIDO");

               janela.dispose();
               new Welcome();
           }
           else {
               lblResul.setText("ACESSO NEGADO");
           }
    }
}