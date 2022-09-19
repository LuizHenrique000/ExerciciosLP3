package exercicioAvaliativo.list;

import java.util.ArrayList;

public class TopicoList {

	public static void main(String[] args) {
		String fruta1 = "Abacaxi";
		String fruta2 = "Manga";
		String fruta3 = "Banana";
		String fruta4 = "Abacate";

		ArrayList<String> frutas = new ArrayList<>();

		// Add
		frutas.add(fruta1);
		frutas.add(fruta2);
		frutas.add(fruta3);
		frutas.add(fruta4);
		System.out.println("Frutas adicionadas");
		System.out.println(frutas);

		// Remove
		frutas.remove(3);
		System.out.println("Fruta removida");
		System.out.println(frutas);

		// Contains
		if (frutas.contains("Abacaxi")) {
			System.out.println("Temos abacaxi");
		} else {
			System.out.println("Não temos abacaxi");
		}

		// Get
		String fruta = frutas.get(0);
		System.out.println("Fruta selecionada: " + fruta);

		// Set
		frutas.set(0, "Morango");
		System.out.println("Fruta alterada");
		System.out.println(frutas);

		// Size
		int total = frutas.size();
		System.out.println("Total de itens: " + total);

		// Clear
		frutas.clear();
		System.out.println("A lista de frutas está vazia");
		System.out.println(frutas);

	}
}
