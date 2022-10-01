package exercicioAvaliativo.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TopicoJava8 {

	public static void main(String[] args) {
		String pokemon1 = "Pikachu";
		String pokemon2 = "Charmander";
		String pokemon3 = "Charizard";
		String pokemon4 = "Psyduck";

		ArrayList<String> pokemons = new ArrayList<>();

		pokemons.add(pokemon1);
		pokemons.add(pokemon2);
		pokemons.add(pokemon3);
		pokemons.add(pokemon4);
		System.out.println(pokemons);

		// Count
		long totalPokemons = 
				pokemons
				.stream()
				.count();
		System.out.println("Numero de pokemons: " + totalPokemons);

		// Limit
		Stream<String> novosPokemons = 
				pokemons
				.stream()
				.limit(2);
		System.out.println(novosPokemons.toString());

		// ForEach
		pokemons
		.stream()
		.forEach(e -> System.out.print(e + " "));

		// Filter
		pokemons.
		stream()
		.filter(e -> e == "Pikachu")
		.forEach(e -> System.out.print(e + " "));
		
		// Map
		pokemons
		.stream()
		.map(e -> e + "Pokemon: " + " ")
		.forEach(e -> System.out.print(e + " "));
		
	}
}