import javax.swing.JOptionPane;

public class Programa02 {

	public static void main(String[] args) {
	
		double salario = 0.0;
		double horasTrabalhadas = 0.0;
		double valorHora = 0.0;
		int numPessoa = 0;
		double desconto = 0.0;
		String entrada = "";

		entrada = JOptionPane.showInputDialog("Digite o número de horas trabalhadas:");
		horasTrabalhadas = Double.parseDouble(entrada);

		entrada = JOptionPane.showInputDialog("Digite o valor da hora trabalhada:");
		valorHora = Double.parseDouble(entrada);

		entrada = JOptionPane.showInputDialog("Digite o número de dependentes:");
		numPessoa = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog("Digite os descontos:");
		desconto = Double.parseDouble(entrada);

		salario = horasTrabalhadas * valorHora + (50 * numPessoa) - desconto;

		JOptionPane.showMessageDialog(null, "O valor do salário é:\n" + salario);

		System.exit(0);
	}

}
