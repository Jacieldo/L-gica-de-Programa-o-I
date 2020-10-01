package jogoDaVelha;

public class Jogador {
	private char simbolo;
	private static int jogador = 0;
	
	public Jogador() {
		if (this.jogador==0) {
			this.simbolo = ('X');
		} else {
			this.simbolo = ('0');
		}
		jogador++;
	}
	
	public char getSimbolo() {
		return this.simbolo;
	}
}
