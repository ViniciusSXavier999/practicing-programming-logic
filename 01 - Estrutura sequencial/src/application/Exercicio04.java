package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Fazer um programa que leia o número de um funcionário, seu número de horas
	 * trabalhadas, o valor que recebe por hora e calcula o salário desse
	 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
	 * casas decimais.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFunc;
		double numeroHorasTrab;
		double valorHoras;
		double salario;

		System.out.print("Digite o número do funcionario: ");
		numeroFunc = sc.nextInt();

		System.out.print("Número de horas trabalhadas: ");
		numeroHorasTrab = sc.nextDouble();

		System.out.print("Valor que recebe por hora: ");
		valorHoras = sc.nextDouble();
		System.out.println();

		salario = numeroHorasTrab * valorHoras;

		System.out.println("NÚMERO DO FUNCIONARIO: " + numeroFunc);
		System.out.printf("SALARIO $$%.2f", salario);

	}

}
