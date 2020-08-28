package lp1.aula01;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		float delta, a, b, c;
		double x1=0, x2=0;
		
		System.out.println("Digite os valores de");
		System.out.print("a: ");
		Scanner ax = new Scanner(System.in);
		float num1 = ax.nextFloat();
		System.out.print("b: ");
		Scanner bx = new Scanner(System.in);
		float num2 = bx.nextFloat();
		System.out.print("c: ");
		Scanner cx = new Scanner(System.in);
		float num3 = cx.nextFloat();
		
		delta = ((num2 * num2)-(4 * num1 * num3));
		
		x1 = ((-num2 + (Math.sqrt(delta))) / (2*num1));
		x2 = (-num2 - (Math.sqrt(delta))) / (2*num1);
		
		System.out.println("X' = " +x1);
		System.out.println("X'' = " +x2);		
		
		System.out.println("Valor de Delta é: "+delta);

	}

}
