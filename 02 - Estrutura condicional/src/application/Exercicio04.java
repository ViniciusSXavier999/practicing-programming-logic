package application;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial;
		int horaFinal;
		
		System.out.println("Digite a hora inicial do jogo: ");
		horaInicial = sc.nextInt();
		
		System.out.println("Digite a hora final do jogo: ");
		horaFinal = sc.nextInt();
		
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;   
		} else {
			  duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		

	}

}
