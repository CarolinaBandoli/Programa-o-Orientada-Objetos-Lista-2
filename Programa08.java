import java.awt.Graphics;
import javax.swing.*;

public class Programa08 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
	

		Programa08 tela = new Programa08();
		tela.setSize(300,300); // dimensiona a tela
		tela.setVisible(true); // exibe a tela

	}

	public void paint(Graphics g) {
		super.paint(g);
		int x = 0, y = 0;
		int circulo = num_rand();


		for (int i = 1; i <= circulo; i++) {
			x = x + 20;
			y = y + 20;
			g.drawOval(x, y, 30, 30);
		}

	}

	public static int num_rand() {

		int y = 1 + (int) (Math.random() * 10);

		return y;
	}
}
