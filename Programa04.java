import javax.swing.JOptionPane;

public class Programa04 {

	public static void main(String[] args) {

		int[] vetor = new int[10];
		int valoresVetor = 0;
		int adivinhar = 0;
		int cont = 1;
		boolean acerto = false;

		String entrada = "";
		String stringVetor = "";

		// criando o vetor

		for (int i = 0; i <= 9; i++) {

			entrada = JOptionPane.showInputDialog("Digite o valor " + (i + 1) + " de seu vetor.");
			valoresVetor = Integer.parseInt(entrada);
			vetor[i] =  valoresVetor;
			stringVetor = stringVetor + " " + valoresVetor;
		}

		// adivinhando o vetor

		do {

			entrada = JOptionPane.showInputDialog(cont + "ª chance.\nDigite um número:");
			adivinhar = Integer.parseInt(entrada);

			for (int i = 0; i <= 9; i++) {

				if (adivinhar == vetor[i]) {

					acerto = true;

					i = 9;

				}

				else {
					acerto = false;
				}

			}

			if (acerto) {
				JOptionPane.showMessageDialog(null, "Você Ganhou!");
				cont = 6;

			}

			else {
				JOptionPane.showMessageDialog(null, "Você errou, tente novamente!");
				cont = cont + 1;

			}
		
		} while (cont <= 5);
		if (!acerto) {
			JOptionPane.showMessageDialog(null, "Você Perdeu!\nOs números eram: " + stringVetor);
		}
		System.exit(0);
	}
}
