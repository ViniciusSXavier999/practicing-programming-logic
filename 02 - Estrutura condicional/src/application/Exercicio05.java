package application;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int codItem, quantItem;
		
		double valorTotal = 0;
		
		System.out.println("Digite o código do item: ");
		codItem = sc.nextInt();
		
		System.out.println("Digite a quantidade de item: ");
		quantItem = sc.nextInt();
		
		if (codItem == 1) {
			valorTotal = quantItem * 4;
			System.out.println("Quantidade de cachorro quente: " + quantItem);
			System.out.println("valor a pagar: " + valorTotal);
			
		} else if (codItem == 2) {
			valorTotal = quantItem * 4.50;
			System.out.println("Quantidade de X-Salada: " + quantItem);
			System.out.println("Valor a pagar: " + valorTotal);
			
		} else if (codItem == 3) {
			valorTotal = quantItem * 5.00;
			System.out.println("Quantidade de X-Bacon: " + quantItem);
			System.out.println("Valor a pagar: " + valorTotal);
			
		} else if (codItem == 4) {
			valorTotal = quantItem * 2.00;
			System.out.println("Quantidade de Torrada simples: " + quantItem);
			System.out.println("Valor a pagar: " + valorTotal);
			
		} else if (codItem == 5) {
			valorTotal = quantItem * 1.50;
			System.out.println("Quantidade de Refrigerante: " + quantItem);
			System.out.println("Valor a pagar: " + valorTotal);
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Valor total " + valorTotal);

	}

}
