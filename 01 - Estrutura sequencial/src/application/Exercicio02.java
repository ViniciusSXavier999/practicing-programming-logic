package application;

import java.util.Scanner;

public class Exercicio02 {
	
	/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor
	 *  da área deste círculo com 4 casas decimais. */

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio;
		double valorArea;
		
		System.out.print("Digite o valor de raio: ");
		raio = sc.nextDouble();
		
		valorArea = pi * (raio * raio); 
		System.out.printf("O valor da area é: %.4f", valorArea);

	}

}
