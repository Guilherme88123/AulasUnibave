import javax.swing.*;

void main()
{
    try
    {
        String nString = JOptionPane.showInputDialog("Digite um número: ");

        int n = Integer.parseInt(nString);
        int i = 1;

        while (i < n)
        {
            if (i % 2 == 0)
            {
                System.out.println("Número par: " + i);
            }
            i++;
        }
    }
    catch (Exception ex)
    {
        ex.printStackTrace();
    }
}