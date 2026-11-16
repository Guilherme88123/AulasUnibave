import javax.swing.*;

void main() {

    int opcao = -1;
    Produto[] produtos = new Produto[20];
    int produtoCadastrados = 0;

    while(opcao != 0) {
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1 - Compra\n2 - Ver Produtos\n3 - Venda\n0 - Sair"));
        if (opcao == 1) {
            produtos[produtoCadastrados] = new Produto();
            produtos[produtoCadastrados].cadastrar();
            produtoCadastrados++;
        } else if (opcao == 2) {
            JOptionPane.showMessageDialog(null, montarMensagemProdutos(produtos));
        } else if (opcao == 3)
        {
            String mensagem = montarMensagemProdutos(produtos);
            mensagem += "\n\nDigite o nome do produto que você vendeu:";
            String nomeProduto = JOptionPane.showInputDialog(mensagem);
            int indiceProdutoVendido = procurarProdutoPeloNome(produtos, nomeProduto);

            if (indiceProdutoVendido == -1)
            {
                JOptionPane.showMessageDialog(null, "Produto inválido, tente novamente!");
            }
            else
            {
                Produto produtoVendido = produtos[indiceProdutoVendido];

                int quantidadeVendida = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você vendeu do produto" + produtoVendido.nome + "? (Qtd em estoque: " + produtoVendido.quantidade + ")"));

                if (quantidadeVendida > produtoVendido.quantidade || quantidadeVendida < 1)
                {
                    JOptionPane.showMessageDialog(null, "Quantidade inválida, tente novamente!");
                }
                else if (quantidadeVendida == produtoVendido.quantidade)
                {
                    produtos[procurarProdutoPeloNome(produtos, nomeProduto)] = null;
                }
                else
                {
                    produtoVendido.quantidade -= quantidadeVendida;
                }
            }
        }
    }

}

String montarMensagemProdutos(Produto[] produtos)
{
    String mensagem = "";
    for (int i = 0; i < produtos.length; i++)
    {
        Produto produto = produtos[i];

        if (produto == null)
        {
            continue;
        }

        mensagem += "\n" + (i + 1) + " - " + produto.nome + " - Qtd: " + produto.quantidade;
    }

    return mensagem;
}

int procurarProdutoPeloNome(Produto[] produtos, String nomeAlvo)
{
    for (int i = 0; i < produtos.length; i++)
    {
        Produto produto = produtos[i];
        if (produto != null && produto.nome.equals(nomeAlvo))
        {
            return i;
        }
    }

    return -1;
}