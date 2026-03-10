import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            String n1String = JOptionPane.showInputDialog("Digite o Número 1");
            String n2String = JOptionPane.showInputDialog("Digite o Número 2");

            int n1 = Integer.parseInt(n1String);
            int n2 = Integer.parseInt(n2String);

            int soma = n1 + n2;
            int multiplicacao = n1 * n2;
            double divisao = (double) n1 / n2;
            int divisaoInteira = n1 / n2;

            String message = "Números: " + n1 + ", " + n2 + "\n" +
                    "Soma: " + soma + "\n" +
                    "Multiplicação: " + multiplicacao + "\n" +
                    "Divisão: " + divisao + "\n" +
                    "Divisão (Inteira): " + divisaoInteira;

            JOptionPane.showMessageDialog(null, message, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Dados inseridos são inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}