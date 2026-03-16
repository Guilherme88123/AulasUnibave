import javax.swing.*;

void main()
{
    try
    {
        String nota1String = JOptionPane.showInputDialog("Digite a primeira nota:");
        String nota2String = JOptionPane.showInputDialog("Digite a segunda nota:");
        String nota3String = JOptionPane.showInputDialog("Digite a terceira nota:");

        double nota1 = Double.parseDouble(nota1String);
        double nota2 = Double.parseDouble(nota2String);
        double nota3 = Double.parseDouble(nota3String);

        double media = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(null, "Notas: " + nota1 + ", " + nota2 + ", " + nota3
                + "\nMédia Final: " + media);
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Números Inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}