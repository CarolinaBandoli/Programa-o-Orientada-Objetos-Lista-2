import javax.swing.JOptionPane;

public class Programa14 {

	public static void main(String[] args) {

		double[] vetor = new double[10];

		int i;
		int cont = 0;

		double num = 0.0;
		double adivinhar = 0.0;

		String entrada = "";
		String stringVetor = "";

		boolean acerto = false;

		for (i = 0; i <= 9; i++) {

			entrada = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º termo do vetor.");
			num = Double.parseDouble(entrada);

			vetor[i] = num;
			stringVetor = stringVetor + "  " + vetor[i];
		}

		do {

			entrada = JOptionPane.showInputDialog("Digite o valor a ser verificado: ");
			adivinhar = Double.parseDouble(entrada);

			for (i = 0; i <= 9; i++) {

				if (adivinhar == vetor[i]) {

					cont = 3;
					acerto = true;
				}
			}

			if (!acerto && cont != 3) {

				JOptionPane.showMessageDialog(null, "Você errou!\nDigite o valor a ser verificado:");
				cont = cont + 1;
			}

		} while (cont <= 2);

		if (acerto) {
			JOptionPane.showMessageDialog(null, "Você Ganhou!\n(:");
		}

		else {

			JOptionPane.showMessageDialog(null, "Você Perdeu!\n):");
		}
		
		System.exit(0);
	}

}
