void main()
{
    Atividade01();
    Atividade02();
    Atividade03();
    Atividade04();
    Atividade05();
    Atividade06();
    Atividade07();
}

static void Atividade01()
{
    Object[] pessoa = new Object[4];
    pessoa[0] = "Ana"; // nome
    pessoa[1] = 19; // idade
    pessoa[2] = 170; // altura (cm)
    pessoa[3] = true; // estudante

    for (int i = 0; i < pessoa.length; i++) {
        Object dado = pessoa[i];
        if (dado instanceof String) {
            String texto = (String) dado;
            System.out.println("Texto: " + texto);
        } else if (dado instanceof Integer) {
            Integer inteiro = (Integer) dado;
            System.out.println("Inteiro: " + inteiro);
        } else if (dado instanceof Double) {
            Double decimal = (Double) dado;
            System.out.println("Decimal: " + decimal);
        } else if (dado instanceof Boolean) {
            Boolean logico = (Boolean) dado;
            System.out.println("Booleano: " + logico);
        }
    }
}

static void Atividade02()
{
    Object[] pessoa = new Object[4];
    pessoa[0] = "Guilherme"; // nome
    pessoa[1] = 18; // idade
    pessoa[2] = 188; // altura (cm)
    pessoa[3] = true; // estudante

    for (int i = 0; i < pessoa.length; i++) {
        Object dado = pessoa[i];
        if (dado instanceof String) {
            String texto = (String) dado;
            System.out.println("Texto: " + texto);
        } else if (dado instanceof Integer) {
            Integer inteiro = (Integer) dado;
            System.out.println("Inteiro: " + inteiro);
        } else if (dado instanceof Double) {
            Double decimal = (Double) dado;
            System.out.println("Decimal: " + decimal);
        } else if (dado instanceof Boolean) {
            Boolean logico = (Boolean) dado;
            System.out.println("Booleano: " + logico);
        }
    }
}

static void Atividade03()
{
    Object[] produto = new Object[4];
    produto[0] = "Faca Tramontina"; // nome
    produto[1] = 300; // estoque
    produto[2] = 49.99; // preco
    produto[3] = true; // disponível

    for (int i = 0; i < produto.length; i++) {
        Object dado = produto[i];
        if (dado instanceof String) {
            String texto = (String) dado;
            System.out.println("Texto: " + texto);
        } else if (dado instanceof Integer) {
            Integer inteiro = (Integer) dado;
            System.out.println("Inteiro: " + inteiro);
        } else if (dado instanceof Double) {
            Double decimal = (Double) dado;
            System.out.println("Decimal: " + decimal);
        } else if (dado instanceof Boolean) {
            Boolean logico = (Boolean) dado;
            System.out.println("Booleano: " + logico);
        }
    }
}

static void Atividade04()
{
    Object[] valores = new Object[6];
    valores[0] = "Faca Tramontina";
    valores[1] = 300;
    valores[2] = 49.99;
    valores[3] = true;
    valores[4] = 100.01;
    valores[5] = 5;

    double soma = 0;
    
    for (int i = 0; i < valores.length; i++) {
        Object dado = valores[i];
        if (dado instanceof Integer) {
            Integer inteiro = (Integer) dado;
            soma += inteiro;
        } else if (dado instanceof Double) {
            Double decimal = (Double) dado;
            soma += decimal;
        }
    }

    System.out.println("soma = " + soma);
}

static void Atividade05()
{
    Object[] valores = new Object[9];
    valores[0] = "Faca Tramontina";
    valores[1] = 300;
    valores[2] = 49.99;
    valores[3] = "Palito de Churrasco";
    valores[4] = 500;
    valores[5] = 13.45;
    valores[6] = "Grelha Inox";
    valores[7] = 150;
    valores[8] = 215.1;

    double soma = 0;
    int quantidade = 0;

    for (int i = 0; i < valores.length; i++) {
        Object dado = valores[i];
        if (dado instanceof Integer) {
            Integer inteiro = (Integer) dado;
            quantidade = inteiro;
        } else if (dado instanceof Double) {
            Double decimal = (Double) dado;
            soma += quantidade * decimal;
        }
    }

    System.out.println("Valor total = " + soma);
}

static void Atividade06()
{
    Object[][] planilha = new Object[4][3];
    planilha[0][0] = "Nome";
    planilha[0][1] = "Idade";
    planilha[0][2] = "Cidade";

    planilha[1][0] = "Ana Luise";
    planilha[1][1] = 19;
    planilha[1][2] = 1800.00;

    planilha[2][0] = "Guilherme";
    planilha[2][1] = 18;
    planilha[2][2] = 2200.00;

    planilha[3][0] = "Pedro Mach";
    planilha[3][1] = 17;
    planilha[3][2] = 1500.00;

    for (int linha = 0; linha < planilha.length; linha++) {
        for (int coluna = 0; coluna < planilha[linha].length; coluna++) {
            System.out.print(planilha[linha][coluna] + "\t");
        }
        System.out.println();
    }
}

static void Atividade07()
{
    Object dado = 10;
    Integer integer = (Integer) dado;
    int novoDado = integer + 10;

    // Caso sem cast:
    //java: bad operand types for binary operator '+'
    //first type:  java.lang.Object
    //second type: int

    //Isso acontece pois o compilador, mesmo que existindo um inteiro ali dentro
    //ele apenas vê o "Object" onde por contra disso, precisamos do casting
}