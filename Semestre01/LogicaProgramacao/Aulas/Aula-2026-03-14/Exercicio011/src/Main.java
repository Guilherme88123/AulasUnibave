import javax.swing.*;

void main()
{
    try
    {
        String baseString = JOptionPane.showInputDialog("Digite a base de um retângulo:");
        String alturaString = JOptionPane.showInputDialog("Digite a altura de um retângulo:");

        double base = Double.parseDouble(baseString);
        double altura = Double.parseDouble(alturaString);

        double area = base * altura;

        JOptionPane.showMessageDialog(null,
                "Base: " + base + "m"
                    + "\nAltura: " + altura + "m"
                    + "\nÁrea: " + area + "m²");
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Números Inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}