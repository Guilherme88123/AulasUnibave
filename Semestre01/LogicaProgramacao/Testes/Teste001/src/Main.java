import javax.swing.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "qual é o seu nome?");
        String curso = JOptionPane.showInputDialog(null, "qual curso vc faz?");

        if (Objects.equals(curso, "sistemas de informacao")) {
            JOptionPane.showMessageDialog(null, nome + ", " + "vc é um garoto(a) de programa");
        }
        else {
            JOptionPane.showMessageDialog(null, nome + ", " + "vc é estranho");
        }
    }
}