import javax.swing.*;

void main() {
    try
    {
        JOptionPane.showMessageDialog(null, "Calculadora de IMC!");
        String pesoString = JOptionPane.showInputDialog("Informe o Peso: ");
        String alturaString = JOptionPane.showInputDialog("Informe a Altura: ");

        double peso = Double.parseDouble(pesoString);
        double altura = Double.parseDouble(alturaString);

        double imc = peso / Math.pow(altura, 2);

        JOptionPane.showMessageDialog(null, "Seu IMC é de: " + imc);
    }
    catch (Exception ex)
    {
        ex.printStackTrace();
    }
}
