import javax.swing.JOptionPane;

public class Programa12 {

	public static void main(String[] args) {

		int[] vetor = new int[6];

		int vezes = 0;

		int jogo;

		String entrada = "";
		String stringVetor = "";

		entrada = JOptionPane.showInputDialog("Digite o número de vezes que o dado será jogado:");
		vezes = Integer.parseInt(entrada);

		for (int i = 1; i <= vezes; i++) {

			jogo = jogarDado();

			System.out.println(jogo);

			vetor[jogo - 1] = vetor[jogo - 1] + 1;
		}

		for (int i = 0; i <= 5; i++) {

			stringVetor = stringVetor + "A face " + (i + 1) + "  ocorreu  " + vetor[i] + "\n";
		}

		JOptionPane.showMessageDialog(null, stringVetor);
	}

	public static int jogarDado() {

		int resultado = 1 + (int) (Math.random() * 6);

		return resultado;

	}

}
