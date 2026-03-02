import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Teste002 (Usando o Swing)");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelNome = new JLabel("Digite seu Nome:");
        labelNome.setBounds(20, 20, 150, 25);
        frame.add(labelNome);
        JTextField textFieldNome = new JTextField();
        textFieldNome.setBounds(20, 50, 200, 25);
        frame.add(textFieldNome);

        JLabel labelIdade = new JLabel("Digite sua Idade:");
        labelIdade.setBounds(20, 100, 150, 25);
        frame.add(labelIdade);
        JTextField textFieldIdade = new JTextField();
        textFieldIdade.setBounds(20, 130, 200, 25);
        frame.add(textFieldIdade);

        JLabel labelAltura = new JLabel("Digite sua Altura:");
        labelAltura.setBounds(20, 180, 150, 25);
        frame.add(labelAltura);
        JTextField textFieldAltura = new JTextField();
        textFieldAltura.setBounds(20, 210, 200, 25);
        frame.add(textFieldAltura);

        int widthButton = 100;

        JButton button = new JButton("Saudar");
        button.setBounds(frame.getWidth() / 2 - widthButton / 2, frame.getHeight() - 100, widthButton, 30);
        frame.add(button);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String nome = textFieldNome.getText();
                String idadeString = textFieldIdade.getText();
                String alturaString = textFieldAltura.getText();

                int idade;
                double altura;

                try
                {
                    idade = Integer.parseInt(idadeString);
                    altura = Double.parseDouble(alturaString);
                }
                catch (Exception ex)
                {
                    AvisarDadosIncorretos(frame);
                    return;
                }

                Saudar(frame, nome, idade, altura);
            }
        });

        frame.setVisible(true);
    }

    public static void Saudar(JFrame frame, String nome, int idade, double altura)
    {
        JOptionPane.showMessageDialog(frame,
                "Olá, " + nome + "! \nIdade: " + idade + " \nAltura: " + altura,
                "Saudação",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void AvisarDadosIncorretos(JFrame frame)
    {
        JOptionPane.showMessageDialog(frame,
                "Verifique os dados preencidos!",
                "Dados Inválidos",
                JOptionPane.ERROR_MESSAGE);
    }
}