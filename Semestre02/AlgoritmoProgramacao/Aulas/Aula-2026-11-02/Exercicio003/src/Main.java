void main()
{
    CalcularMediaNumeros(10, 8.5);
    ExibirMensagemBoasVindas("João");
    IsNumeroPar(3);
    ExibirMaiorNota(9.5, 7, 6.6);
    CalcularFatorial(6);
}

void CalcularMediaNumeros(double numero1, double numero2)
{
    double media = (numero2 + numero1) / 2;
    System.out.println("Media: " + media);
}

void ExibirMensagemBoasVindas(String nome)
{
    System.out.println("Seja bem vindo " + nome + "!");
}

void IsNumeroPar(int numero)
{
    boolean isPar = numero % 2 == 0;
    System.out.println("É par: " + isPar);
}

void ExibirMaiorNota(double nota1, double nota2, double nota3)
{
    double maiorNota = 0;
    double[] notas = {nota1, nota2, nota3};

    for (int i = 0; i < notas.length - 1; i++)
    {
        if (notas[i] > maiorNota || i == 0)
            maiorNota = notas[i];
    }

    System.out.println("Maior nota: " + maiorNota);
}

void CalcularFatorial(int numero)
{
    int fatorial = 1;

    for (int i = 1; i <= numero; i++)
    {
        fatorial = fatorial * i;
    }

    System.out.println("Fatorial: " + fatorial);
}
