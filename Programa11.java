import java.util.Locale;

import javax.swing.JOptionPane;

public class Programa11 {

	public static void main(String[] args) {
		
		double num = 1;
		int numInt;
		double numFrac;
		String entrada = "";
		
		Locale.setDefault(Locale.ITALIAN);
		
		do {

			entrada = JOptionPane.showInputDialog(
					"Digite um número para saber sua parte inteira e sua parte fracionária.\nDigite a qualquer momento o número 0 para sair do programa!");
			num = Double.parseDouble(entrada);

			if (num != 0) {
								
				numInt = (int) num;
				JOptionPane.showMessageDialog(null, "A parte inteira é: " + numInt);
				
				numFrac = num - numInt;
				JOptionPane.showMessageDialog(null, String.format("A parte fracionária é: = %.2f", numFrac));
			
				numInt = 0;
				numFrac = 0.0;
			}

			else {

				JOptionPane.showMessageDialog(null, "BYE");
			}

		} while (num != 0);

	
		System.exit(0);
	}

}
