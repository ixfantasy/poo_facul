/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora implements ActionListener {

    private JFrame janela;
    private JPanel painel;

    private JLabel lbltitulo;
    private JLabel lblNum1;
    private JLabel lblNum2;
    private JLabel lblResul;

    private JTextField txtNum1;
    private JTextField txtNum2;

    private JButton btnSomar;
    private JButton btnDiv;
    private JButton btnMult;
    private JButton btnSub;

    public Calculadora(){

        janela = new JFrame();

        painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
        painel.setLayout(new GridLayout(0, 1));


        // componentes da tela
        lbltitulo = new JLabel("Calculadora");
        lbltitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        painel.add(lbltitulo);

        // num1
        lblNum1 = new JLabel("Num 1");
        painel.add(lblNum1);

        txtNum1 = new JTextField("0");
        painel.add(txtNum1);


        // num2
        lblNum2 = new JLabel("Num 2");
        painel.add(lblNum2);

        txtNum2 = new JTextField("0");
        painel.add(txtNum2);


        // Somar
        btnSomar = new JButton("Somar (+)");
        btnSomar.addActionListener(this);
        painel.add(btnSomar);


        // Dividir
        btnDiv = new JButton("Dividir (/)");
        btnDiv.addActionListener(this);
        painel.add(btnDiv);


        // Multiplicar
        btnMult = new JButton("Multiplicar (x)");
        btnMult.addActionListener(this);
        painel.add(btnMult);


        // Subtrair
        btnSub = new JButton("Subtrair (-)");
        btnSub.addActionListener(this);
        painel.add(btnSub);


        // resul
        lblResul = new JLabel("Resultado = ");
        lblResul.setFont(new Font("Verdana", Font.BOLD, 18));
        lblResul.setForeground(Color.PINK);
        painel.add(lblResul);

        
        janela.add(painel, BorderLayout.CENTER);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para fechar e liberar memória
        janela.setTitle("Tela1 - Calculadora");
        janela.setSize(500, 500);
        janela.pack();
        janela.setVisible(true);
    }

    public static void main(String[] args){
        new Calculadora();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Matematica mat = new Matematica();

        try {
            Integer num1 = Integer.parseInt(txtNum1.getText());
            Integer num2 = Integer.parseInt(txtNum2.getText());

            if(e.getSource() == btnSomar){
                lblResul.setText("Resultado = " + mat.somar(num1, num2));
            }
            else if(e.getSource() == btnDiv){
                lblResul.setText("Resultado = " + mat.dividir(num1, num2));
            }
            else if(e.getSource() == btnMult){
                lblResul.setText("Resultado = " + mat.multiplicar(num1, num2));
            }
            else if(e.getSource() == btnSub){
                lblResul.setText("Resultado = " + mat.subtrair(num1, num2));
            }

        } catch (NumberFormatException f) {
            lblResul.setText("Digite apenas números!");
            System.out.println(f.getMessage());
        }
    }   
}