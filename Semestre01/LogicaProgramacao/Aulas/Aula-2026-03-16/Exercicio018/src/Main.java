public class Main
{
    public static void main(String[] args)
    {
        int numero = 2;

        switch (numero)
        {
            case 1:
                System.out.println("Bloco A");
                break;
            case 2:
                System.out.println("Bloco B"); //Este será executado
                break;
            case 3:
                System.out.println("Bloco C");
                break;
            default:
                System.out.println("Bloco D");
                break;
        }
    }
}