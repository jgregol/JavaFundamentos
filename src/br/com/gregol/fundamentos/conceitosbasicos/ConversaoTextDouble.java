package br.com.gregol.fundamentos.conceitosbasicos;

import java.util.Scanner;

public class ConversaoTextDouble {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero:");
		double numero1 = Double.parseDouble(teclado.nextLine());

		System.out.println("Digite o segundo n�mero:");
		double numero2 = Double.parseDouble(teclado.nextLine());

		double soma = numero1 + numero2;

		String mensagem = String.format("O resultado da soma de %f, %f � %f", numero1, numero2, soma);
		System.out.println(mensagem);
		teclado.close();
	}

}
