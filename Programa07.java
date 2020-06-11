import javax.swing.JOptionPane;

public class Programa07 {

	public static void main(String[] args) {
		
		int aleatorio = 0;
		int numAleatorio;
		int adivinhar;
		int tentativa = 1;
		String entrada = "";

		numAleatorio = aleat(aleatorio);
		JOptionPane.showMessageDialog(null, numAleatorio);

		entrada = JOptionPane.showInputDialog("Digite um número:");
		adivinhar = Integer.parseInt(entrada);

		do {
			if (adivinhar != numAleatorio) {

				tentativa = tentativa + 1;

				if (adivinhar < numAleatorio) {

					JOptionPane.showMessageDialog(null,
							"Você errou!\n O número sorteado é maior que o que você digitou!");

				} else {

					JOptionPane.showMessageDialog(null,
							"Você errou!\n O número sorteado é menor que o que você digitou!");

				}

				entrada = JOptionPane.showInputDialog("Digite um número:");
				adivinhar = Integer.parseInt(entrada);

			}
		} while (adivinhar != numAleatorio);

		JOptionPane.showMessageDialog(null, "Você acertou na " + tentativa + "ª tentativa!");
	
		System.exit(0);
	}

	public static int aleat(int aleatorio) {

		int x = 1 + (int) (Math.random() * 100);

		return x;
	}

}
