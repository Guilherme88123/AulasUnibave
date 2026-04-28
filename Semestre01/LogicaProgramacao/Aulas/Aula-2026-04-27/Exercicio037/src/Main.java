void main()
{
    int qtImpares = 0;

    int n = 1;

    while (n <= 50)
    {
        if (n % 2 == 1)
        {
            qtImpares++;
        }

        n++;
    }

    System.out.println("Quantidade de números ímpares de 1 a 50: " + qtImpares);
}