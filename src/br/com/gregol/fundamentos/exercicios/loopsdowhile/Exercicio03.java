package br.com.gregol.fundamentos.exercicios.loopsdowhile;

/**
 * @author Gregol
 * Escreva todos os n�meros pares entre o n�mero 101 e o n�mero 200. 
 */

public class Exercicio03 {
	
	public static void main(String[] args) {

		int x = 101;

		do {
			if (x % 2 == 0) {
				System.out.println(x);
			}
			x++;
		} while (x <= 200);
	}
}