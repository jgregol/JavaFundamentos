package br.com.gregol.fundamentos.exercicios.condicionalif;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que solicite a idade do usu�rio e em seguida escreva
 * a mensagem �Voc� � adulto!� caso a idade informada seja maior ou igual a 18. 
 */

public class Exercicio03 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Informe sua idade:");
		int idade = s.nextInt();
		if (idade >= 18) {
			System.out.println("Voc� � adulto!");
		}
		s.close();
		System.out.println("Fim do programa!");
	}
}
