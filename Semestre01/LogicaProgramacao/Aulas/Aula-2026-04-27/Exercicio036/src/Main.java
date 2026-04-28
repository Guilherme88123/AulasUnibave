void main()
{
    int n = 1;
    int soma = 0;

    System.out.println("Soma dos número de 1 a 100 usando While");

    while (n <= 100)
    {
        soma += n;
        System.out.println("Soma = " + soma);
        n++;
    }
}