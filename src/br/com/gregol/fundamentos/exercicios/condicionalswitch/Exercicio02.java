package br.com.gregol.fundamentos.exercicios.condicionalswitch;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que solicite o nome de um dos tr�s pa�ses com mais t�tulos
 * da copa do mundo, em seguida escreva uma mensagem ao usu�rio informando se a
 * resposta est� correta ou errada. Considere os tr�s pa�ses com mais t�tulos como
 * sendo BRASIL, IT�LIA E ALEMANHA. (Dica: tente utilizar um switch sem breaks). 
 */

public class Exercicio02 {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Infome um dos 3 pa�ses com mais t�tulos mundiais:");
		String opcao = teclado.nextLine();

		switch (opcao) {
		case "Brasil":
		case "It�lia":
		case "Alemnaha":
			System.out.println("Resposta Correta!");
		default:
			System.out.println("Resposta Incorreta!");
		}
		teclado.close();
		System.out.println("Fim do programa!");
	}
}