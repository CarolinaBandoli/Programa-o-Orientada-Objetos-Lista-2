import javax.swing.JOptionPane;

public class Programa09 {

	public static void main(String[] args) {
		
		double valorDollar;
		double valorReal;
		double valorConvertido;
		int opcao;
		int repetir = 0;

		String entrada = "";

		entrada = JOptionPane.showInputDialog("Digite quantos Reais equivalem a um Dóllar:");
		valorDollar = Double.parseDouble(entrada);

		do {
			entrada = JOptionPane.showInputDialog("Digite quantos Reais deseja converter:");
			valorReal = Double.parseDouble(entrada);

			valorConvertido = converte(valorDollar, valorReal);

			JOptionPane.showMessageDialog(null, "O valor em dollares que você possui é de:\n" + valorConvertido);

			opcao = JOptionPane.showConfirmDialog(null, "Deseja fazer uma nova conversão?");

			if (opcao == 0) {

				repetir = 0;
			}

			else if (opcao == 1) {

				repetir = 1;

			}
		} while (repetir == 0);

		JOptionPane.showMessageDialog(null, "BYE");

		System.exit(0);
	}

	public static double converte(double valorDollar, double valorReal) {

		double resultado = valorReal / valorDollar;

		return resultado;
	}

}
