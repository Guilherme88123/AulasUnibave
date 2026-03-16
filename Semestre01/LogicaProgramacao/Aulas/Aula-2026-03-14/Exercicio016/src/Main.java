import javax.swing.*;

void main()
{
    try
    {
        String n1String = JOptionPane.showInputDialog("Digite um número:");
        String n2String = JOptionPane.showInputDialog("Digite outro número:");

        double n1 = Double.parseDouble(n1String);
        double n2 = Double.parseDouble(n2String);

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;

        JOptionPane.showMessageDialog(null,
                "Números: " + n1 + ", " + n2
                        + "\nSoma: " + soma
                        + "\nSubtração: " + subtracao
                        + "\nMultiplicação: " + multiplicacao
                        + "\nDivisão: " + divisao);
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Números Inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}