void main()
{
    String[] frutas = {"Banana", "Abacaxi", "Maçã", "Uva", "Morango", "Kiwi", "Carambola", "Jabuticaba"};

    writeLine();
    System.out.println("Lista de compras (parte de frutas):");
    writeLine();

    for (int i = 0; i < frutas.length; i++)
    {
        System.out.println("Nro " + (i + 1) + "° - " + frutas[i]);
    }
    writeLine();
}

void writeLine()
{
    System.out.println("================================");
}