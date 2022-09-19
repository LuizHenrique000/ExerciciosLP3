package exercicioAvaliativo.string;

public class TopicoString {
	public static void main(String[] args) {
		String texto = "luiz";
		String outroTexto = "henrique";

		// isEmpty
		if (texto.isEmpty()) {
			System.out.println("Texto vazio");
		}
		System.out.println(texto);

		// Length
		int tamanhoTexto = texto.length();
		System.out.println("O texto possui: " + tamanhoTexto + " caracteres");

		// compareTo
		if (texto.compareTo(outroTexto) == 0) {
			System.out.println("Os textos são iguais");
		}
		System.out.println("Os textos são diferentes");

		// charAt
		System.out.println(texto.charAt(0));

		// codePointAt
		System.out.println(texto.codePointAt(0));

		// startsWith
		if (texto.startsWith("l")) {
			System.out.println("Seu nome é Luiz");
		} else if (texto.startsWith("j")) {
			System.out.println("Você é um juiz");
		}

		// indexOf
		int posicao = texto.indexOf("z");
		System.out.println("A letra especificada aparece na: " + posicao + " posicao");

		// Equals
		// Diferente do compareTo que retorna 0 de acordo com o resultado, o Equals
		// retorna um boolean
		if (texto.equals(outroTexto)) {
			System.out.println("Textos iguais");
		} else {
			System.out.println("Textos diferentes");
		}

		// isBlank
		if (texto.isBlank()) {
			System.out.println("O texto contém espaços vazios");
		} else {
			System.out.println("O texto não contém espaços vazios");
		}

		// toUppercase
		String caixaAlta = texto.toUpperCase();
		System.out.println(caixaAlta);

		// toLowerCase
		String caixaBaixa = texto.toLowerCase();
		System.out.println(caixaBaixa);

		// Trim
		String texto2 = "          Luiz";
		System.out.println(texto2);
		String textoSemEspaco = texto2.trim();
		System.out.println(textoSemEspaco);
		
	}
}
