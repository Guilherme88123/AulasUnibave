import javax.swing.*;

void main()
{
    int opcao = -1;

    while (opcao != 0)
    {
        try
        {
            String menu = "=== MENU ===\n" +
                    "1 - Visualizar números de 1 - 10\n" +
                    "2 - Visualizar tabuada do número 5\n" +
                    "3 - Visualizar números pares até X\n" +
                    "4 - Visualizar a soma de 1 - 100\n" +
                    "0 - Sair\n" +
                    "Escolha uma opção: ";

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao)
            {
                case 1:
                    numeros1a10();
                    break;
                case 2:
                    tabuada5();
                    break;
                case 3:
                    numerosPares();
                    break;
                case 4:
                    soma1a100();
                    break;
                case 0:
                    mensagemSaida();
                    break;
                default:
                    throw new Exception("");
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Opção inválida! \nTente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

public static void numeros1a10()
{
    String mensagemNumeros = "";

    for (int i = 1; i <= 10; i++)
    {
        mensagemNumeros += (i + "");
        if (i != 10)
        {
            mensagemNumeros += ", ";
        }
    }

    JOptionPane.showMessageDialog(null, "Números de 1 a 10: \n" + mensagemNumeros, "Opção 1", JOptionPane.INFORMATION_MESSAGE);
}

public static void tabuada5()
{
    String mensagemTabuada = "";
    int fator = 5;

    for (int i = 1; i <= 10; i++)
    {
        mensagemTabuada += (fator + " x " + i + " = " + (fator * i));
        if (i != 10)
        {
            mensagemTabuada += "\n";
        }
    }

    JOptionPane.showMessageDialog(null, "Tabuada do número 5: \n" + mensagemTabuada, "Opção 2", JOptionPane.INFORMATION_MESSAGE);
}

public static void numerosPares()
{
    int numeroX = Integer.parseInt(JOptionPane.showInputDialog("Informe o número X: "));

    String mensagemNumeros = "";

    for (int i = 1; i <= numeroX; i++)
    {
        if (i % 2 != 0) continue;

        mensagemNumeros += (i + "");
        if (i != numeroX)
        {
            mensagemNumeros += ", ";
        }
    }

    JOptionPane.showMessageDialog(null, "Números pares de 1 a " + numeroX + ": \n" + mensagemNumeros, "Opção 3", JOptionPane.INFORMATION_MESSAGE);
}

public static void soma1a100()
{
    int numeroX = 100;
    int soma = 0;

    for (int i = 1; i <= numeroX; i++)
    {
        soma += i;
    }

    JOptionPane.showMessageDialog(null, "Soma dos números de 1 a " + numeroX + ": \n" + soma, "Opção 4", JOptionPane.INFORMATION_MESSAGE);
}

public static void mensagemSaida()
{
    String mensagemSaida = "Obrigado pela utilização! \nVolte sempre";
    JOptionPane.showMessageDialog(null, mensagemSaida, "Opção 0", JOptionPane.INFORMATION_MESSAGE);
}