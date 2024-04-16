package application;

import java.util.Scanner;

public class Exercicio03 {

	/*
	 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
	 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
	 * segundo a fórmula: DIFERENCA = (A * B - C * D)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int A, B, C, D, dif;
		
		System.out.print("Digite o primeiro valor: ");
		A = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		B = sc.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		C = sc.nextInt();
		
		System.out.print("Digite o quarto valor: ");
		D = sc.nextInt();

		dif = A * B - C * D;

		System.out.println("DIFERENCA = " + dif);

	}

}
