import javax.swing.JOptionPane;

public class Programa15 {

	public static void main(String[] args) {
	
		double[] vetor1 = new double[10];
		double[] vetor2 = new double[10];

		String entrada = "";
		String stringVetor = "";

		double num = 0.0;

		// primeiro vetor
		for (int i = 0; i <= 9; i++) {

			entrada = JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º termo do 1º vetor");
			num = Double.parseDouble(entrada);

			vetor1[i] = num;
		}

		// segundo vetor
		for (int i = 0; i <= 9; i++) {

			entrada = JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º termo do 2º vetor");
			num = Double.parseDouble(entrada);

			vetor2[i] = num;
		}

		for (int i = 0; i <= 9; i++) {

			for (int j = 0; j <= 9; j++) {

				if (vetor1[i] == vetor2[j]) {

					stringVetor = stringVetor + "  " + vetor1[i];

				}
			}
		}

		JOptionPane.showMessageDialog(null, "Os números contidos em ambos vetores são: \n" + stringVetor);
		System.exit(0);
	}

}
