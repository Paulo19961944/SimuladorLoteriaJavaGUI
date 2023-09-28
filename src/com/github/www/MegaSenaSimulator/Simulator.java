package com.github.www.MegaSenaSimulator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simulator {
    // Atributos JLabel
    private JLabel titulo, numero1, numero2, numero3, numero4, numero5, numero6;
    // Atributos Input
    private JTextField input1, input2, input3, input4, input5, input6;
    // Botão
    private JButton button;
    private Integer resultado1, resultado2, resultado3, resultado4, resultado5, resultado6;

    public Simulator() {
        // Instancia a Classe JFrame
        JFrame jFrame = new JFrame();

        // Configuração da Interface
        jFrame.setTitle("Simulador da Mega Sena");
        jFrame.setSize(768, 700);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);

        // Configura o Fundo
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(240, 240, 240));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setLayout(null);
        jFrame.setContentPane(panel);

        // Configura os Componentes
        titulo = new JLabel("Simulador da Mega Sena");
        titulo.setFont(new Font("Montserrat", Font.BOLD, 28));
        titulo.setForeground(new Color(75, 75, 75));
        titulo.setBounds(210, 30, 400, 36);
        panel.add(titulo);

        numero1 = new JLabel("Digite o Numero 1:");
        numero1.setFont(new Font("Montserrat", Font.ITALIC, 18));
        numero1.setForeground(new Color(75, 75, 75));
        numero1.setBounds(50, 130, 200, 30);
        panel.add(numero1);

        input1 = new JTextField();
        input1.setFont(new Font("Montserrat", Font.PLAIN, 18));
        input1.setBackground(new Color(75, 75, 75));
        input1.setForeground(new Color(240, 240, 240));
        input1.setBounds(220, 130, 500, 30);
        panel.add(input1);

        numero2 = new JLabel("Digite o Numero 2:");
        numero2.setFont(new Font("Montserrat", Font.ITALIC, 18));
        numero2.setForeground(new Color(75, 75, 75));
        numero2.setBounds(50, 180, 200, 30);
        panel.add(numero2);

        input2 = new JTextField();
        input2.setFont(new Font("Montserrat", Font.PLAIN, 18));
        input2.setBackground(new Color(75, 75, 75));
        input2.setForeground(new Color(240, 240, 240));
        input2.setBounds(220, 180, 500, 30);
        panel.add(input2);

        numero3 = new JLabel("Digite o Numero 3:");
        numero3.setFont(new Font("Montserrat", Font.ITALIC, 18));
        numero3.setForeground(new Color(75, 75, 75));
        numero3.setBounds(50, 230, 200, 30);
        panel.add(numero3);

        input3 = new JTextField();
        input3.setFont(new Font("Montserrat", Font.PLAIN, 18));
        input3.setBackground(new Color(75, 75, 75));
        input3.setForeground(new Color(240, 240, 240));
        input3.setBounds(220, 230, 500, 30);
        panel.add(input3);

        numero4 = new JLabel("Digite o Numero 4:");
        numero4.setFont(new Font("Montserrat", Font.ITALIC, 18));
        numero4.setForeground(new Color(75, 75, 75));
        numero4.setBounds(50, 280, 200, 30);
        panel.add(numero4);

        input4 = new JTextField();
        input4.setFont(new Font("Montserrat", Font.PLAIN, 18));
        input4.setBackground(new Color(75, 75, 75));
        input4.setForeground(new Color(240, 240, 240));
        input4.setBounds(220, 280, 500, 30);
        panel.add(input4);

        numero5 = new JLabel("Digite o Numero 5:");
        numero5.setFont(new Font("Montserrat", Font.ITALIC, 18));
        numero5.setForeground(new Color(75, 75, 75));
        numero5.setBounds(50, 330, 200, 30);
        panel.add(numero5);

        input5 = new JTextField();
        input5.setFont(new Font("Montserrat", Font.PLAIN, 18));
        input5.setBackground(new Color(75, 75, 75));
        input5.setForeground(new Color(240, 240, 240));
        input5.setBounds(220, 330, 500, 30);
        panel.add(input5);

        numero6 = new JLabel("Digite o Numero 6:");
        numero6.setFont(new Font("Montserrat", Font.ITALIC, 18));
        numero6.setForeground(new Color(75, 75, 75));
        numero6.setBounds(50, 380, 200, 30);
        panel.add(numero6);

        input6 = new JTextField();
        input6.setFont(new Font("Montserrat", Font.PLAIN, 18));
        input6.setBackground(new Color(75, 75, 75));
        input6.setForeground(new Color(240, 240, 240));
        input6.setBounds(220, 380, 500, 30);
        panel.add(input6);

        button = new JButton("Clique Aqui");
        button.setBackground(new Color(2, 100, 200));
        button.setForeground(new Color(240, 240, 240));
        button.setBounds(50, 470, 100, 30);
        panel.add(button);

        // Sorteia os Seis Numeros de 1 a 60
        resultado1 = (int) (Math.random() * 61);
        resultado2 = (int) (Math.random() * 61);
        resultado3 = (int) (Math.random() * 61);
        resultado4 = (int) (Math.random() * 61);
        resultado5 = (int) (Math.random() * 61);
        resultado6 = (int) (Math.random() * 61);

        // Adiciona Evento ao Botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Captura os Inputs como Strings
                String num1Str = input1.getText();
                String num2Str = input2.getText();
                String num3Str = input3.getText();
                String num4Str = input4.getText();
                String num5Str = input5.getText();
                String num6Str = input6.getText();

                try {
                    // Converte os Inputs em Inteiros
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);
                    int num3 = Integer.parseInt(num3Str);
                    int num4 = Integer.parseInt(num4Str);
                    int num5 = Integer.parseInt(num5Str);
                    int num6 = Integer.parseInt(num6Str);

                    // Verifica se os números estão corretos
                    if (num1 == resultado1 && num2 == resultado2 && num3 == resultado3
                            && num4 == resultado4 && num5 == resultado5 && num6 == resultado6) {
                        JOptionPane.showMessageDialog(null, "Você acertou!!! O Resultado é: " + resultado1 + " " + resultado2 + " " + resultado3 + " " + resultado4 + " " + resultado5 + " " + resultado6);
                    } else {
                        JOptionPane.showMessageDialog(null, "Mais sorte na Próxima. O Resultado é: " + resultado1 + " " + resultado2 + " " + resultado3 + " " + resultado4 + " " + resultado5 + " " + resultado6);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.");
                }
            }
        });
        // Torna visível a interface
        jFrame.setVisible(true);
    }
}
