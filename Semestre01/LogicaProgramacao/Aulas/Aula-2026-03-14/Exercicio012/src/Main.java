import javax.swing.*;

void main()
{
    try
    {
        String celsiusString = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:");

        double celsius = Double.parseDouble(celsiusString);

        double fahrenheit  = (celsius * 9 / 5) + 32;

        JOptionPane.showMessageDialog(null,
                "Celsius: " + celsius + "°"
                        + "\nFahrenheit: " + fahrenheit + "°");
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Números Inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}