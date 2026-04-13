void main()
{
    System.out.println("Números ímpares de 1 até 50");

    int qtImpares = 0;

    for (int i = 0; i <= 50; i++)
    {
        if (i % 2 == 0)
        {
            continue;
        }

        System.out.println(i);
        qtImpares++;
    }

    System.out.println("Quantidade total de ímpares: " + qtImpares);
}