import javax.xml.transform.Source;
import java.lang.reflect.Array;
import java.util.Scanner;

public class JogoDaVelha
{
    static String[][] tabuleiro = new String[3][3];

    static int indiceJogadorAtual = 0;

    static String[] nomesJogadores = new String[2];
    static int[] pontosJogadores = new int[2];

    public static void Run()
    {
        IniciarJogadores();
        DrawSaudacaoInicial();
        DrawEstatisticasJogadores();

        while (true)
        {
            StartLoading();

            boolean jogando = true;

            while (jogando)
            {
                DrawTabuleiro();

                DrawIndicadorJogadorAtual(indiceJogadorAtual);
                ExecutarVezJogadorAtual();

                int jogadorVencedor = VerificarJogadorVencedor();
                if (jogadorVencedor != -1)
                {
                    DrawSaudacaoJogadorVencedor(jogadorVencedor);
                    DrawTabuleiro();
                    AdicionarPontoJogador(jogadorVencedor);
                    DrawEstatisticasJogadores();

                    jogando = false;
                }
                else
                {
                    AvancarJogadorAtual();

                    boolean empatou = VerificarEmpate();
                    if (empatou)
                    {
                        jogando = false;
                        DrawMensagemEmpate();
                    }
                }
            }

            if (!VerificarJogarNovamente())
                break;
        }

        DrawSaudacaoFinal();
    }

    private static void StartLoading()
    {
        LimparTabuleiro();

        indiceJogadorAtual = 0;
    }

    private static void LimparTabuleiro()
    {
        for (int i = 0; i < tabuleiro.length; i++)
            for (int j = 0; j < tabuleiro[i].length; j++)
                tabuleiro[i][j] = " ";
    }

    private static void ExecutarVezJogadorAtual()
    {
        System.out.println("Digite a posição que quer jogar!");

        boolean jogadaValida = false;

        while (!jogadaValida)
        {

            System.out.println("Linha (1-3): ");

            int linha = 0;

            while (linha > 3 || linha < 1)
            {
                linha = CapturarOpcaoTerminal();

                if (linha > 3 || linha < 1)
                {
                    System.out.println("Linha inválida, deve estar entre 1 e 3, tente novamente!");
                }
            }

            System.out.println("Coluna (1-3): ");

            int coluna = 0;

            while (coluna > 3 || coluna < 1)
            {
                coluna = CapturarOpcaoTerminal();

                if (coluna > 3 || coluna < 1)
                {
                    System.out.println("Coluna inválida, deve estar entre 1 e 3, tente novamente!");
                }
            }

            int indiceLinha = linha - 1;
            int indiceColuna = coluna - 1;

            jogadaValida = VerificarJogadaValida(indiceLinha, indiceColuna);

            if (jogadaValida)
                tabuleiro[indiceLinha][indiceColuna] = GetSimbolByIndiceJogador(indiceJogadorAtual);
            else
                System.out.println("Posição já ocupada, tente novamente!");
        }
    }

    private static boolean VerificarJogadaValida(int linha, int coluna)
    {
        return tabuleiro[linha][coluna] == " ";
    }

    private static String GetSimbolByIndiceJogador(int indiceJogadorAtual)
    {
        switch (indiceJogadorAtual)
        {
            case 0: return "X";
            case 1: return "O";
        }

        return "";
    }

    private static int GetIndiceJogadorBySimbol(String simbol)
    {
        switch (simbol)
        {
            case "X": return 0;
            case "O": return 1;
        }

        return -1;
    }

    private static void AvancarJogadorAtual()
    {
        indiceJogadorAtual = (indiceJogadorAtual + 1) % nomesJogadores.length;
    }

    private static int VerificarJogadorVencedor()
    {
        boolean linhaCima = tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2];
        boolean linhaMeio = tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2];
        boolean linhaBaixo = tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2];

        boolean colunaEsquerda = tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[1][0] == tabuleiro[2][0];
        boolean colunaMeio = tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][1];
        boolean colunaDireita = tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[1][2] == tabuleiro[2][2];

        boolean diagonalDireita = tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2];
        boolean diagonalEsquerda = tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0];

        String simboloGanhador = "";

        if (linhaMeio || colunaMeio || diagonalDireita || diagonalEsquerda)
            simboloGanhador = tabuleiro[1][1];

        if (linhaCima || colunaEsquerda)
            simboloGanhador = tabuleiro[0][0];

        if (linhaBaixo || colunaDireita)
            simboloGanhador = tabuleiro[2][2];

        if (simboloGanhador == " ")
            return -1;

        return GetIndiceJogadorBySimbol(simboloGanhador);
    }

    private static void AdicionarPontoJogador(int indiceJogador)
    {
        pontosJogadores[indiceJogador]++;
    }

    private static void IniciarJogadores()
    {
        nomesJogadores[0] = "João";
        nomesJogadores[1] = "Pedro";
    }

    private static boolean VerificarEmpate()
    {
        boolean empatou = true;

        for (int i = 0; i < tabuleiro.length; i++)
            for (int j = 0; j < tabuleiro[i].length; j++)
                if (tabuleiro[i][j] == " ")
                {
                    empatou = false;
                    break;
                }

        return empatou;
    }

    private static boolean VerificarJogarNovamente()
    {
        System.out.println("Deseja jogar novamente?");
        System.out.println("0 - Não");
        System.out.println("1 - Sim");

        int opcaoSelecionada = CapturarOpcaoTerminal();

        return opcaoSelecionada == 1;
    }

    private static int CapturarOpcaoTerminal()
    {
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            String digitado = scanner.nextLine();

            try
            {
                int digitadoInteiro = Integer.parseInt(digitado);
                return digitadoInteiro;
            }
            catch (Exception ex)
            {
                System.out.println("Opção inválida, Tente novamente!");
            }
        }
    }

    private static void DrawLine()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }

    private static void DrawSaudacaoInicial()
    {
        DrawLine();
        System.out.println("=+= Iniciando Jogo da Velha =+=");
        DrawLine();
    }

    private static void DrawSaudacaoFinal()
    {
        DrawLine();
        System.out.println("=+ Muito Obrigado por Jogar! +=");
        DrawLine();
    }

    private static void DrawEstatisticasJogadores()
    {
        DrawLine();
        for (int i = 0; i < nomesJogadores.length; i++)
            System.out.println("Jogador " + nomesJogadores[i] + " com " + pontosJogadores[i] + " pontos");
        DrawLine();
    }

    private static void DrawTabuleiro()
    {
        DrawLine();
        for (int i = 0; i < tabuleiro.length; i++)
        {
            for (int j = 0; j < tabuleiro[i].length; j++)
            {
                System.out.print("[" + tabuleiro[i][j] + "]");
            }
            System.out.println();
        }
        DrawLine();
    }

    private static void DrawSaudacaoJogadorVencedor(int indiceJogadorVencedor)
    {
        System.out.println("Parabéns jogador " + nomesJogadores[indiceJogadorVencedor] + " (" +
                GetSimbolByIndiceJogador(indiceJogadorAtual) + ")" + ", você venceu!");
    }

    private static void DrawIndicadorJogadorAtual(int indiceJogadorAtual)
    {
        System.out.println("Vez do jogador " + nomesJogadores[indiceJogadorAtual] + " (" +
                GetSimbolByIndiceJogador(indiceJogadorAtual) + ")");
    }

    private static void DrawMensagemEmpate()
    {
        System.out.println("Jogo terminou em empate! (Deu velha)");
    }
}
