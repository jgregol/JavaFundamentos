package br.com.gregol.fundamentos.exercicios.loopsdowhile;

/**
 * @author Gregol
 * Escreva um programa que escreva os n�meros entre 1000 e 100. 
 */

public class Exercicio01 {
	
	public static void main(String[] args) {

		int x = 1000;

		do {
			System.out.println(x + " ");
			x--;
		} while (x >= 100);
	}
}