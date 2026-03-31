import javax.swing.*;

void main()
{
    try
    {
        String opcaoSelecionada = JOptionPane.showInputDialog("Bem vindo ao conversor de Temperaturas! \nSelecione o tipo de conversão:" +
                "\n 0 - Celsius para Fahrenheit" +
                "\n 1 - Fahrenheit para Celsius" +
                "\n 2 - Celsius para Kelvin" +
                "\n 3 - Kelvin para Celsius");

        switch (opcaoSelecionada)
        {
            case "0":
                FahrenheitDeCelsius();
                break;
            case "1":
                CelsiusDeFahrenheit();
                break;
            case "2":
                KelvinDeCelsius();
                break;
            case "3":
                CelsiusDeKelvin();
                break;
            default:
                throw new Exception("Método de conversão não permitido!");
        }
    }
    catch (Exception ex)
    {
        JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
    }
}

public static void FahrenheitDeCelsius()
{
    String celsiusString = JOptionPane.showInputDialog("Informe o valor em Celsius: ");

    double celsius = Double.parseDouble(celsiusString);
    double fahrenheit = CalcularFahrenheitDeCelsius(celsius);

    JOptionPane.showMessageDialog(null, "De " + celsius + "° Celsius, " + fahrenheit + "° Fahrenheit");
}

public static void CelsiusDeFahrenheit()
{
    String fahrenheitString = JOptionPane.showInputDialog("Informe o valor em Fahrenheit: ");

    double fahrenheit = Double.parseDouble(fahrenheitString);
    double celsius = CalcularCelsiusDeFahrenheit(fahrenheit);

    JOptionPane.showMessageDialog(null, "De " + fahrenheit + "° Fahrenheit, " + celsius + "° Celsius");

    ValidarStatusCelsius(celsius);
}

public static void KelvinDeCelsius()
{
    String celsiusString = JOptionPane.showInputDialog("Informe o valor em Celsius: ");

    double celsius = Double.parseDouble(celsiusString);
    double kelvin = CalcularKelvinDeCelsius(celsius);

    JOptionPane.showMessageDialog(null, "De " + celsius + "° Celsius, " + kelvin + "° Kelvin");
}

public static void CelsiusDeKelvin()
{
    String kelvinString = JOptionPane.showInputDialog("Informe o valor em Kelvin: ");

    double kelvin = Double.parseDouble(kelvinString);
    double celsius = CalcularCelsiusDeKelvin(kelvin);

    JOptionPane.showMessageDialog(null, "De " + kelvin + "° Kelvin, " + celsius + "° Celsius");

    ValidarStatusCelsius(celsius);
}

public static double CalcularFahrenheitDeCelsius(double celsius)
{
    return celsius * 1.8 + 32;
}

public static double CalcularCelsiusDeFahrenheit(double fahrenheit)
{
    return (fahrenheit - 32) / 1.8;
}

public static double CalcularKelvinDeCelsius(double celsius)
{
    return celsius + 273.15;
}

public static double CalcularCelsiusDeKelvin(double kelvin)
{
    return kelvin - 273.15;
}

public static void ValidarStatusCelsius(double celsius)
{
    if (celsius < 15)
    {
        JOptionPane.showMessageDialog(null, "Alerta! Está frio demais");
    }
    else if (celsius >= 15 && celsius <= 20)
    {
        JOptionPane.showMessageDialog(null, "Está um pouco frio");
    }
    else if (celsius >= 20 && celsius <= 25)
    {
        JOptionPane.showMessageDialog(null, "A temperatura está agradável");
    }
    else if (celsius >= 25 && celsius <= 30)
    {
        JOptionPane.showMessageDialog(null, "Está um pouco quente");
    }
    else if (celsius > 30)
    {
        JOptionPane.showMessageDialog(null, "Alerta! Está quente demais");
    }
}