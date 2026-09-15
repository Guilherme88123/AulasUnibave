public class FilaEstatica
{
    static int capacidade = 5;
    static int[] dados = new int[capacidade];
    static int tamanho = 0;

    public void enfileirar(int valor)
    {
        if (estaCheia())
        {
            System.out.println("Fila cheia!");
            return;
        }

        dados[tamanho++] = valor;
    }

    public boolean estaVazia()
    {
        return tamanho == 0;
    }

    public boolean estaCheia()
    {
        return tamanho >= dados.length;
    }

    public int primeiro()
    {
        if (estaVazia())
        {
            System.out.println("Fila vazia!");
            return -1;
        }

        return dados[0];
    }

    public int desenfilerar()
    {
        if (estaVazia())
        {
            System.out.println("Fila vazia!");
            return -1;
        }

        int primeiro = dados[0];

        for (int i = 0; i < tamanho - 1; i++)
            dados[i] = dados[i + 1];

        tamanho--;

        return primeiro;
    }

    public int quantidade()
    {
        return tamanho;
    }

    public void listar()
    {
        for (int i = 0; i < tamanho; i++)
            System.out.print(dados[i] + " ");

        System.out.println();
    }
}
