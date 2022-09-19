package exercicioAvaliativo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TopicoException {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int numero = -1;
		while (numero == -1) {
			try {
				System.out.println("Digite um numero qualquer");
				numero = in.nextInt();
			} catch (InputMismatchException excecao) {
				System.out.println("Resposta inválida");
				in.nextLine();
			}

		}
		in.close();
	}
}