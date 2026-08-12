import javax.swing.*;

void main()
{
    // EXERCÍCIO 1
    Exercicio01();

    // EXERCÍCIO 2
    Exercicio02();

    // EXERCÍCIO 3
    Exercicio03();

    // EXERCÍCIO 4
    Exercicio04();

    // EXERCÍCIO 5
    Exercicio05();

    // EXERCÍCIO 6
    Exercicio06();

    // EXERCÍCIO 7
    Exercicio07();

    // EXERCÍCIO 8
    Exercicio08();

    // EXERCÍCIO 9
    Exercicio09();

    // EXERCÍCIO 10
    Exercicio10();

    // EXERCÍCIO 11
    Exercicio11();

    // EXERCÍCIO 12
    Exercicio12();

    // EXERCÍCIO 13
    Exercicio13();

    // EXERCÍCIO 14
    Exercicio14 ();

    // EXERCÍCIO 15
    Exercicio15();
}

private static void Exercicio01()
{
    int[] array = new int[5];

    array[0] = 10;
    array[1] = 20;
    array[2] = 30;
    array[3] = 40;
    array[4] = 50;
    
    for (int i = 0; i < array.length; i++)
        System.out.println(array[i]);
}

private static void Exercicio02()
{
    int[] numeros = {5, 10, 15, 20, 25};

    numeros[2] = 100;

    for (int i = 0; i < numeros.length; i++)
        System.out.println(numeros[i]);
}

private static void Exercicio03()
{
    String[] nomes = new String[5];

    for (int i = 0; i < nomes.length; i++)
    {
        nomes[i] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "° nome: ");
    }

    for (int i = 0; i < nomes.length; i++)
        System.out.println(nomes[i]);
}

private static void Exercicio04()
{
    int[] numeros = new int[6];

    for (int i = 0; i < numeros.length; i++)
    {
        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número: "));
    }

    int soma = 0;
    for (int i = 0; i < numeros.length; i++)
        soma += numeros[i];

    System.out.println("soma = " + soma);
}

private static void Exercicio05()
{
    double[] notas = new double[5];

    for (int i = 0; i < notas.length; i++)
    {
        notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i + 1) + "° nota: "));
    }

    double soma = 0;
    for (int i = 0; i < notas.length; i++)
        soma += notas[i];

    double media = (double) soma / notas.length;

    for (int i = 0; i < notas.length; i++)
        System.out.println("Nota " + (i + 1) + ": " + notas[i]);
    System.out.println("Média: " + media);
}

private static void Exercicio06()
{
    int[] numeros = {12, 7, 25, 4, 30, 18};

    int max = 0;

    for (int i = 0; i < numeros.length; i++)
    {
        if (i == 0)
        {
            max = numeros[i];
            continue;
        }

        if (numeros[i] > max)
            max = numeros[i];
    }

    System.out.println("max = " + max);
}

private static void Exercicio07()
{
    int[] numeros = {12, 7, 25, 4, 30, 18};

    int min = 0;

    for (int i = 0; i < numeros.length; i++)
    {
        if (i == 0)
        {
            min = numeros[i];
            continue;
        }

        if (numeros[i] < min)
            min = numeros[i];
    }

    System.out.println("min = " + min);
}

private static void Exercicio08()
{
    int[] numeros = new int[10];

    for (int i = 0; i < numeros.length; i++)
    {
        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número: "));
    }

    int qtPares = 0;
    int qtImpares = 0;

    for (int i = 0; i < numeros.length; i++)
    {
        if (numeros[i] % 2 == 0)
            qtPares++;
        else
            qtImpares++;
    }

    System.out.println("Número de pares: " + qtPares + ", número de ímpares: " + qtImpares);
}

private static void Exercicio09()
{
    int[] numeros = {10, 20, 30, 40, 50};

    for (int i = numeros.length - 1; i >= 0; i--)
        System.out.println(numeros[i]);
}

private static void Exercicio10()
{
    int[] numeros = {8, 15, 22, 30, 41, 50};

    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

    boolean achou = false;
    for (int i = 0; i < numeros.length; i++)
    {
        if (numeros[i] == numero)
        {
            achou = true;
            break;
        }
    }

    if (achou)
        System.out.println("Achou o número " + numero);
    else
        System.out.println("Não achou o número: " + numero);
}

private static void Exercicio11()
{
    int[] numeros = {8, 15, 22, 30, 41, 50};

    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

    boolean achou = false;
    int posicao = -1;

    for (int i = 0; i < numeros.length; i++)
    {
        if (numeros[i] == numero)
        {
            achou = true;
            posicao = i;
            break;
        }
    }

    if (achou)
        System.out.println("Achou o número " + numero + " na posição " + posicao);
    else
        System.out.println("Não achou o número: " + numero);
}

private static void Exercicio12()
{
    double[] notas = new double[6];

    for (int i = 0; i < notas.length; i++)
    {
        notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i + 1) + "° nota: "));
    }

    double soma = 0;
    for (int i = 0; i < notas.length; i++)
        soma += notas[i];

    double media = (double) soma / notas.length;

    System.out.println("Notas que ficaram acima da média " + media);
    for (int i = 0; i < notas.length; i++)
    {
        if (notas[i] < media)
            continue;

        System.out.println("Nota " + (i + 1) + ": " + notas[i]);
    }
}

private static void Exercicio13()
{
    int[] numeros = new int[8];

    for (int i = 0; i < numeros.length; i++)
    {
        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número: "));
    }

    int qtMaioresQue10 = 0;

    for (int i = 0; i < numeros.length; i++)
    {
        if (numeros[i] > 10)
            qtMaioresQue10++;
    }

    System.out.println("Quantidade de números maiores que 10: " + qtMaioresQue10);
}

private static void Exercicio14()
{
    int[] numeros = new int[7];

    for (int i = 0; i < numeros.length; i++)
    {
        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número: "));
    }

    System.out.println("Primeiro número: " + numeros[0] + ", último número: " + numeros[numeros.length - 1]);
}

private static void Exercicio15()
{
    double[] temperaturas = new double[7];

    for (int i = 0; i < temperaturas.length; i++)
    {
        temperaturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura do " + (i + 1) + "° dia: "));
    }

    double soma = 0;
    double min = 0;
    double max = 0;

    for (int i = 0; i < temperaturas.length; i++)
    {
        double temperatura = temperaturas[i];

        if (i == 0)
            min = max = temperatura;

        if (temperatura > max)
            max = temperatura;

        if (temperatura < min)
            min = temperatura;

        soma += temperatura;

        System.out.println("Temperatura do " + (i + 1) + "° dia: " + temperatura + "°C");
    }

    double media = (double) soma / temperaturas.length;

    int qtAcimaMedia = 0;
    for (int i = 0; i < temperaturas.length; i++)
    {
        if (temperaturas[i] > media)
            qtAcimaMedia++;
    }

    System.out.println("Média de temperatura da semana: " + media + "°C");
    System.out.println("Maior temperatura da semana: " + max + "°C");
    System.out.println("Menor temperatura da semana: " + min + "°C");
    System.out.println("Quantidade de dias com temperatura acima da média: " + qtAcimaMedia);
}