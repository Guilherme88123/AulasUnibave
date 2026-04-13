import javax.swing.*;

void main()
{
    try
    {
        String nroString = JOptionPane.showInputDialog("Insira um número: ");

        int nro = Integer.parseInt(nroString);

        String nros = "";

        for (int i = 1; i <= nro; i++)
        {
            if (i % 2 != 0)
            {
                continue;
            }

            nros += nros.equals("") ? i : ", " + i;
        }

        JOptionPane.showMessageDialog(null, nros, "Números pares de 1 até " + nro, JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception ex)
    {
        JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
    }
}