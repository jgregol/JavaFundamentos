package br.com.gregol.fundamentos.exercicios.loopswhile;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que solicite um n�mero ao usu�rio e em seguida escreva
 * o valor do n�mero informado multiplicado por 5. O programa deve continuar
 * solicitando novos n�meros at� que o usu�rio digite um n�mero negativo. 
 */

public class Exercicio04 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int numero = 0;

		while (numero > -1) {
			System.out.println("Informe um n�mero:");
			numero = s.nextInt();
			if (numero > -1) {
				System.out.println("A multiplica��o �: 5 x " + numero + " = " + (numero * 5));
			}
		}
		s.close();
		System.out.println("Fim do programa!");
	}
}