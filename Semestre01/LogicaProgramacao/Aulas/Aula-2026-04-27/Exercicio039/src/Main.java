import javax.swing.*;

void main()
{
    try
    {
        int i = 1;
        int maior = 0;

        while (i <= 5)
        {
            String nString = JOptionPane.showInputDialog("Digite o " + i + "° número: ");

            int n = Integer.parseInt(nString);

            if (i == 1 || n > maior)
            {
                maior = n;
            }

            i++;
        }

        System.out.println("O maior número digitado foi: " + maior);
    }
    catch (Exception ex)
    {
        ex.printStackTrace();
    }
}