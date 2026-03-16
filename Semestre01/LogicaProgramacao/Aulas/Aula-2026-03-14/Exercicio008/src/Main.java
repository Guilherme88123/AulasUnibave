import javax.swing.*;

void main()
{
    try
    {
        String n1String = JOptionPane.showInputDialog("Digite um número:");

        int n1 = Integer.parseInt(n1String);

        JOptionPane.showMessageDialog(null, "Número " + n1 + "\nAntecessor: " + (n1 - 1) + "\nSucessor: " + (n1 + 1));
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Número Inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}