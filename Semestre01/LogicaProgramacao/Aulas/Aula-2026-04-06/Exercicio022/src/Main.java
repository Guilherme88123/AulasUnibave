import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main()
    {
        try
        {
            String messageOptions = "\n1  - Par ou Ímpar" +
                    "\n2  - Comparação de 2 Números" +
                    "\n3  - Validação de Aprovação" +
                    "\n4  - Classificação de Idade" +
                    "\n5  - Calculadora Simples" +
                    "\n6  - Número Negativo, Positivo ou Zero" +
                    "\n7  - Desconto em Compras" +
                    "\n8  - Dia da Semana" +
                    "\n9  - Verificação de Login" +
                    "\n10 - Maior de 3 Números" +
                    "\n11 - Cálculo de Imposto de Renda";

            String opcaoSelecionadaString = JOptionPane.showInputDialog(null, "Bem vindo ao congregado de exercícios! \nSelecione qual deseja executar: " + messageOptions, "Exercicio022", JOptionPane.INFORMATION_MESSAGE);

            int opcaoSelecionada = Integer.parseInt(opcaoSelecionadaString);

            switch (opcaoSelecionada)
            {
                case 1:
                    ExecuteParOuImpar();
                    break;
                case 2:
                    ExecuteComparacaoNumeros();
                    break;
                case 3:
                    ExecuteValidacaoAprovacao();
                    break;
                case 4:
                    ExecuteClassificacaoIdade();
                    break;
                case 5:
                    ExecuteCalculadora();
                    break;
                case 6:
                    ExecuteClassificacaoNumero();
                    break;
                case 7:
                    ExecuteDescontoCompra();
                    break;
                case 8:
                    ExecuteDiaSemana();
                    break;
                case 9:
                    ExecuteValidacaoLogin();
                    break;
                case 10:
                    ExecuteValidacaoTresNumeros();
                    break;
                case 11:
                    ExecuteCalculoIR();
                    break;
                default:
                    throw new Exception("Opção inválida!");
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void ExecuteParOuImpar()
    {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        if (numero % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "Número PAR!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Número ÍMPAR!");
        }
    }

    public static void ExecuteComparacaoNumeros()
    {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número: "));

        if (numero1 == numero2)
        {
            JOptionPane.showMessageDialog(null, "Os números são iguais! (" + numero1 + ")");
        }
        else if (numero1 > numero2)
        {
            JOptionPane.showMessageDialog(null, "O primeiro número (" + numero1 + ") é maior do que o segundo (" + numero2 + ")");
        }
        else if (numero1 < numero2)
        {
            JOptionPane.showMessageDialog(null, "O segundo número (" + numero2 + ") é maior do que o primeiro (" + numero1 + ")");
        }
    }

    public static void ExecuteValidacaoAprovacao()
    {
        int notaAprovacao = 7;
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe uma nota: "));

        if (nota < 0 || nota > 10)
        {
            JOptionPane.showMessageDialog(null, "Nota (" + nota + ") inválida!");
        }
        else if (nota > notaAprovacao)
        {
            JOptionPane.showMessageDialog(null, "APROVADO! (nota " + nota + ")");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "REPROVADO :/ (nota " + nota + ")");
        }
    }

    public static void ExecuteClassificacaoIdade()
    {
        int idadeAdulto = 18;
        int idadeAdolescente = 12;

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade: "));

        if (idade < 0 || idade > 120)
        {
            JOptionPane.showMessageDialog(null, "Idade (" + idade + ") inválida! (Mentiroso)");
        }
        else if (idade < idadeAdolescente)
        {
            JOptionPane.showMessageDialog(null, "Com idade de " + idade + " anos, você é uma criança");
        }
        else if (idade < idadeAdulto)
        {
            JOptionPane.showMessageDialog(null, "Com idade de " + idade + " anos, você é um adolescente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Com idade de " + idade + " anos, você é um adulto (F)");
        }
    }

    public static void ExecuteCalculadora()
    {
        List<String> operacoesValidas = Arrays.asList("+", "-", "*", "/");

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número: "));
        String operacao = JOptionPane.showInputDialog("Escolha uma das seguintes operações: " + String.join(", ", operacoesValidas));

        if (!operacoesValidas.contains(operacao))
        {
            JOptionPane.showMessageDialog(null, "Operacao (" + operacao + ") inválida!");
        }
        else
        {
            double resultado = 0;
            switch (operacao)
            {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    resultado = (double) numero1 / numero2;
                    break;
            }

            JOptionPane.showMessageDialog(null, "A expressão '" + numero1 + " " + operacao + " " + numero2 + "' resulta em: " + resultado);
        }
    }

    public static void ExecuteClassificacaoNumero()
    {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        if (numero == 0)
        {
            JOptionPane.showMessageDialog(null, "O número é igual a 0!");
        }
        else if (numero > 0)
        {
            JOptionPane.showMessageDialog(null, "O número (" + numero + ") é Positivo!");
        }
        else if (numero < 0)
        {
            JOptionPane.showMessageDialog(null, "O número (" + numero + ") é Negativo!");
        }
    }

    public static void ExecuteDescontoCompra()
    {
        double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da compra: "));

        if (valorCompra > 100)
        {
            double desconto = valorCompra * 0.1;
            JOptionPane.showMessageDialog(null, "A sua compra de R$" + valorCompra + " tem um valor final de R$" + (valorCompra - desconto) + " (10% de desconto)");
        }
        else if (valorCompra > 50)
        {
            double desconto = valorCompra * 0.05;
            JOptionPane.showMessageDialog(null, "A sua compra de R$" + valorCompra + " tem um valor final de R$" + (valorCompra - desconto) + " (5% de desconto)");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "A sua compra de R$" + valorCompra + " não possui desconto :(");
        }
    }

    public static void ExecuteDiaSemana()
    {
        int indiceDia = Integer.parseInt(JOptionPane.showInputDialog("Informe um número de dia da semana: "));

        String nomeDia = switch (indiceDia)
        {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Dia inválido";
        };

        JOptionPane.showMessageDialog(null, "Dia da semana de índice " + indiceDia + ": " + nomeDia);
    }

    public static void ExecuteValidacaoLogin()
    {
        String nome = JOptionPane.showInputDialog("Insira um nome de usuário: ");
        String senha = JOptionPane.showInputDialog("Insira uma senha de usuário: ");

        if (nome.equals("admin") && senha.equals("1234"))
        {
            JOptionPane.showMessageDialog(null, "Login Correto!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Login Inválido!");
        }
    }

    public static void ExecuteValidacaoTresNumeros()
    {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número: "));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe mais um número: "));

        int maior = Math.max(numero1, Math.max(numero2, numero3));

        JOptionPane.showMessageDialog(null, "O maior número entre os três é " + maior);
    }

    public static void ExecuteCalculoIR()
    {
        double tetoImpostoIsento = 2112.00;
        double tetoImpostoBaixo = 2826.65;
        double tetoImpostoMedio = 3751.05;
        double tetoImpostoAlto = 4664.68;

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário a ter o Imposto de Renda calculado: "));

        double imposto;

        if (salario < tetoImpostoIsento) {
            imposto = 0;
        } else if (salario < tetoImpostoBaixo) {
            imposto = 0.075;
        } else if (salario < tetoImpostoMedio) {
            imposto = 0.15;
        } else if (salario < tetoImpostoAlto) {
            imposto = 0.225;
        } else {
            imposto = 0.275;
        }

        JOptionPane.showMessageDialog(null,
                "Salário: R$" + salario +
                        "\nPercentual: " + (imposto * 100) + "%" +
                        "\nValor do Imposto: R$" + (salario * imposto) +
                        "\nSalário Final: R$" + (salario - (salario * imposto)));
    }
}
