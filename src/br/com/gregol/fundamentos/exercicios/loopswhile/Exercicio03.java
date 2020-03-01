package br.com.gregol.fundamentos.exercicios.loopswhile;

/**
 * @author Gregol
 * Escreva todos os n�meros impares entre o n�mero 101 e o n�mero 200. 
 */

public class Exercicio03 {
	
	public static void main(String[] args) {

		int inicio = 101;
		int fim = 200;
		while (inicio <= fim) {
			if (inicio % 2 == 1) {
				System.out.println(inicio);
			}
			inicio++;
		}
		System.out.println("Fim do programa!");
	}
}