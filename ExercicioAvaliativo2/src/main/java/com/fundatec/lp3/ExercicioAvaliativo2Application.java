package com.fundatec.lp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fundatec.lp3.models.CardMonstro;

@SpringBootApplication
public class ExercicioAvaliativo2Application {

	public static void main(String[] args) {

		SpringApplication.run(ExercicioAvaliativo2Application.class, args);
		CardMonstro cardMonstro = new CardMonstro("Dragão Branco de Olhos Azuis", "Dragão", "", "Este dragão lendário é uma poderosa máquina de destruição. Praticamente invencível, muito poucos enfrentaram esta magnífica criatura e viveram para contar a história.", "9", "3000", "2500");
		System.out.println(cardMonstro);
	}

}
