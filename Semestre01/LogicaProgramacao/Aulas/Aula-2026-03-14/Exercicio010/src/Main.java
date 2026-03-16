import javax.swing.*;

void main()
{
    try
    {
        String idadeString = JOptionPane.showInputDialog("Digite a sua idade:");

        int idade = Integer.parseInt(idadeString);

        int idadeEmMeses = idade * 12;

        JOptionPane.showMessageDialog(null, "Idade em Anos: " + idade
                + "\nIdade em Meses: " + idadeEmMeses);
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Números Inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}