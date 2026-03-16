import javax.swing.*;

void main()
{
    try
    {
        String n1String = JOptionPane.showInputDialog("Digite um número:");
        String n2String = JOptionPane.showInputDialog("Digite outro número:");

        int n1 = Integer.parseInt(n1String);
        int n2 = Integer.parseInt(n2String);

        JOptionPane.showMessageDialog(null, "Soma de " + n1 + " e " + n2 + ": " + (n1 + n2));
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Números Inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}