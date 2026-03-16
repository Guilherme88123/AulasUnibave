public class Main
{
    public static void main(String[] args) 
    {
        //Padrao de declaração de variáveis
        //TipoDeDado NomeVariavel Recebe Valor
        String nomeAluno = "Doerner";
        int idadeAluno = 18;
        double alturaAluno = 1.88;

        writeLine();
        System.out.println("Informações do Aluno!");
        writeLine();
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Idade: " + idadeAluno);
        System.out.println("Altura: " + alturaAluno);
        writeLine();
    }

    public static void writeLine()
    {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}