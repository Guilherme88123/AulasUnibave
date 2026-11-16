import javax.swing.*;

public class Produto {
    String nome;
    int quantidade;

    public void cadastrar() {
        nome = JOptionPane.showInputDialog("Qual o nome do produto?");
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos recebeu do produto " + nome + "?"));
    }

    public void ver() {
        JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nQuantidade: " + quantidade);
    }
}
