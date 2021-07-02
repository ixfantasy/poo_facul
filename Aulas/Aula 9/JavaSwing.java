/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

import javax.swing.*;
import java.awt.event.*;


public class JavaSwing {

    public static void main(String[] args){

        JFrame fr = new JFrame("Calculadora");

        // TEXTFIELD
        final JTextField tf1 = new JTextField();
        tf1.setBounds(120, 55, 150, 20);

        final JTextField tf2 = new JTextField();
        tf2.setBounds(120, 105, 150, 20);


        // LABEL
        JLabel l1, l2, l3, l4;
        l1 = new JLabel("Número 1: ");
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("Número 2: ");
        l2.setBounds(50, 100, 100, 30);

        l3 = new JLabel("Resultado da Soma: .......");
        l3.setBounds(50, 150, 250, 20);

        l4 = new JLabel("CALCULADORA");
        l4.setBounds(130, 10, 100, 40);


        // BUTTON
        JButton bt = new JButton("Somar");
        bt.setBounds(130, 200, 100, 40);
        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1 = tf1.getText();
                String s2 = tf2.getText();

                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);

                l3.setText("Resultado da Soma: " + (a+b));
            }
        });


        fr.add(l1); fr.add(l2); fr.add(l3); fr.add(l4);
        fr.add(tf1); fr.add(tf2);
        fr.add(bt);

        fr.setSize(400, 300);
        fr.setLayout(null);
        fr.setVisible(true);
    }
}