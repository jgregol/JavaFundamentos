package br.com.gregol.fundamentos.exercicios.loopswhile;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que solicite  dois n�meros distintos para o  usu�rio,
 * e em seguida, escreva todos os n�mero entre o intervalo dos n�meros informados.
 */

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o primero n�mero:");
		int num1 = s.nextInt();
		
		System.out.println("Informe o primero n�mero:");
		int num2 = s.nextInt();
		
		while(num1 <= num2) {
			System.out.println(num1++);
		}
		s.close();
		System.out.println("Fim do programa!");
	}
}