package com.fundatec.lp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundatec.lp3.enums.TipoArmadilha;
import com.fundatec.lp3.enums.TipoMagia;
import com.fundatec.lp3.enums.TipoMonstro;
import com.fundatec.lp3.models.CardArmadilha;
import com.fundatec.lp3.models.CardMagia;
import com.fundatec.lp3.models.CardMonstro;

@SpringBootApplication
public class ExercicioAvaliativo2Application {

	public static void main(String[] args) {

		SpringApplication.run(ExercicioAvaliativo2Application.class, args);
		CardMonstro cardMonstro = new CardMonstro("Dragão Branco de Olhos Azuis", "Dragão", "", "Este dragão lendário é uma poderosa máquina de destruição. Praticamente invencível, muito poucos enfrentaram esta magnífica criatura e viveram para contar a história.", "9", "3000", "2500", TipoMonstro.NORMAL);
		cardMonstro.exibirLogDeRegistro();
		
		CardMagia cardMagia = new CardMagia("Reviver Monstro","Magia","","Escolha 1 monstro em qualquer Cemitério; Invoque-o por Invocação-Especial.",TipoMagia.NORMAL);
		cardMagia.exibirLogDeRegistro();
		
		CardArmadilha cardArmadilha = new CardArmadilha("Providência Definitiva", "Armadilha", "", "Quando um Card de Magia/Armadilha, ou efeito de monstro, for ativado: descarte o mesmo tipo de card (Monstro, Magia ou Armadilha); negue a ativação e, se isso acontecer, destrua esse card.", TipoArmadilha.ANULACAO);
		cardArmadilha.exibirLogDeRegistro();
	}

}
