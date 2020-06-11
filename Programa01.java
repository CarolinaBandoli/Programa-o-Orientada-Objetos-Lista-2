import javax.swing.JOptionPane;

public class Programa01 {

	public static void main(String[] args) {
		
		double aplicacao = 0.00; // valor que deseja aplicar
		double juros = 0.00; // valor do juros
		int meses = 0; // quantidade de meses aplicados
		double valorFinal = 0.00;
		String entrada = "";

		entrada = JOptionPane.showInputDialog("Digite o valor de sua aplicação:");
		aplicacao = Double.parseDouble(entrada);

		entrada = JOptionPane.showInputDialog("Digite o valor dos juros :");
		juros = Double.parseDouble(entrada);

		entrada = JOptionPane.showInputDialog("Digite a quantidade de meses que o dinheiro ficará aplicado:");
		meses = Integer.parseInt(entrada);

		valorFinal = aplicacao * ((1 + (juros/100)) * meses);
		
		JOptionPane.showMessageDialog(null, "O valor final será de:\n" + valorFinal);

		
		System.exit(0);
	}

}
