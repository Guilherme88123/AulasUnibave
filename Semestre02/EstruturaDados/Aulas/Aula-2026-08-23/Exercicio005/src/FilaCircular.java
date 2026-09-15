public class FilaCircular
{
    static int[] dados = new int[5];
    static int inicio = 0;
    static int fim = 0;
    static int tamanho = 0;

    public static void enfileirar(int valor)
    {
        if (estaCheia())
        {
            System.out.println("Está cheia!");
            return;
        }

        dados[fim] = valor;
        fim = (fim + 1) % dados.length;
        tamanho++;
    }

    public static int desenfileirar()
    {
        if (estaVazia())
        {
            System.out.println("Está vazia!");
            return -1;
        }

        int primeiro = dados[inicio];

        inicio = (inicio + 1) % dados.length;
        tamanho--;

        return primeiro;
    }

    public static int primeiro()
    {
        if (estaVazia())
        {
            System.out.println("Está vazia!");
            return -1;
        }

        return dados[inicio];
    }

    public static boolean estaVazia()
    {
        return tamanho == 0;
    }

    public static boolean estaCheia()
    {
        return tamanho >= dados.length;
    }

    public static void listar()
    {
        for (int i = 0; i < tamanho; i++)
        {
            int posicao = (inicio + i) % dados.length;
            System.out.print(dados[posicao] + " ");
        }

        System.out.println();
    }
    
    public static void mostrar()
    {
        System.out.println("Inicio = " + inicio);
        System.out.println("Fim = " + fim);
        System.out.println("Tamanho = " + tamanho);
        listar();
    }
}