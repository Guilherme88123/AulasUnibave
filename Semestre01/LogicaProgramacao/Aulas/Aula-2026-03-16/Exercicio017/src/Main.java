public class Main
{
    public static void main(String[] args)
    {
        int nota = 75;

        if (nota >= 90)
        {
            System.out.println("Bloco A");
        }
        else if (nota >= 80)
        {
            System.out.println("Bloco B");
        }
        else if (nota >= 70)
        {
            System.out.println("Bloco C"); //Este será executado
        }
        else
        {
            System.out.println("Bloco D");
        }
    }
}