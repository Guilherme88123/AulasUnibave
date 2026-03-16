import javax.swing.*;

void main()
{
    try
    {
        String metroString = JOptionPane.showInputDialog("Digite uma metragem:");

        double metro = Double.parseDouble(metroString);
        double centimetros = metro * 100;

        JOptionPane.showMessageDialog(null,
                "Metros: " + metro + "m"
                        + "\nCentímetros: " + centimetros + "cm");
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Números Inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}