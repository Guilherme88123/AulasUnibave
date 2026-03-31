import javax.swing.*;

void main()
{
    try
    {
        JOptionPane.showMessageDialog(null, "Bem vindo ao Calculador de Bhaskara!");
        String aString = JOptionPane.showInputDialog("Digite o valor para 'a': ");
        String bString = JOptionPane.showInputDialog("Digite o valor para 'b': ");
        String cString = JOptionPane.showInputDialog("Digite o valor para 'c': ");

        double a = Double.parseDouble(aString);
        double b = Double.parseDouble(bString);
        double c = Double.parseDouble(cString);

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / 2 * a;
        double x2 = (-b - Math.sqrt(delta)) / 2 * a;

        JOptionPane.showMessageDialog(null, "Com as variáveis a, b e c como: " +
                a + ", " + b + " e " + c + " obtivemos o seguinte conjunto solução: S = {" + x1 + ", " + x2 + "}");
    }
    catch (Exception ex)
    {
        JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
    }
}