import javax.swing.JOptionPane;

public class Programa03 {

	public static void main(String[] args) {
		
		double temperatura = 0.0;
		double tempC = 0.0;
		double tempF = 0.0;
		String entrada = "";

		entrada = JOptionPane.showInputDialog("Digite a temperatura a ser convertida:");
		temperatura = Double.parseDouble(entrada);

		Object[] opcoes = { "Celsius", "Fahrenheit" };
		Object escolha = JOptionPane.showInputDialog(null, "Qual você deseja", "Conversão de escala de temperatura",
				JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

		if (escolha == "Celsius") {

			tempC = tC(temperatura);
			JOptionPane.showMessageDialog(null,
					"A temperatura de " + temperatura + " Fahrenheit para Celsius é:\n" + tempC);

		}

		else {
			tempF = tF(temperatura);
			JOptionPane.showMessageDialog(null,
					"A temperatura de " + temperatura + " Celsius para Fahrenheit é:\n" + tempF);
		}
		System.exit(0);
	}

	public static Double tF(double temperatura) {

		double resultado = 0.0;

		resultado = 9.0 / 5.0 * temperatura + 32;

		return resultado;

	}

	public static Double tC(double temperatura) {

		double resultado = 0.0;

		resultado = 5.0 / 9.0 * (temperatura - 32);

		return resultado;

	}

}
