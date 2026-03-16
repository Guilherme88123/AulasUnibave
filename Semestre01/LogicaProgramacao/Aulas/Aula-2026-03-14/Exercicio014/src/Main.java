import javax.swing.*;

void main()
{
    try
    {
        String numeroString = JOptionPane.showInputDialog("Digite um número:");

        int numero = Integer.parseInt(numeroString);
        int dobro = numero * 2;

        JOptionPane.showMessageDialog(null,
                "Número: " + numero
                        + "\nDobro: " + dobro);
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Números Inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}