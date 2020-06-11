import javax.swing.JOptionPane;

public class Programa10 {

	public static void main(String[] args) {

		double notaAluno = 0.0;

		double notaMaior = 0.0;
		double notaMenor = 100.0;

		double[] vetorNota = new double[60];

		double aprovados = 0.0;
		double reprovados = 0.0;

		String entrada = "";

		for (int i = 0; i <= 59; i++) {

			entrada = JOptionPane.showInputDialog("Digite a nota do " + (i + 1) + "º aluno");
			notaAluno = Double.parseDouble(entrada);

			vetorNota[i] = notaAluno;
		}

		// aprovação e reprovação
		for (int i = 0; i <= 59; i++) {

			if (vetorNota[i] >= 60) {

				aprovados = (aprovados + 1);
			}

			else {

				reprovados = (reprovados + 1);
			}
		}

		aprovados = (aprovados * 100) / 5;
		reprovados = (reprovados * 100) / 5;

		JOptionPane.showMessageDialog(null, "Aprovados: " + aprovados + "%\nReprovados: " + reprovados + "%");

		// nota maior e menor
		for (int i = 0; i <= 59; i++) {

			if (notaMaior < vetorNota[i]) {

				notaMaior = vetorNota[i];
			}

			if (notaMenor > vetorNota[i]) {

				notaMenor = vetorNota[i];
			}
		}

		JOptionPane.showMessageDialog(null,
				"A menor nota da turma foi: " + notaMenor + "\nA maior nota da turma foi: " + notaMaior);
		
		
		System.exit(0);
		
	}

}
