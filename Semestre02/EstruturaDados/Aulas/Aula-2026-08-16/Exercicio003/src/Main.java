void main()
{
    ListaEstatica lista = new ListaEstatica();

    lista.adicionar(10);
    lista.adicionar(20);
    lista.adicionar(30);
    lista.adicionar(40);

    lista.listar();
    System.out.println("Quantidade: " + lista.quantidade());

    lista.adicionar(50);

    System.out.println("Buscando '10' de forma linear, posição: " + lista.buscaLinear(10));
    System.out.println("Buscando '30' de forma linear, posição: " + lista.buscaLinear(30));
    System.out.println("Buscando '50' de forma linear, posição: " + lista.buscaLinear(50));
    System.out.println("Buscando '999' de forma linear, posição: " + lista.buscaLinear(999));

    lista.remover(20);
    lista.listar();

    /// Busca binário - teoria
    // vetor hipotético: {5, 12, 18, 23, 31, 45, 60, 72, 89}
    // valor à buscar: 60
    // para começar, vamos ao elemento do meio, sendo o '31'
    // como ele é menor sabemos que todos os elementos à direita (menores)
    // já não serão nosso alvo
    // (Lembrando que precisamos de um vetor ordenado para a busca binária funcionar)
    // com isso, sobraram os valores 45, 60, 72 e 89
    // uma nova rodada de busca no meio é feita, e como é um número par de valores
    // ele trunca o valor para baixo, pegando assim o 60, logo, finalizando a busca
    // (caso ele pegasse o 72 por algum motivo de arredondamento, os numeros acima
    // já que maiores que nosso alvo, seriam eliminados e uma nova rodada de busca
    // seria executada)

    System.out.println("Buscando '10' de forma binária, posição: " + lista.buscaBinaria(10));
    System.out.println("Buscando '30' de forma binária, posição: " + lista.buscaBinaria(30));
    System.out.println("Buscando '50' de forma binária, posição: " + lista.buscaBinaria(50));
    System.out.println("Buscando '999' de forma binária, posição: " + lista.buscaBinaria(999));

    lista.limparLista();

    lista.adicionar(10);
    lista.adicionar(20);
    lista.adicionar(30);
    lista.adicionar(40);
    lista.adicionar(50);
    lista.adicionar(60);
    lista.adicionar(70);
    lista.adicionar(80);
    lista.adicionar(90);
    lista.adicionar(100);
    lista.adicionar(110);
    lista.adicionar(120);
    lista.adicionar(130);
    lista.adicionar(140);
    lista.adicionar(150);
    lista.adicionar(160);
    lista.adicionar(170);
    lista.adicionar(180);
    lista.adicionar(190);
    lista.adicionar(200);

    lista.buscaLinear(180, true);
    lista.buscaBinaria(180, true);

    lista.limparLista();

    lista.adicionarOrdenado(60);
    lista.adicionarOrdenado(190);
    lista.adicionarOrdenado(20);
    lista.adicionarOrdenado(200);
    lista.adicionarOrdenado(30);
    lista.adicionarOrdenado(110);
    lista.adicionarOrdenado(50);
    lista.adicionarOrdenado(170);
    lista.adicionarOrdenado(70);
    lista.adicionarOrdenado(120);
    lista.adicionarOrdenado(90);
    lista.adicionarOrdenado(100);
    lista.adicionarOrdenado(130);
    lista.adicionarOrdenado(80);
    lista.adicionarOrdenado(140);
    lista.adicionarOrdenado(150);
    lista.adicionarOrdenado(40);
    lista.adicionarOrdenado(160);
    lista.adicionarOrdenado(10);
    lista.adicionarOrdenado(180);

    lista.listar();
    System.out.println("Quantidade: " + lista.quantidade());

    lista.buscaBinaria(30, true);
    lista.buscaBinaria(70, true);
    lista.buscaBinaria(150, true);
}