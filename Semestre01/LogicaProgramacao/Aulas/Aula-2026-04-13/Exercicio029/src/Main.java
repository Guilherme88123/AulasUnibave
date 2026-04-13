import javax.swing.*;

void main()
{
    String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");

    for (int i = 0; i < palavra.length(); i++)
    {
        System.out.println("Letra Nro " + (i + 1) + "°: " + palavra.substring(i, i+1));
    }
}