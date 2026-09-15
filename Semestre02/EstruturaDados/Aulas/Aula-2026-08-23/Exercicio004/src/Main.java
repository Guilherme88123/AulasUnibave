void main()
{
    FilaEstatica fila = new FilaEstatica();

    fila.enfileirar(10);
    fila.enfileirar(20);
    fila.enfileirar(30);
    fila.enfileirar(40);
    fila.enfileirar(50);
    fila.enfileirar(60); //Já cheia

    fila.listar();

    fila.desenfilerar();
    fila.desenfilerar();
    fila.desenfilerar();

    System.out.println("Primeiro = " + fila.primeiro());
    System.out.println("Quantidade = " + fila.quantidade());

    fila.desenfilerar();
    fila.desenfilerar();
    fila.desenfilerar(); // Já vazia
}
