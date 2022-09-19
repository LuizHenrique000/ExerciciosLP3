package exercicioAvaliativo.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TopicoTime {

	public static void main(String[] args) {

		// LOCALTIME

		// Now
		LocalTime horaAtual = LocalTime.now();
		System.out.println(horaAtual);

		// Parse
		String horario = "14:03";
		LocalTime horarioConvertido = LocalTime.parse(horario);
		System.out.println(horarioConvertido);

		// Of
		LocalTime hora = LocalTime.of(14, 05, 12, 30);
		System.out.println(hora);

		// Para o LocalTime achei interessante usar apenas esses 3 metodos pois ele não
		// possui tantos pra demonstrar

		// LOCALDATE

		// Now
		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual);

		// Parse
		String data = "2012-09-08";
		LocalDate.parse(data);
		System.out.println(data);

		// Of
		LocalDate aniversario = LocalDate.of(2004, 11, 30);
		System.out.println(aniversario);

		// LOCALDATETIME

		// Now
		LocalDateTime dataEHora = LocalDateTime.now();
		System.out.println(dataEHora);

		// Parse
		String umaDataEHora = "2004-11-30T00:15:00";
		LocalDateTime dataeHoraConvertida = LocalDateTime.parse(umaDataEHora);
		System.out.println(dataeHoraConvertida);
		
		// Of
		LocalDateTime umaDataEUmaHora = LocalDateTime.of(dataAtual,horaAtual);
		System.out.println(umaDataEUmaHora);

	}
}
