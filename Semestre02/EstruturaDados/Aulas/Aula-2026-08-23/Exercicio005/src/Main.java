void main()
{
    // 6 % 5  = 1, com resto 1
    // 7 % 5  = 1, com resto 2
    // 9 % 5  = 1, com resto 4
    // 10 % 5 = 2, com resto 0
    // 11 % 5 = 2, com resto 1
    // O operador '%' calcula o resto da divisão, retornando-o como resultado

    int indice = 0;
    System.out.println("indice = " + indice);
    indice = (indice + 1) % 5;
    System.out.println("indice = " + indice);
    indice = (indice + 1) % 5;
    System.out.println("indice = " + indice);
    indice = (indice + 1) % 5;
    System.out.println("indice = " + indice);
    indice = (indice + 1) % 5;
    System.out.println("indice = " + indice);
    indice = (indice + 1) % 5;
    System.out.println("indice = " + indice);

    FilaCircular.mostrar();

    FilaCircular.enfileirar(10);
    FilaCircular.mostrar();

    FilaCircular.enfileirar(20);
    FilaCircular.mostrar();

    FilaCircular.enfileirar(30);
    FilaCircular.mostrar();

    FilaCircular.desenfileirar();
    FilaCircular.mostrar();

    FilaCircular.enfileirar(40);
    FilaCircular.mostrar();

    FilaCircular.enfileirar(50);
    FilaCircular.mostrar();

    FilaCircular.desenfileirar();
    FilaCircular.mostrar();
}
