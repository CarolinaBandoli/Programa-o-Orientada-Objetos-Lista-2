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
					"Digite um n�mero para saber sua parte inteira e sua parte fracion�ria.\nDigite a qualquer momento o n�mero 0 para sair do programa!");
			num = Double.parseDouble(entrada);

			if (num != 0) {
								
				numInt = (int) num;
				JOptionPane.showMessageDialog(null, "A parte inteira �: " + numInt);
				
				numFrac = num - numInt;
				JOptionPane.showMessageDialog(null, String.format("A parte fracion�ria �: = %.2f", numFrac));
			
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
