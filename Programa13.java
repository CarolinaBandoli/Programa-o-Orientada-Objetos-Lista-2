import javax.swing.JOptionPane;

public class Programa13 {

	public static void main(String[] args) {

		int[] vetor = new int[9];
		int num;
		int i = 0;
		int quantidade = 0;

		String entrada = "";
		String stringVetor = "";

		do {
			do {

				entrada = JOptionPane.showInputDialog("Digite um número. (0 ou 1)");
				num = Integer.parseInt(entrada);

				if (num != 0 && num != 1) {

					JOptionPane.showMessageDialog(null, "Número inválido, digite novamente.");
				}

				else {

					vetor[i] = num;
					stringVetor = stringVetor + "  " + num;

					if (num == 1) {

						quantidade = quantidade + 1;
					}

					i = i + 1;
				}
			} while (num != 0 && num != 1);

		} while (i <= 7);

		if (quantidade % 2 == 0) {

			vetor[8] = 1;
			JOptionPane.showMessageDialog(null, "O vetor é:\n" + stringVetor + "  " + vetor[8]);
		}

		else {

			vetor[8] = 0;
			JOptionPane.showMessageDialog(null, "O vetor é:\n" + stringVetor + "  " + vetor[8]);
		}
		System.exit(0);
	}

}
