void main()
{
    int soma = 0;

    System.out.println("Soma dos números de 1 até 100: ");

    for (int i = 1; i <= 100; i++)
    {
        int somaOld = soma;
        soma += i;

        System.out.println(somaOld + " + " + i + " = " + soma);
    }
}