import javax.swing.JOptionPane;

public class Programa05 {

	public static void main(String[] args) {
		
		int[] vetor1 = { 2, 5, 7 };
		int[] vetor2 = new int[15];
		int valoresVetor = 0;
		String entrada = "";
		String stringVetor2 = "";
		String stringVetor1 = "2 5 7";

		boolean contido = false;

		for (int i = 0; i <= 14; i++) {

			entrada = JOptionPane.showInputDialog("Digite o valor " + (i + 1) + " de seu vetor.");
			valoresVetor = Integer.parseInt(entrada);
			vetor2[i] = valoresVetor;
			stringVetor2 = stringVetor2 + " " + valoresVetor;

		}

		for (int i = 0; i <= 12; i++) {

			if (vetor2[i] == vetor1[0] && vetor2[i + 1] == vetor1[1] && vetor2[i + 2] == vetor1[2]) {

				contido = true;
				i = 13;

			} else {
				contido = false;
			}

		}

		if (contido) {
			
			JOptionPane.showMessageDialog(null,
					"O vetor: " + stringVetor1 + "\nEstá contido no vetor: " + stringVetor2);

		} else {

			JOptionPane.showMessageDialog(null,
					"O vetor: " + stringVetor1 + "\nNão está contido no vetor: " + stringVetor2);
		}
		System.exit(0);
	}

}
