import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String nomeUsuario = JOptionPane.showInputDialog("Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Olá " + nomeUsuario);
        int respostaUsuario = JOptionPane.showConfirmDialog(null, "Deseja sair?");
        System.out.println("respostaUsuario = " + respostaUsuario);
    }
}