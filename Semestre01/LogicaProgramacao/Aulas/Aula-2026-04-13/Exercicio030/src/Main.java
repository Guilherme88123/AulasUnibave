void main()
{
    System.out.println("Múltiplos de 3 entre 1 e 30: ");

    for (int i = 0; i <= 30; i++)
    {
        if (i % 3 != 0) continue;

        System.out.println("Número " + i);
    }
}