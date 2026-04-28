void main()
{
    int n = 1;

    System.out.println("Números múltiplos de 3 entre 1 e 30: ");

    while (n <= 30)
    {
        if (n % 3 == 0)
        {
            System.out.println("Múltiplo de 3: " + n);
        }

        n++;
    }
}