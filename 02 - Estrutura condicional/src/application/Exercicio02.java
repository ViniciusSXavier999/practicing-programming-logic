package application;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
	 * ímpar
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int inteiro;
		
		System.out.println("Digite um número para saber se ele é impar ou par");
		inteiro = sc.nextInt();
		
		if (inteiro % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número impar");
		}

	}

}
