package jogodavelha;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Event.*;



public class Tabuleiro extends JFrame {	
	JButton cor; //Botão apenas para restaurar a cor dos botoes
	JButton [] Botoes; //Cria um vetor para botoes
	JPanel PainelJogo; //Painel onde fica os botoes
	int vazJogador; //Para verificar a vez do jogador
	String Simbolo; //Para X ou O
	
	public Tabuleiro () { //Metodo Construtor
		super("Jogo da Velha - JG");
		((JComponent)getContentPane()).setBorder(new EmptyBorder(5, 5, 5, 5)); //Borda ao redor dos componentes
		
			PainelJogo = new JPanel(); //Cria um novo Painel
			PainelJogo.setLayout(new GridLayout(3,3,10,10)); //Atribui um Layout do tipo GridLayout
			cor = new JButton(); //Cria botão p restaurar a cor dos outros botoes
			
			Botoes = new JButton[9]; //Vetor de tamanho 9
			for (int i = 0; i < 9; i++) {
				Botoes[i] = new JButton(""); //Cria e atribui os botoes a matriz
			}
			
			
			//Formação dos Botoes do Jogo
			Botoes[0].setFont(new Font("Calibri", Font.BOLD, 70)); //Determina a fonte do botão
			PainelJogo.add(Botoes[0]); //Adiciona o botão ao painel
			
			Botoes[1].setFont(new Font("Calibri", Font.BOLD, 70)); //Determina a fonte do botão
			PainelJogo.add(Botoes[1]); //Adiciona o botão ao painel
			
			Botoes[2].setFont(new Font("Calibri", Font.BOLD, 70)); //Determina a fonte do botão
			PainelJogo.add(Botoes[2]); //Adiciona o botão ao painel
			
			Botoes[3].setFont(new Font("Calibri", Font.BOLD, 70)); //Determina a fonte do botão
			PainelJogo.add(Botoes[3]); //Adiciona o botão ao painel
			
			Botoes[4].setFont(new Font("Calibri", Font.BOLD, 70)); //Determina a fonte do botão
			PainelJogo.add(Botoes[4]); //Adiciona o botão ao painel
			
			Botoes[5].setFont(new Font("Calibri", Font.BOLD, 70)); //Determina a fonte do botão
			PainelJogo.add(Botoes[5]); //Adiciona o botão ao painel
			
			Botoes[6].setFont(new Font("Calibri", Font.BOLD, 70)); //Determina a fonte do botão
			PainelJogo.add(Botoes[6]); //Adiciona o botão ao painel
			
			Botoes[7].setFont(new Font("Calibri", Font.BOLD, 70)); //Determina a fonte do botão
			PainelJogo.add(Botoes[7]); //Adiciona o botão ao painel
			
			Botoes[8].setFont(new Font("Calibri", Font.BOLD, 70)); //Determina a fonte do botão
			PainelJogo.add(Botoes[8]); //Adiciona o botão ao painel
			
//Fim da Formatação dos botoes
			
			
			add(PainelJogo); //Adiciona o painel a Janela
			setLocation(470,200); //Determina a localização da janela
			setSize(400,400); //Determina o tamanho da Janela
			setVisible(true); //Torna a Janela visivel
		
		
		
		
	}
 
}
