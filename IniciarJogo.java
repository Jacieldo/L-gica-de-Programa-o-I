package jogoDaVelha;

import java.util.Scanner;

public class IniciarJogo {
	
	public void jogar () {
		Jogo jogo = new Jogo();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("__________");
		System.out.println("|         |");
		System.out.println("Jogador 1: Joga com o 'X'");
		System.out.println("Jogador 2: Joga com o '0'");
		System.out.println("|__________|");
		System.out.println("\n");
		jogo.getTabuleiro().printaTabuleiro();
		
		int cont = 1;
		
		while (true) {
			System.out.println("Jogador " + cont + ": " +"Faça sua jogada!");
			int linha = entrada.nextInt();
			int coluna = entrada.nextInt();
			jogo.Jogar(linha,coluna, jogo.getJogador(cont).getSimbolo());
			System.out.println("\n");
			jogo.getTabuleiro().printTabuleiro();
			if (jogo.checaJogo()==true) {
				{
					if (jogo.checaEmpate()==true) {
						System.out.println("Ninguém Ganhou!!");
						System.out.println("\n");
					} else {
						System.out.println("Parabéns " + cont +"!" +"Você Ganhou!");
						System.out.println("\n");					
					}
					break;
				}
			}
			if (cont%2==0) {
				cont--;
			} else {
				cont++;
			}
		}
	}

}
