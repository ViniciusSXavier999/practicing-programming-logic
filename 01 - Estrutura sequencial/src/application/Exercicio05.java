package application;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
	 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
	 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca1;
		int numPeca1;
		int valorUnitarioPeca1;
		
		int codPeca2;
		int numPeca2;
		int valorUnitarioPeca2;
		
		System.out.println("Digite o código da peça 1: ");
		codPeca1 = sc.nextInt();
		
		System.out.println("Digite o número de peças 1: ");
		numPeca1 = sc.nextInt();
		
		System.out.println("Digite o valor unitario de cada peça 1: ");
		valorUnitarioPeca1 = sc.nextInt();
		
		int valorPecas1 = numPeca1 * valorUnitarioPeca1;
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Digite o código da peça 2: ");
		codPeca2 = sc.nextInt();
		
		System.out.println("Digite o número de peças 2: ");
		numPeca2 = sc.nextInt();
		
		System.out.println("Digite o valor unitario de cada peça 2: ");
		valorUnitarioPeca2 = sc.nextInt();
		
		int valorPecas2 = numPeca2 * valorUnitarioPeca2;
		
		int valorTotal = valorPecas1 + valorPecas2;
		
		System.out.println("O valor a ser pago é: " + valorTotal);
		
		
		
		
		

	}

}
