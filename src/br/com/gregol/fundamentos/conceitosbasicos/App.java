package br.com.gregol.fundamentos.conceitosbasicos;

public class App {

	public static void main(String[] args) {

		// Chamada do m�todo "calcularDesconto" da classe Util
		int valor = 120;
		int percentual = 30;
		double desconto = Util.calcularDesconto(valor, percentual);
		System.out.println(desconto);

		// Chamada do m�todo "escreverMensagem" da classe Util
		String nome = "Jo�o";
		String nomeCompleto = nome.concat("Silva");
		Util.escreverMensagem(nomeCompleto);

	}
}