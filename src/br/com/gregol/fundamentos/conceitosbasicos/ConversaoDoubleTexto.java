package br.com.gregol.fundamentos.conceitosbasicos;

import java.util.Scanner;

public class ConversaoDoubleTexto {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um n�mero fracionado:");
		double numero = teclado.nextDouble();

		// convertendo um double para String
		String numeroParaTexto = Double.toString(numero);
		System.out.println("Esse n�mero foi convertido para texto: " + numeroParaTexto);
		teclado.close();
	}

}
