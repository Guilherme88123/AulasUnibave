import javax.swing.*;

void main()
{
    try
    {
        String salarioString = JOptionPane.showInputDialog("Digite o salário sujeito à aumento de 10%:");

        double salario = Double.parseDouble(salarioString);

        double salarioMaior  = salario * 1.1;

        JOptionPane.showMessageDialog(null,
                "Salário: R$" + salario
                        + "\nSalário com 10% de aumento: R$" + salarioMaior);
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Números Inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}