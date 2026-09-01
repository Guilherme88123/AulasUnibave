public class ListaEstatica
{
    static int capacidade = 20;

    static int[] dados = new int[capacidade];
    static int tamanho = 0;

    public void adicionar(int valor)
    {
        if (tamanho >= dados.length)
        {
            System.out.println("Lista cheia! ( " + dados.length + " elementos )");
            return;
        }

        dados[tamanho++] = valor;
    }

    public void adicionarOrdenado(int valor)
    {
        if (tamanho >= dados.length)
        {
            System.out.println("Lista cheia! ( " + dados.length + " elementos )");
            return;
        }

        int posicaoOrdenada = tamanho;
        for (int i = 0; i < tamanho; i++)
        {
            if (valor < dados[i])
            {
                posicaoOrdenada = i;
                break;
            }
        }

        for (int i = tamanho - 1; i >= posicaoOrdenada; i--)
            dados[i + 1] = dados[i];

        dados[posicaoOrdenada] = valor;
        tamanho++;
    }

    public void listar()
    {
        for (int i = 0; i < tamanho; i++)
        {
            System.out.print(dados[i]);

            if (i < tamanho - 1)
                System.out.print(", ");
        }

        System.out.println();
    }

    public int quantidade()
    {
        //retorna variável "tamanho", pois representa quantos elementos existem atualmente
        //pois "dados.length" é a capacidade, não quantidade de elementos que existem atualmente
        return tamanho;
    }

    public int buscaLinear(int valor)
    {
        return buscaLinear(valor, false);
    }

    public int buscaLinear(int valor, boolean contarComparacoes)
    {
        int posicao = -1;
        int comparacoes = 0;

        for (int i = 0; i < tamanho; i++)
        {
            comparacoes++;
            if (dados[i] == valor)
            {
                posicao = i;
                break;
            }
        }

        if (contarComparacoes)
            System.out.println("Comparações para achar '" + valor + "' com busca linear: " + comparacoes);

        return posicao;
    }

    public void remover(int valor)
    {
        int posicao = buscaLinear(valor);

        if (posicao == -1)
            return;

        for (int i = posicao; i < tamanho - 1; i++)
            dados[i] = dados[i + 1];

        tamanho--;
    }

    public int buscaBinaria(int valor)
    {
        return buscaBinaria(valor, false);
    }

    public int buscaBinaria(int valor, boolean contarComparacoes)
    {
        int posicao = -1;
        int comparacoes = 0;

        int inicio = 0;
        int fim = tamanho - 1;
        int meio = 0;

        while (true)
        {
            meio = (inicio + fim) / 2;

            comparacoes++;

            int possivelValor = dados[meio];

            if (possivelValor == valor)
            {
                posicao = meio;
                break;
            }

            if (possivelValor > valor)
            {
                fim = meio - 1;
            }
            else
            {
                inicio = meio + 1;
            }

            if (inicio > fim)
                break;
        }

        if (contarComparacoes)
            System.out.println("Comparações para achar '" + valor + "' com busca binária: " + comparacoes);

        return posicao;
    }

    public void limparLista()
    {
        //Método criado para realizar os testes pedidos nos exercícios sem que eles contaminem uns aos outros
        dados = new int[capacidade];
        tamanho = 0;
    }
}
