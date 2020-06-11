import javax.swing.JOptionPane;

public class Programa16 {

	public static void main(String[] args) {

		double[] vetor = new double[10];

		double dados = 0.0;

		double mediaTempo = 0.0;

		for (int i = 0; i <= 9; i++) {

			dados = init();

			vetor[i] = dados;

		}

		mediaTempo = media(vetor);
		JOptionPane.showMessageDialog(null, "A média dos tempos é :\n" + mediaTempo);

		System.exit(0);
	}

	public static double media(double[] vetor) {

		double resultado = 0.0;

		for (int i = 0; i <= 9; i++) {

			resultado = resultado + vetor[i];
		}
		resultado = resultado / 10;

		return resultado;
	}

	public static double init() {

		double tempo = 0.0;

		String entrada = JOptionPane.showInputDialog("Digite o tempo:");
		tempo = Double.parseDouble(entrada);

		return tempo;
	}

}
