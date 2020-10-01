package jogoDaVelha;

public class Tabuleiro {
	
	private Posicao[][] posicoes = new Posicao[3][3];
	
	//Criar matriz 3x3 para tabuleiro
	public Tabuleiro() {
		for (int i=0; i<posicoes.length; i++) {
			for (int j=0; j<posicoes.length; j++) {
				if (posicoes[i][j]==null) {
					(posicoes[i][j]) = new Posicao(i,j);
					(posicoes[i][j]) = setSituacao(false);
				}
			}
		}
	}
	
	public int getTamanhoLinhas() {
		return (posicoes.length);
	}
	
	public int getTamanhoColunas() {
		return (posicoes[0].length);
	}
	
	public Posicao[][] getPosicoes() {
		return (this.posicoes);
	}

	public void printaTabuleiro() {
		System.out.println("  0     1    2");
		System.out.println("     |     |");
		System.out.println("0  "+posicoes[0][0].getSimbolo()+"  |  "+posicoes[0][1].getSimbolo()+"  |  "+posicoes[0][2].getSimbolo());
		System.out.println("  __|____|__");
		System.out.println("    |    |");
		System.out.println("1  "+posicoes[1][0].getSimbolo()+"  |  "+posicoes[1][1].getSimbolo()+"  |  "+posicoes[1][2].getSimbolo());
		System.out.println("  __|____|__");
		System.out.println("    |    |");
		System.out.println("2  "+posicoes[1][0].getSimbolo()+"  |  "+posicoes[1][1].getSimbolo()+"  |  "+posicoes[2][2].getSimbolo());
		System.out.println("    |    |");
		System.out.println("\n");
	}
}