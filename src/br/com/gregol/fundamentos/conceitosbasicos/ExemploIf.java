package br.com.gregol.fundamentos.conceitosbasicos;

import java.util.Random;
import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int sorteado = new Random().nextInt(50);
		System.out.println("Digite um número entre 0 e 50");
		int numero = Integer.parseInt(teclado.nextLine());
		if (numero == sorteado) {
			System.out.println("Parabéns, você acertou!");
			System.out.println("O número sorteado era: " + sorteado);
		}
		System.out.println("Fim da aplicação");
		teclado.close();
	}
}