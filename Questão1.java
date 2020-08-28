package lp1.aula01;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		float troco=0;
		System.out.print("Quanto foi pago: ");
		Scanner teclado = new Scanner(System.in);
		float num1 = teclado.nextFloat();
		System.out.print("Qual o valor do produto: ");
		Scanner teclado2 = new Scanner(System.in);
		float num2 = teclado.nextFloat();
		
		troco = num1 - num2;
		
		System.out.println("O troco deve ser: " +troco);
		

	}

}
