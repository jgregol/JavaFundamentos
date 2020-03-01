package br.com.gregol.fundamentos.exercicios.loopswhile;

import java.util.Scanner;

/**
 * @author Gregol
 *  Escreva um programa que solicite um n�mero para o usu�rio e em
 *  seguida escreva uma mensagem informando se o n�mero informado �
 *  m�ltiplo de 5. Para que um n�mero seja m�ltiplo de 5, ele deve ser
 *  maior ou igual a 5 e o resto da divis�o por 5 deve ser igual a zero.
 */

public class Exercicio01 {

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
