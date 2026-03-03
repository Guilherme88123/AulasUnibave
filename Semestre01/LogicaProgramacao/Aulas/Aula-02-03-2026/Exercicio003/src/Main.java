public class Main
{
    public static void main(String[] args)
    {
        int n1 = 13;
        int n2 = 7;

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisaoInteira = n1 / n2;
        double divisao = (double) n1 / n2;

        System.out.println("Números: " + n1 + ", " + n2);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Divisão (Inteira): " + divisaoInteira);
    }
}