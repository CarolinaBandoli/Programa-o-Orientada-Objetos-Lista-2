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

		Object[] opcoes = { "Calcular a área de um quadrado.", "Calcular a área de um círculo.",
				"Calcular a área de um triângulo." };
		Object escolha = JOptionPane.showInputDialog(null, "Qual calculo você deseja", "Calculo de áreas",
				JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

		if (escolha == "Calcular a área de um quadrado.") {

			entrada = JOptionPane.showInputDialog("Digite o valor do lado do quadrado:");
			ladoQuadrado = Double.parseDouble(entrada);

			areaQuadrado = quadrado(ladoQuadrado);

			JOptionPane.showMessageDialog(null,
					"A área do quadrado de lado " + ladoQuadrado + " é de :\n" + areaQuadrado);

		}

		else if (escolha == "Calcular a área de um círculo.") {

			entrada = JOptionPane.showInputDialog("Digite o valor do raio do círculo:");
			raioCirculo = Double.parseDouble(entrada);

			areaCirculo = circulo(pi, raioCirculo);

			JOptionPane.showMessageDialog(null, "A área do círculo de raio " + raioCirculo + " é de :\n" + areaCirculo);

		}

		else if (escolha == "Calcular a área de um triângulo.")  {

			entrada = JOptionPane.showInputDialog("Digite o valor da base do triângulo:");
			baseTriangulo = Double.parseDouble(entrada);

			entrada = JOptionPane.showInputDialog("Digite o valor da altura do triângulo:");
			alturaTriangulo = Double.parseDouble(entrada);

			areaTriangulo = triangulo(baseTriangulo, alturaTriangulo);

			JOptionPane.showMessageDialog(null, "A área do triângulo de base " + baseTriangulo + " é de altura "
					+ alturaTriangulo + " é de:\n" + areaTriangulo);

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
