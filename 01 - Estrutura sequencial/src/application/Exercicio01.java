package application;

import java.util.Scanner;

public class Exercicio01 {

	/* FAÇA UM PROGRAMA PARA LER DOIS VALORES INTEIROS. E DEPOIS NA TELA A SOMA DESSES NÚMEROS
	 *  COM UMA MENSAGEM EXPLICATIVA. */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Digite dois valores inteiros para no final receber a soma deles.");
		
		System.out.print("Digite o primeiro número inteiro:  ");
		a = sc.nextInt();
		
		System.out.print("Digite o segundo número inteiro: ");
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("A SOMA DOS DOIS NÚMEROS É: " + soma);
		
		
		

	}

}
