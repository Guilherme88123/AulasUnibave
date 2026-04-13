import javax.swing.*;

void main()
{
    try
    {
        int maiorNro = 0;

        for (int i = 1; i <= 5; i++)
        {
            String nroString = JOptionPane.showInputDialog("Digite o " + i + "° Número: ");

            int nro = Integer.parseInt(nroString);

            if (i == 1)
            {
                maiorNro = nro;
            }
            else
            {
                maiorNro = nro > maiorNro ? nro : maiorNro;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maiorNro);
    }
    catch (Exception ex)
    {
        JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
    }
}