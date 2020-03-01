package br.com.gregol.fundamentos.exercicios.loopswhile;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que leia um n�mero informado pelo usu�rio
 * e em seguida escreva uma mensagem indicando se o n�mero � par ou impar.
 * (Considere n�mero par o n�mero cujo resto da divis�o por 2 seja igual a Zero) 
 */

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Informe um n�mero para verificar se � PAR ou �MPAR");
		int numero = s.nextInt();
		if (numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � PAR.");
		} else {
			System.out.println("O n�mero " + numero + " � �MPAR.");
		}
		s.close();
		System.out.println("Fim do programa!");
	}
}