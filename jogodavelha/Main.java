package jogodavelha;

import javax.swing.JFrame;


public class Main extends JFrame {

	public static void main(String[] args) {
		Tabuleiro Tela = new Tabuleiro();
		Tela.setDefaultCloseOperation(EXIT_ON_CLOSE); //Ao fechar a tela, fecha a aplicação
		Tela.setResizable(false); //Faz com que a tela não seja Maximizada
		
	}

}
