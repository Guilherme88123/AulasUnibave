import javax.swing.*;

void main()
{
    StaticList list = new StaticList();

    int option = -1;
    while (option != 0)
    {
        option = GetOption();

        switch (option)
        {
            case 1:
                ExecuteAdding(list);
                break;
            case 2:
                ExecuteList(list);
                break;
            case 3:
                ExecuteSearch(list);
                break;
            case 4:
                ExecuteRemove(list);
                break;
            case 5:
                ExecuteMinAndMax(list);
                break;
            case 0:
                ExecuteExit();
                break;
            default:
                ExecuteInvalidOption();
                break;
        }
    }
}

private static int GetOption()
{
    String menu = "1 - Adicionar\n" +
        "2 - Listar\n" +
        "3 - Buscar\n" +
        "4 - Remover\n" +
        "5 - Maior e Menor\n" +
        "0 - Sair";

    try
    {
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
    catch (Exception ex)
    {
        return -1;
    }
}

private static void ExecuteAdding(StaticList list)
{
    int number = GetNumber();

    boolean success = list.Add(number);

    String textList = "Lista atual: " + GetVisibleList(list.GetAll());

    if (success)
    {
        JOptionPane.showMessageDialog(null,
                "Número " + number + " adicionado com sucesso! \n" + textList,
                "Atenção",
                JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    JOptionPane.showMessageDialog(null,
            "Erro ao adicionar número " + number + ": Lista Cheia! \n" + textList,
            "Erro",
            JOptionPane.ERROR_MESSAGE);
}

private static void ExecuteList(StaticList list)
{
    String textList = "Lista atual: " + GetVisibleList(list.GetAll());

    JOptionPane.showMessageDialog(null,
            textList,
            "Atenção",
            JOptionPane.INFORMATION_MESSAGE);
}

private static void ExecuteSearch(StaticList list)
{
    int notFoundPosition = -1;

    int number = GetNumber();

    int position = list.GetIndex(number);

    String textList = "Lista atual: " + GetVisibleList(list.GetAll());

    if (position == notFoundPosition)
    {
        JOptionPane.showMessageDialog(null,
                "Número " + number + " não encontrado! \n" + textList,
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        return;
    }

    JOptionPane.showMessageDialog(null,
            "Número " + number + " encontrado na posição: " + position + " (" + (position + 1) + "° elemento)" + " \n" + textList,
            "Atenção",
            JOptionPane.INFORMATION_MESSAGE);
}

private static void ExecuteRemove(StaticList list)
{
    int position = GetPosition();

    boolean success = list.DeleteByIndex(position);

    String textList = "Lista atual: " + GetVisibleList(list.GetAll());

    if (success)
    {
        JOptionPane.showMessageDialog(null,
                "Posição " + position + " deleteda com sucesso!: \n" + textList,
                "Atenção",
                JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    JOptionPane.showMessageDialog(null,
            "Posição " + position + " não está presente! \n" + textList,
            "Erro",
            JOptionPane.ERROR_MESSAGE);
}

private static void ExecuteMinAndMax(StaticList list)
{
    int min = list.GetMin();
    int max = list.GetMax();

    boolean isEmptyList = min == -1 && max == -1;

    if (isEmptyList)
    {
        JOptionPane.showMessageDialog(null,
                "Lista vazia! \n",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        return;
    }

    String textList = "Lista atual: " + GetVisibleList(list.GetAll());
    String text = "Menor valor: " + min + " \nMaior valor: " + max + " \n" + textList;

    JOptionPane.showMessageDialog(null,
            text,
            "Atenção",
            JOptionPane.INFORMATION_MESSAGE);
    return;
}

private static void ExecuteInvalidOption()
{
    JOptionPane.showMessageDialog(null, "Opção inválida!", "Atenção", JOptionPane.ERROR_MESSAGE);
}

private static void ExecuteExit()
{
    JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
}

private static String GetVisibleList(int[] array)
{
    String list = "";

    for (int i = 0; i < array.length; i++)
    {
        if (i == 0)
        {
            list += array[i];
            continue;
        }

        list += ", " + array[i];
    }

    return list;
}

private static int GetNumber()
{
    while (true)
    {
        try
        {
            return Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Numero inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
}

private static int GetPosition()
{
    while (true)
    {
        try
        {
            int position = Integer.parseInt(JOptionPane.showInputDialog("Informe uma posição para deletar: "));

            if (position < 0)
                throw new Exception();

            return position;
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Posição inválida!", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
}


