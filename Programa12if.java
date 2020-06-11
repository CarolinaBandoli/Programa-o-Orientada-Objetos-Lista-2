import javax.swing.JOptionPane;

public class Programa12if {

	public static void main(String[] args) {

		int[] vetor = new int[6];

		int vezes = 0;
		int q1 = 0, q2 = 0, q3 = 0, q4 = 0, q5 = 0, q6 = 0;
		int jogo;

		String entrada = "";
		String stringVetor = "";

		entrada = JOptionPane.showInputDialog("Digite o número de vezes que o dado será jogado:");
		vezes = Integer.parseInt(entrada);

		for (int i = 1; i <= vezes; i++) {

			jogo = jogarDado();

			System.out.println(jogo);

			if (jogo == 1) {

				q1 = q1 + 1;
				vetor[0] = q1;
			}

			else if (jogo == 2) {

				q2 = q2 + 1;
				vetor[1] = q2;
			}

			else if (jogo == 3) {

				q3 = q3 + 1;
				vetor[2] = q3;
			}

			else if (jogo == 4) {

				q4 = q4 + 1;
				vetor[3] = q4;
			}

			else if (jogo == 5) {

				q5 = q5 + 1;
				vetor[4] = q5;
			}

			else if (jogo == 6) {

				q6 = q6 + 1;
				vetor[5] = q6;
			}

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
