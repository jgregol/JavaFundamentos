package br.com.gregol.fundamentos.exercicios.condicionalswitch;

import java.util.Scanner;

/**
 * @author Gregol
 * Escreva um programa que apresente uma lista com as op��es �1 - Sacar�,
 * �2 - Depositar�, �3 - verificar saldo�. Em seguida solicite que o usu�rio
 * informe um n�mero entre 1 e 3. Caso o usu�rio tenha informado o n�mero 1 
 * apresente a mensagem �voc� escolheu a op��o sacar�, caso o usu�rio tenha 
 * informado o n�mero 2 apresente a mensagem �voc� escolheu a op��o depositar�,
 * caso o usu�rio tenha informado o n�mero 3, apresente a mensagem �voc� escolheu
 * a op��o verificar saldo�. Caso o usu�rio tenha informado um n�mero fora do 
 * range(1,2,3) apresente a mensagem �Op��o inv�lida�.
 */

public class Exercicio01 {
	
	public static void main(String[] args) {

		System.out.println("|---------------------|");
		System.out.println("| 1 - Sacar           |");
		System.out.println("| 2 - Depositar       |");
		System.out.println("| 3 - Verificar Saldo |");
		System.out.println("|---------------------|\n");

		System.out.println("Digite uma op��o entre 1 e 3:");

		Scanner teclado = new Scanner(System.in);
		String opcao = teclado.nextLine();

		switch (opcao) {
		case "1":
			System.out.println("Voc� escolheu a op��o Sacar");
			break;
		case "2":
			System.out.println("Voc� escolheu a op��o Depositar");
			break;
		case "3":
			System.out.println("Voc� escolheu a op��o Verificar Saldo");
			break;
		default:
			System.out.println("Op��o Inv�lida");
			break;
		}
		teclado.close();
		System.out.println("Fim do programa!");
	}
}