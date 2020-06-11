import javax.swing.JOptionPane;

public class Programa06 {

	public static void main(String[] args) {
		
		double ladoQuadrado = 0.0;
		double areaQuadrado = 0.0;

		double pi = 3.14;
		double raioCirculo = 0.0;
		double areaCirculo = 0.0;

		double baseTriangulo = 0.0;
		double alturaTriangulo = 0.0;
		double areaTriangulo = 0.0;

		String entrada = "";

		Object[] opcoes = { "Calcular a �rea de um quadrado.", "Calcular a �rea de um c�rculo.",
				"Calcular a �rea de um tri�ngulo." };
		Object escolha = JOptionPane.showInputDialog(null, "Qual calculo voc� deseja", "Calculo de �reas",
				JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

		if (escolha == "Calcular a �rea de um quadrado.") {

			entrada = JOptionPane.showInputDialog("Digite o valor do lado do quadrado:");
			ladoQuadrado = Double.parseDouble(entrada);

			areaQuadrado = quadrado(ladoQuadrado);

			JOptionPane.showMessageDialog(null,
					"A �rea do quadrado de lado " + ladoQuadrado + " � de :\n" + areaQuadrado);

		}

		else if (escolha == "Calcular a �rea de um c�rculo.") {

			entrada = JOptionPane.showInputDialog("Digite o valor do raio do c�rculo:");
			raioCirculo = Double.parseDouble(entrada);

			areaCirculo = circulo(pi, raioCirculo);

			JOptionPane.showMessageDialog(null, "A �rea do c�rculo de raio " + raioCirculo + " � de :\n" + areaCirculo);

		}

		else if (escolha == "Calcular a �rea de um tri�ngulo.")  {

			entrada = JOptionPane.showInputDialog("Digite o valor da base do tri�ngulo:");
			baseTriangulo = Double.parseDouble(entrada);

			entrada = JOptionPane.showInputDialog("Digite o valor da altura do tri�ngulo:");
			alturaTriangulo = Double.parseDouble(entrada);

			areaTriangulo = triangulo(baseTriangulo, alturaTriangulo);

			JOptionPane.showMessageDialog(null, "A �rea do tri�ngulo de base " + baseTriangulo + " � de altura "
					+ alturaTriangulo + " � de:\n" + areaTriangulo);

		}
		System.exit(0);	
	}

	public static Double quadrado(double ladoQuadrado) {

		double resultado = 0.0;

		resultado = Math.pow(ladoQuadrado, 2);

		return resultado;

	}

	public static Double circulo(double pi, double raioCirculo) {

		double resultado = 0.0;

		resultado = pi * Math.pow(raioCirculo, 2);

		return resultado;

	}

	public static Double triangulo(double base, double altura) {

		double resultado = 0.0;

		resultado = (base * altura) / 2;

		return resultado;

	}


}
