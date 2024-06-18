package application;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
	 * negativo ou não.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int inteiro;
		
		System.out.println("Digite um numero inteiro: ");
		inteiro = sc.nextInt();
		
		if (inteiro < 0) {
			System.out.println(" NÚMERO NEGATIVO ");
		} else {
			System.out.println(" NÚMERO POSITIVO ");
		}

	}

}
